package mx.com.xoco.nuniez.ktln.tstkt.domain

class Dice(val numSides: Int, val color: String) {
    //var sides = 6

    fun rollDeprecated(): Int {
        val randomNumber = (1..numSides).random()
        println(randomNumber)
        return randomNumber
    }

    fun roll(): Int {
        return (1..numSides).random()
    }
}