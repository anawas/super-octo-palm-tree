fun main() {
    val numOfSymbols = 20
    print("Wie soll ich dich nennen? ")
    val name = readln()
    for (i in 1..numOfSymbols) {
        print("-")
    }
    println()
    println("Hallo $name")
    println("Heute ist ein wundervoller Tag")
    for (i in 1..numOfSymbols) {
        print("-")
    }
}