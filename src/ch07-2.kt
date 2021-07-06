data class Moive(var name:String, var genre: String, var rate: Double)

fun main(args : Array<String>) {
    var moive = Moive("겨울왕국", "Animation",9.0)
    println(moive)
}