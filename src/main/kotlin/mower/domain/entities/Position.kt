package mower.domain.entities

import mower.domain.valueType.Direction

data class Position(
    var point: Point,
    var direction: Direction,
    val plane: Plane
) {
    val show: String = "${this.point.axel_x} ${this.point.axel_y} ${direction.code}"
}


