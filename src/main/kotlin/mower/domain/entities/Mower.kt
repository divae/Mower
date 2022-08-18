package mower.domain.entities

import mower.domain.valueType.Direction

data class Mower(
    var point: Point = Point(5, 5),
    var direction: Direction = Direction.NORTH,
    val plane: Plane = Plane()
) {
    fun position(): Position = Position(point, direction, plane)

    fun rotate90Left() {
        direction = when (direction) {
            Direction.NORTH -> Direction.WEST
            Direction.SOUTH -> Direction.EAST
            Direction.EAST -> Direction.NORTH
            Direction.WEST -> Direction.SOUTH
        }
    }

    fun forward() {
        point = when (direction) {
            Direction.NORTH -> if (point.axel_y >= plane.limit) point.nextLimitPointY() else point.increaseY()
            Direction.SOUTH -> if (point.axel_y <= -plane.limit) point.nextLimitPointY() else point.decreaseY()
            Direction.EAST -> if (point.axel_x >= plane.limit) point.nextLimitPointX() else point.increaseX()
            Direction.WEST -> if (point.axel_x <= -plane.limit) point.nextLimitPointX() else point.decreaseX()
        }
    }

    fun rotate90Right(){
        direction = when (direction) {
            Direction.NORTH -> Direction.EAST
            Direction.SOUTH -> Direction.WEST
            Direction.EAST -> Direction.SOUTH
            Direction.WEST -> Direction.NORTH
        }
    }
}
