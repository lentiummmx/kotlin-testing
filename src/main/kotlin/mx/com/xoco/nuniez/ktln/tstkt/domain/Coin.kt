package mx.com.xoco.nuniez.ktln.tstkt.domain

class Coin {
    var sides = arrayOf("heads", "tails")

    fun flip(): String {
        return sides[(0..1).random()]
    }
}