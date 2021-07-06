//interface Calculable{
//    fun calculate(x:Double, y:Double): Double
//}

fun main(args : Array<String>) {
    var mul = object : Calculable{
        override fun calculate(x: Double, y: Double): Double {
            return x*y
        }
    }
    var div = object : Calculable{
        override fun calculate(x: Double, y: Double): Double {
            return x/y
        }
    }

    var res3 = doCalculation(mul, 3.0, 4.0)
    var res4 = doCalculation(div,10.0, 4.0)
    println(res3)
    println(res4)
}