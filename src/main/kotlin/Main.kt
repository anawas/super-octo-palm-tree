fun main() {
    val numOfSymbols = 20
    val generator = SpellGenerator()

    print("Wie soll ich Sie nennen? ")
    val name = readln()
    for (i in 1..numOfSymbols) {
        print("-")
    }
    println()
    println("Hallo $name")
    println(generator.getSpell())
    for (i in 1..numOfSymbols) {
        print("-")
    }
    println()
}