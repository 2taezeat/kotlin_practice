sealed class Quiz(val question: String)

enum class AnswerType { O, X  }

// OX 퀴즈
class OXQuiz(question : String, val answer: AnswerType) : Quiz(question)

// N지선다 퀴즈
class MultiChoiceQuiz(question : String, val answer: String, val choices: List<String>) : Quiz(question)

// 단답식 퀴즈
class ShortAnswerQuiz(question : String, val answer: String, val alternatives : List<String>?,
                      val sanitize : (String) -> String = { it.trim() }) : Quiz(question)



fun main(args : Array<String>) {
    val quizzes = mutableListOf<Quiz>()

    quizzes.add(OXQuiz("대한민국의 수도는 서울이다.",AnswerType.O))
    quizzes.add(OXQuiz("미국의 수도는 서울이다.",AnswerType.X))
    quizzes.add(MultiChoiceQuiz("대한민국의 수도는 ?","서울",listOf("서울","대전","대구","부산")))
    quizzes.add(ShortAnswerQuiz("사과를 뜻하는 영단어는 ?","apple",null){it.trim().toLowerCase()})
    quizzes.add(ShortAnswerQuiz("코틀린을 영어로 ?","Kotlin",listOf("코틀린","kotlin")))
    var answerCount = 0
    var i : Int = 1
    for (q in quizzes){
        var question : String
        //var answer : String
        question = q.question
        println("${i}. ${question}")



        when(q){
            is OXQuiz -> {
                print("> ")
                var answer = readLine()!!

                val correct = (answer.toLowerCase() == "o" && q.answer == AnswerType.O) ||
                        (answer.toLowerCase() == "x" && q.answer == AnswerType.X)
                if (correct) {
                    answerCount++
                    println("정답입니다.")
                } else {
                    println("오답입니다.")
                }
            }

            is MultiChoiceQuiz -> {
                for ((idx, c) in q.choices.withIndex()) {
                    println("${idx + 1}. ${c}")
                }
                print("> ")

                var answer = readLine()!!
                var selected = answer.toInt()
                if (selected == (q.choices.indexOf(q.answer) + 1)) {
                    answerCount++
                    println("정답입니다.")
                } else {
                    println("오답입니다.")
                }

            }

            is ShortAnswerQuiz -> {
                print("> ")
                var answer = q.sanitize(readLine()!!)

                if (answer == q.answer || answer in (q.alternatives ?: listOf())) {
                    answerCount++
                    println("정답입니다.")
                } else {
                    println("오답입니다.")
                }

            }
        }
        i++
    }

    println("맞은 개수 ${answerCount}: / 총 문제 개수 : ${i-1}")



}