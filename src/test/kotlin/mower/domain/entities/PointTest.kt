package mower.domain.entities

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PointTest {
    @Test
    fun `has axel y and axel y`() {
        val point = Point(1, 2)

        assertEquals(1, point.axel_x)
        assertEquals(2, point.axel_y)
    }

    @Test
    fun increaseY(){
        val point = Point(1, 1).increaseY()

        assertEquals(1, point.axel_x)
        assertEquals(2, point.axel_y)
    }

    @Test
    fun decreaseY(){
        val point = Point(1, 1).decreaseY()

        assertEquals(1, point.axel_x)
        assertEquals(0, point.axel_y)
    }

    @Test
    fun increaseX(){
        val point = Point(1, 1).increaseX()

        assertEquals(2, point.axel_x)
        assertEquals(1, point.axel_y)
    }

    @Test
    fun decreaseX(){
        val point = Point(1, 1).decreaseX()

        assertEquals(0, point.axel_x)
        assertEquals(1, point.axel_y)
    }

    @Test
    fun nextLimitPointX(){
        val point = Point(2, 2).nextLimitPointX()

        assertEquals(-2, point.axel_x)
        assertEquals(2, point.axel_y)
    }

    @Test
    fun nextLimitPointY(){
        val point = Point(2, -2).nextLimitPointY()

        assertEquals(2, point.axel_x)
        assertEquals(2, point.axel_y)
    }
}
