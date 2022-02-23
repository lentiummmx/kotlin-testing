import mx.com.xoco.nuniez.ktln.tstkt.domain.Coin
import mx.com.xoco.nuniez.ktln.tstkt.domain.Dice

fun main(args: Array<String>) {
    //val diceRange: IntRange = 1..6
    val diceRange = 1..6
    val randomNumber = diceRange.random()
    println("Random number: ${randomNumber}")

    val myFirstDice = Dice(6, "blue")
    //println(myFirstDice.sides)
    //val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.color} ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")

    val mySecondDice = Dice(20, "red")
    //diceRoll = mySecondDice.roll()
    println("Your ${mySecondDice.color} ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")

    val myCoin = Coin()
    println("Throwing the coin I got: ${ myCoin.flip() }")
}



