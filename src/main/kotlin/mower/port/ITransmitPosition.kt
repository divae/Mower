package mower.port

import mower.domain.entities.Position

interface ITransmitPosition {
    fun transmit(position: Position) = println("I'm in position ${position.show}")
}