class SpellGenerator {
    val messages = listOf("Heute ist ein wundervoller Tag", "Nutze den Tag", "Heute ist dein Glückstag")
    fun getSpell(): String {
        return messages.random()
    }
}