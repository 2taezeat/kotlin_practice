interface Calculable {
    fun calculate(x: Double, y: Double) : Double // 추상메서드
}

class Add : Calculable{ // 인터페이스를 구현하는 Add 클래스
    override fun calculate(x: Double, y: Double): Double {
        return x + y
    }
}
class Subtract : Calculable{
    override fun calculate(x: Double, y: Double): Double {
        return x - y
    }
}

fun doCalculation(c: Calculable, x: Double, y: Double) = c.calculate(x, y)

fun main(args : Array<String>) {
    var add = Add()
    var sub = Subtract()

    var res1 = doCalculation(add, 3.0, 4.0)
    var res2 = doCalculation(sub, 10.0, 4.0)

    println(res1)
    println(res2)
}
