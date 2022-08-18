package mower.domain.usecase

import consoleapp.CommandLineInput
import consoleapp.SendPosition
import mower.domain.entities.Mower
import mower.domain.entities.Plane
import mower.domain.entities.Point
import mower.domain.valueType.Command
import mower.domain.valueType.Direction
import mower.port.IRetrieveCommands
import mower.port.ITransmitPosition
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito


internal class OperationUseCaseTest {
    @Mock
    val sendPositionMock: ITransmitPosition = SendPosition()

    @Mock
    val command: IRetrieveCommands = CommandLineInput()

    @Test
    @Disabled("Mock command interface")
    fun `Given point 1 3 NORTH with scenery 5 5 When retrieve command LMLMLMLMM commands to position 1 3 N`() {
        val plane = Plane(5, 5)
        val mower = Mower(Point(1, 2), direction = Direction.NORTH, plane = plane)
        val commands = listOf(
            Command.L,
            Command.M,
            Command.L,
            Command.M,
            Command.L,
            Command.M,
            Command.L,
            Command.M,
            Command.M
        )
        Mockito.`when`(command.generate()).thenReturn(commands)

        OperationUseCase(mower, command, sendPositionMock).move()

        assertEquals("1 3 N", mower.position().show)
    }

    @Test
    @Disabled("Mock command interface")
    fun `Given point 3 3 EAST When retrieve command MMRMMRMRRM commands to position 5 5 N`() {
        val mower = Mower(Point(3, 3), direction = Direction.EAST)
        val commands = listOf(
            Command.M,
            Command.M,
            Command.R,
            Command.M,
            Command.M,
            Command.R,
            Command.M,
            Command.R,
            Command.R,
            Command.M
        )
        Mockito.`when`(command.generate()).thenReturn(commands)

        OperationUseCase(mower, command, sendPositionMock).move()

        assertEquals("5 1 E",  mower.position().show)
    }



}