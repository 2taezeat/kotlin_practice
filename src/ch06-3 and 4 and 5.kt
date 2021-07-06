class Fraction(var n:Int, var d:Int){
    fun toDouble() : Double {
        return n.toDouble() / d
    }

    override fun toString(): String {
        return "${n}/${d}"
    }

    private fun lcm(a: Int, b: Int) : Int {
        return (a * b) / gcd(a, b)
    }

    private fun gcd(a: Int, b: Int) : Int {
        var gcd = 1
        for(i in 2..kotlin.math.min(a, b)) {
            if(a % i == 0 && b % i == 0) {
                gcd = i
            }
        }
        return gcd
    }

    infix fun add(f: Fraction) : Fraction {
        if (this.d == f.d){
            return Fraction(this.n + f.n, this.d)
        }
        else
        {
            var l = lcm(this.d,f.d)
            return Fraction((this.n * (l / this.d)) + (f.n * (l / f.d)), l)
        }
    }
//    override fun toString(): String {
//        return "${n}/${d}"
//    }

}


fun main(){
    val f1 = Fraction(3,4)
    val f2 = Fraction(1,10)
    println(f1.toDouble())

    // 일반적인 메소드 호출 방식으로 호출
    var f3 = f1.add(f2)
    //var f4 = f1.sub(f2)

    println(f3.toDouble())
    //println(f4)
    println(f1 add f2)

}