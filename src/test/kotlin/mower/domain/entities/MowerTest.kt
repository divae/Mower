package mower.domain.entities

import mower.domain.valueType.Direction
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MowerTest {

    private val initialPlane = Plane(5, 5)
    private val initialDirection = Direction.NORTH
    private val initialPoint = Point(5, 5)
    private val mower = Mower()

    @Test
    fun `knows that it is initialized in position 5 5 N`() {
        val initialPosition = Position(initialPoint, initialDirection, initialPlane)

        assertEquals(initialPosition, mower.position())
    }

    @Test
    fun `knows that your initial board size 5,5`(){
        assertEquals(initialPlane, mower.plane)
    }

    @Test
    fun `Given direction NORTH When rotate90Left Then direction is WEST`() {
        mower.direction = Direction.NORTH

        mower.rotate90Left()
        
        assertEquals(Direction.WEST, mower.position().direction)
    }

    @Test
    fun `Given direction SOUTH When rotate90Left Then direction is EAST`() {
        mower.direction = Direction.SOUTH

        mower.rotate90Left()
        
        assertEquals(Direction.EAST, mower.position().direction)
    }

    @Test
    fun `Given direction EAST When rotate90Left Then direction is NORTH`() {
        mower.direction = Direction.EAST

        mower.rotate90Left()
        
        assertEquals(Direction.NORTH, mower.position().direction)
    }

    @Test
    fun `Given direction WEST When rotate90Left Then direction is SOUTH`() {
        mower.direction = Direction.WEST
        
        mower.rotate90Left()
        
        assertEquals(Direction.SOUTH, mower.position().direction)
    }

    @Test
    fun `Given position 1,1 NORTH When forward without limit exceeded Then position is 1,2 NORTH`() {
        mower.direction = Direction.NORTH
        mower.point =  Point(1, 1)
        
        mower.forward()
        
        assertEquals(Point(1, 2), mower.position().point)
    }

    @Test
    fun `Given position 1,5 NORTH When forward with limit exceeded Then position is 1,-5 NORTH`() {
        mower.direction = Direction.NORTH
        mower.point =  Point(1, 5)
        
        mower.forward()
        
        assertEquals(Point(1, -5), mower.position().point)
    }

    @Test
    fun `Given position 1,1 SOUTH When forward without limit exceeded Then position is 1,0 SOUTH`() {
        mower.direction = Direction.SOUTH
        mower.point =  Point(1, 1)

        mower.forward()
        
        assertEquals(Point(1, 0), mower.position().point)
    }

    @Test
    fun `Given position 1,-5 SOUTH When forward with limit exceeded Then position is 1,5 SOUTH`() {
        mower.direction = Direction.SOUTH
        mower.point =  Point(1, -5)

        mower.forward()
        
        assertEquals(Point(1, 5), mower.position().point)
    }

    @Test
    fun `Given position 1,1 EAST When forward without limit exceeded Then position is 2,1 EAST`() {
        mower.direction = Direction.EAST
        mower.point =  Point(1, 1)

        mower.forward()
        
        assertEquals(Point(2, 1), mower.position().point)
    }

    @Test
    fun `Given position 5,5 EAST When forward without limit exceeded Then position is -5,5 EAST`() {
        mower.direction = Direction.EAST
        mower.point =  Point(5, 5)

        mower.forward()
        
        assertEquals(Point(-5, 5), mower.position().point)
    }

    @Test
    fun `Given position 1,1 WEST When forward without limit exceeded Then position is 0,1 EAST`() {
        mower.direction = Direction.WEST
        mower.point =  Point(1, 1)
        
        mower.forward()
        
        assertEquals(Point(0, 1), mower.position().point)
    }

    @Test
    fun `Given position -5,5 WEST When forward without limit exceeded Then position is 5,5 EAST`() {
        mower.direction = Direction.WEST
        mower.point =  Point(-5, 5)

        mower.forward()
        
        assertEquals(Point(5, 5), mower.position().point)
    }

    @Test
    fun `Given direction NORTH When rotate90Right Then direction is EAST`() {
        mower.direction = Direction.NORTH

        mower.rotate90Right()
        
        assertEquals(Direction.EAST, mower.position().direction)
    }

    @Test
    fun `Given direction SOUTH When rotate90Right Then direction is WEST`() {
        mower.direction = Direction.SOUTH

        mower.rotate90Right()

        assertEquals(Direction.WEST, mower.position().direction)
    }

    @Test
    fun `Given direction EAST When rotate90Right Then direction is SOUTH`() {
        mower.direction = Direction.EAST

        mower.rotate90Right()

        assertEquals(Direction.SOUTH, mower.position().direction)
    }

    @Test
    fun `Given direction WEST When rotate90Right Then direction is NORTH`() {
        mower.direction = Direction.WEST

        mower.rotate90Right()

        assertEquals(Direction.NORTH, mower.position().direction)
    }


}