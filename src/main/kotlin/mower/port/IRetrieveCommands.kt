package mower.port

import mower.domain.valueType.Command

interface IRetrieveCommands {
    fun generate() : List<Command>
}