fun main(args : Array<String>) {
    val names = listOf("이황", "김철수", "신사임당", "이영희", "길동", "김영수")

    // 1.
    var f1 = names.map{it.length}
    println(f1)

    // 2.
    var filtered2 = names.filter{it.startsWith("김")}
    println(filtered2)

    // 3.
    var filtered3 = names.filter{it.length == 2}
    println(filtered3)

    var f4 = names.count{it.length >= 3}
    println(f4)

}