data class MyTriple<T>(var a: T, var b: T, var c: T)


fun main(args : Array<String>) {
    val triple = MyTriple(1,2.0,"Hello")
    println(triple)
}