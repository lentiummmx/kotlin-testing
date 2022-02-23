package mx.com.xoco.nuniez.ktln.tstlsts.domain

//class Vegetables(val topping1: String, val topping2: String, val topping3: String):
//class Vegetables(val toppings: List<String>):
class Vegetables(vararg val toppings: String):
    Item("Vegetables", 5.0) {

    override fun toString(): String {
        if (toppings.isEmpty()) {
            return "${super.toString()} Chef's Choice"
        }
        return super.toString() + " " + toppings.joinToString()
    }

}