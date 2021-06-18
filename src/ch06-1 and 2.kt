class Point(var x:Double, var y:Double){
    fun calculateDistanceFrom(other: Point):Double {
        val distance = Math.sqrt(Math.pow(this.x - other.x, 2.0) + Math.pow(this.y - other.y, 2.0))
        return distance
    }

}


fun main(){
    val p1 = Point(0.0, 0.0)
    val p2 = Point(5.0, 5.0)
    println(p1.calculateDistanceFrome(p2))
}