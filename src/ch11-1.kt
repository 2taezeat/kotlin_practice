import java.io.File
import java.util.Date

fun main(args : Array<String>) {
    val calcFile = File("calc.txt")

//    if(calcFile.createNewFile())
//    {
//        calcFile.writeText("+")
//        calcFile.writeText("1.0")
//        calcFile.writeText("2.0")
//    }

    var lineNum = 1
    if (calcFile.exists())
    {
        var lines : List<String> = calcFile.readLines()

        var op = lines[0]
        val result = when(op)
        {
            "+" -> lines[1].toDouble() + lines[2].toDouble()
            "-" -> lines[1].toDouble() - lines[2].toDouble()
            "*" -> lines[1].toDouble() * lines[2].toDouble()
            "/" -> lines[1].toDouble() / lines[2].toDouble()
            else -> null
        }

        println(result)

    }
    else{
        println("no file!")
    }

}
