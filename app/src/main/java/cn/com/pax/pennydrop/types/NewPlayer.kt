package cn.com.pax.pennydrop.types

import androidx.databinding.ObservableBoolean
import cn.com.pax.pennydrop.game.AI

class NewPlayer(
    var playerName: String = "",
    val isHuman: ObservableBoolean = ObservableBoolean(true),
    val canBeRemoved: Boolean = true,
    val canBeToggled: Boolean = true,
    var isIncluded: ObservableBoolean = ObservableBoolean(!canBeToggled),
    var selectedAIPosition: Int = -1
) {
    fun selectedAI() = if (!isHuman.get()) {
        AI.basicAI.getOrNull(selectedAIPosition)
    } else {
        null
    }
}