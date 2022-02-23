/**
 * Program that implements classes for different kinds of dwellings.
 * Shows how to:
 * Create class hierarchy, variables and functions with inheritance,
 * abstract class, overriding, and private vs. public variables.
 */

package mx.com.xoco.nuniez.ktln.tstinhrtnc

import mx.com.xoco.nuniez.ktln.tstinhrtnc.domain.RoundHut
import mx.com.xoco.nuniez.ktln.tstinhrtnc.domain.RoundTower
import mx.com.xoco.nuniez.ktln.tstinhrtnc.domain.SquareCabin

fun main() {
    val squareCabin = SquareCabin(6, 50.0)
    /*
    println("\nSquare Cabin\n============")
    println("Capacity: ${squareCabin.capacity}")
    println("Material: ${squareCabin.buildingMaterial}")
    println("Has room? ${squareCabin.hasRoom()}")
     */
    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Has room? ${hasRoom()}")
        getRoom()
        //println("Floor area: ${floorArea()}")
        println("Floor area: %.2f".format(floorArea()))
    }

    val roundHut = RoundHut(3, 10.0)
    with(roundHut) {
        println("\nRound Hut\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Has room? ${hasRoom()}")
        getRoom()
        //println("Floor area: ${floorArea()}")
        println("Floor area: %.2f".format(floorArea()))
        //println("Carpet size: ${calculateMaxCarpetSize()}")
        println("Carpet size: %.2f".format(calculateMaxCarpetSize()))
    }

    val roundTower = RoundTower(4, 15.5)
    with(roundTower) {
        println("\nRound Hut\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Has room? ${hasRoom()}")
        getRoom()
        //println("Floor area: ${floorArea()}")
        println("Floor area: %.2f".format(floorArea()))
        //println("Carpet size: ${calculateMaxCarpetSize()}")
        println("Carpet size: %.2f".format(calculateMaxCarpetSize()))
    }
}