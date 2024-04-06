package io.github.fate_grand_automata.ui.launcher

sealed class ScriptLauncherResponse {
    data object Cancel : ScriptLauncherResponse()

    data object FP : ScriptLauncherResponse()

    data class Lottery(
        val giftBox: GiftBox?,
        val returnToLottery: Boolean,
    ) : ScriptLauncherResponse()

    data class GiftBox(
        val maxGoldEmberStackSize: Int,
        val maxGoldEmberTotalCount: Int
    ) : ScriptLauncherResponse()


    data object CEBomb : ScriptLauncherResponse()
    data object SupportImageMaker : ScriptLauncherResponse()
    data object Battle : ScriptLauncherResponse()

    data class Skill(
        val shouldUpgradeSkillOne: Boolean,
        val skillOneUpgradeValue: Int,
        val shouldUpgradeSkillTwo: Boolean,
        val skillTwoUpgradeValue: Int,
        val shouldUpgradeSkillThree: Boolean,
        val skillThreeUpgradeValue: Int,
    ) : ScriptLauncherResponse()

    data object ServantEnhancement : ScriptLauncherResponse()

}

class ScriptLauncherResponseBuilder(
    val canBuild: () -> Boolean,
    val build: () -> ScriptLauncherResponse
)