fun Double.toPair(): Pair<Int, Double>{
    var p1 = this.toInt()
    var p2 = this - p1
    return p1 to p2
}

fun main(args : Array<String>) {
    var d1 = 1.5
    var d2 = 3.14159
    println(d1.toPair())
    println(d2.toPair())

}