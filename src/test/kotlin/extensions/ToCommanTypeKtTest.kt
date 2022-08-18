package extensions

import mower.domain.valueType.Command
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import toCommanType

internal class ToCommanTypeKtTest{
    @Test
    fun stringToCommanType(){
        val string = "LM"

        assertEquals(listOf(Command.L, Command.M), string.toCommanType())
    }

}