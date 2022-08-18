package mower.domain.entities

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PlaneTest {

    @Test
    fun `default size is 5,5`() {
        assertEquals(arrayListOf(5, 5), Plane().size)
    }

    @Test
    fun `Put axel limit`(){
        assertEquals(5, Plane().limit)
    }
}