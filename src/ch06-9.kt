interface Shape {
    val area: Double
    val perimeter : Double
}

class Rectangle(var width: Double, var height: Double) : Shape {
    override val area: Double
        get() = width * height
    override val perimeter: Double // 둘레
        get() = (width * 2) + (height * 2)
}

class Circle(var radius: Double) : Shape {
    override val area: Double = Math.PI * (radius * radius)
    override val perimeter: Double = Math.PI * (2 * radius)
}

fun main(args : Array<String>) {
    var r = Rectangle(10.0, 20.0)
    println(r.area)
    println(r.perimeter)

    var c = Circle(10.0)
    println(c.area)
    println(c.perimeter)
}