import mower.domain.valueType.Command

fun String.toCommanType(): List<Command> {
    val commands = mutableListOf<Command>()
    this.forEach {
        commands += Command.valueOf(it.toString())
    }
    return commands
}
