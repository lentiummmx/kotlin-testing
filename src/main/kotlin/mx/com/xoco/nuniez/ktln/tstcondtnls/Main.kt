package mx.com.xoco.nuniez.ktln.tstcondtnls

import mx.com.xoco.nuniez.ktln.tstkt.domain.Dice

fun main_deprected() {
    var num = 5
    num = 3
    num = 4
    if (num > 4 ){
        println("The variable is greater than 4")
    } else if (num == 4){
        println("The variable is equal to 4")
    } else {
        println("The variable is less than 4")
    }
}

fun main() {
    var myFirstDice = Dice(6, "white")
    myFirstDice = Dice(8, "black")
    //myFirstDice = Dice(4, "magenta")
    val rollResult = myFirstDice.roll()
    println("Your ${myFirstDice.numSides} sided dice rolled ${rollResult}!")

    val luckyNumber = 4
    /*
    if (rollResult == luckyNumber) {
        println("You win!")
    } else {
        println("You didn't win, try again!")
    }
    */
    /*
    if (rollResult == luckyNumber) {
        println("You win!")
    } else if (rollResult == 1) {
        println("So sorry! You rolled a 1. Try again!")
    } else if (rollResult == 2) {
        println("Sadly, you rolled a 2. Try again!")
    } else if (rollResult == 3) {
        println("Unfortunately, you rolled a 3. Try again!")
    } else if (rollResult == 5) {
        println("Don't cry! You rolled a 5. Try again!")
    } else {
        println("Apologies! You rolled a 6. Try again!")
    }
    */
    when (rollResult) {
        luckyNumber -> println("You win!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! You rolled a 6. Try again!")
        else -> println("Unfortunately, you rolled a ${rollResult}. Try again!")
    }
}