package mower.domain.usecase

import mower.domain.entities.Mower
import mower.domain.valueType.Command
import mower.port.IRetrieveCommands
import mower.port.ITransmitPosition

class OperationUseCase(
    private val mower: Mower = Mower(),
    private val readCommand: IRetrieveCommands,
    private val sendPosition: ITransmitPosition
) : IOperations {

    override fun move() {
        readCommand.generate().forEach {
            when (it) {
                Command.L -> mower.rotate90Left()
                Command.M -> mower.forward()
                Command.R -> mower.rotate90Right()
            }
        }
        sendPosition.transmit(mower.position())
    }

}

