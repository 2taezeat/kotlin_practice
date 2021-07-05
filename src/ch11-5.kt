import java.io.*
import java.time.LocalDateTime

//data class Diary(var content: String) : Serializable

fun main(args : Array<String>) {
    // Q1) 임의의 파일을 열고 내용을 키보드로 입력받아 파일에 쓰도록하는 프로그램 작성 (/quit을 입력할 경우 프로그램 종료)
    // Q2) /clear를 입력할 경우 해당 내용을 모두 지우도록 명령어 추가
    val today = LocalDateTime.now()
    val year = today.year
    val month = today.month.value
    val day = today.dayOfMonth

    var diaryfile = File("diary_$year-$month-$day.bin")

    //var lines : List<String> = diaryfile.readLines()

    ObjectInputStream(FileInputStream(diaryfile)).use{
        val d1FromFile = it.readObject() as Diary
        println(d1FromFile.content)

    }



}