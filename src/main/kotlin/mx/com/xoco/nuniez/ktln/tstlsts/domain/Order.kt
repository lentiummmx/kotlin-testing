package mx.com.xoco.nuniez.ktln.tstlsts.domain

class Order(private val orderNumber: Int) {
    private val items: MutableList<Item> = mutableListOf()
    private var totalPrice: Double = 0.0

    fun addItem(newItem: Item): Order {
        items.add(newItem)
        return this
    }

    fun addMultipleItems(newItems: List<Item>): Order {
        items.addAll(newItems)
        return this
    }

    fun printOrderSummary(){
        println(this)

        for (item in items) {
            //println(item.toString() + ": $${item.price}")
            println("$item: $${item.price}")
            totalPrice+= item.price
        }

        println("Total: $$totalPrice")
    }

    override fun toString(): String {
        return "Order #$orderNumber"
    }

}