import kotlin.random.Random


fun rollDice() : Int {
    return Random.nextInt(6) + 1
}

// 표현식을 대입하는 형태로 정의한 rollDice 함수
// fun rollDice() = Random.nextInt(6) + 1
fun main(args : Array<String>) {
    var num = rollDice()
    println(num)
}