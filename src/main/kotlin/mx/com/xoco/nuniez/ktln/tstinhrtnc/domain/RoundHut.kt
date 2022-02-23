package mx.com.xoco.nuniez.ktln.tstinhrtnc.domain

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Dwelling with a circular floorspace
 *
 * @param residents Current number of residents
 * @param radius Radius
 */
open class RoundHut(residents: Int, private val radius: Double): Dwelling(residents) {
    override val buildingMaterial: String = "Straw"
    override val capacity: Int = 4

    /**
     * Calculates floor area for a round dwelling.
     *
     * @return floor area
     */
    override fun floorArea(): Double {
        return PI * radius.pow(2)
    }

    /**
     *  Calculates the max length for a square carpet
     *  that fits the circular floor.
     *
     * @return length of carpet
     */
    fun calculateMaxCarpetSize(): Double {
        val diameter = radius * 2;
        return sqrt(diameter.pow(2) / 2)
    }
}