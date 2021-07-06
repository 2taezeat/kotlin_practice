fun String.countSpace(): Int{
    var count = 0
    for (c in this)
    {
        if (c == ' ') count++
    }
    return count
}

fun main(args : Array<String>) {
    println("Hello World".countSpace())
    println("Hello W O R L D Kotlin".countSpace())
}