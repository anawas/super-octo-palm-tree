fun main() {
    val messages = listOf("Heute ist ein wundervoller Tag", "Nutze den Tag", "Heute ist dein Glückstag")
    val numOfSymbols = 20

    print("Wie soll ich dich nennen? ")
    val name = readln()
    for (i in 1..numOfSymbols) {
        print("-")
    }
    println()
    println("Hallo $name")
    println(messages.random())
    for (i in 1..numOfSymbols) {
        print("-")
    }
}