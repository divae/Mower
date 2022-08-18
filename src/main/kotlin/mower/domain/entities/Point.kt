package mower.domain.entities

data class Point(
    var axel_x: Int,
    var axel_y: Int
) {
    fun increaseY(): Point {
        axel_y += 1
        return this
    }

    fun decreaseY(): Point {
        axel_y -= 1
        return this
    }

    fun increaseX(): Point {
        axel_x += 1
        return this
    }

    fun decreaseX(): Point {
        axel_x -= 1
        return this
    }

    fun nextLimitPointX(): Point {
        axel_x *= -1
        return this
    }

    fun nextLimitPointY(): Point {
        axel_y *= -1
        return this
    }
}