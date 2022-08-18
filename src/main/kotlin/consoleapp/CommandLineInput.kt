package consoleapp

import mower.domain.valueType.Command
import mower.port.IRetrieveCommands
import toCommanType

class CommandLineInput: IRetrieveCommands {
    override fun generate(): List<Command> {
        println("Put commands (L, M , R): ")
        val inputText = readLine()
        return inputText!!.toCommanType()
    }
}