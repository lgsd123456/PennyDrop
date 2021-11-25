package cn.com.pax.pennydrop.types

import cn.com.pax.pennydrop.game.AI

data class Player(
    val playerName: String = "",
    val isHuman: Boolean = true,
    val selectedAI: AI? = null
) {
    var pennies: Int = defaultPennyCount

    fun addPennies(count: Int = 1) {
        pennies += count
    }
    var isRooling: Boolean = false
    companion object {
        const val defaultPennyCount = 10
    }
}

