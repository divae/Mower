package consoleapp

import mower.domain.usecase.IOperations
import mower.domain.usecase.OperationUseCase
import mower.port.IRetrieveCommands
import mower.port.ITransmitPosition

fun main() {

    val readCommand: IRetrieveCommands = CommandLineInput()
    val sendPosition: ITransmitPosition = SendPosition()
    //TODO use dependencies injection to remove use case
    val evaOperations: IOperations = OperationUseCase(
        readCommand = readCommand,
        sendPosition = sendPosition
    )

    while (true){
        evaOperations.move()
    }

}

