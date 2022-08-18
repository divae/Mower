package mower.domain.entities

import mower.domain.valueType.Direction
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PositionTest {

    @Test
    fun show() {
        assertEquals("1 3 N", Position(point = Point(1, 3), Direction.NORTH, plane = Plane()).show)
    }

}