package mower.domain.entities

data class Plane(
    val x:Int = 5,
    val y:Int = 5

) {
    val size: ArrayList<Int> = arrayListOf(x,y)
    //TODO improve limit representation, The limit is both for the X and for the Y
    val limit: Int = x

}