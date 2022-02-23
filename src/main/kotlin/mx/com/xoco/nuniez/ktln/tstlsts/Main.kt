package mx.com.xoco.nuniez.ktln.tstlsts

import mx.com.xoco.nuniez.ktln.tstlsts.domain.Noodles
import mx.com.xoco.nuniez.ktln.tstlsts.domain.Order
import mx.com.xoco.nuniez.ktln.tstlsts.domain.Vegetables

fun main() {
    inmutableListExamples()
    mutableListExample()
    loopingThroughList()

    runRestaurantExample()
}

fun runRestaurantExample() {
    val noodles = Noodles()
    val vegetables = Vegetables("Cabbage", "Sprouts", "Onion")
    val vegetables2 = Vegetables()
    // val vegetables = Vegetable(listOf("Cabbage", "Sprouts", "Onion"))
    println(noodles)
    println(vegetables)
    println(vegetables2)

    val ordersList = mutableListOf<Order>()

    val order1 = Order(1)
    order1.addItem(Noodles())
    //order1.printOrderSummary()
    ordersList.add(order1)

    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    //order2.printOrderSummary()
    ordersList.add(order2)

    val order3 = Order(3)
    order3.addMultipleItems(listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery")))
    //order3.printOrderSummary()
    ordersList.add(order3)

    val order4 = Order(4).addMultipleItems(listOf(Noodles(), Vegetables("Cabbage", "Onion")))
    //order4.addMultipleItems(listOf(Noodles(), Vegetables("Cabbage", "Onion")))
    //order4.printOrderSummary()
    ordersList.add(order4)

    val order5 = Order(5)
    order5.addMultipleItems(listOf(Noodles(), Noodles()))
    order5.addItem(Vegetables("Spinach"))
    //order5.printOrderSummary()
    //ordersList.add(order5)
    ordersList.add(Order(5)
        .addMultipleItems(listOf(Noodles(), Noodles()))
        .addItem(Vegetables("Spinach"))
    )

    for (order in ordersList) {
        order.printOrderSummary()
        println()
    }
}

fun loopingThroughList() {
    val guestsPerFamily = listOf(2,4,1,3)
    var totalGuests = 0

    var index = 0
    while (index < guestsPerFamily.size) {
        totalGuests += guestsPerFamily[index]
        index++
    }
    println("Total Guest Count: $totalGuests")

    val names = listOf("Jessica", "Henry", "Alicia", "Jose")
    for (name in names) {
        println("$name - Number of characters: ${name.length}")
    }
    //for (item in list) print(item) // Iterate over items in a list
    for (item in 'b'..'g') print(item) // Range of characters in an alphabet
    println()
    for (item in 1..5) print(item) // Range of numbers
    println()
    for (item in 5 downTo 1) print(item) // Going backward
    println()
    for (item in 3..6 step 2) print(item) // Prints: 35
    println()
}

fun mutableListExample() {
    //val entrees: MutableList<String> = mutableListOf()
    val entrees = mutableListOf<String>()
    println("Entrees: $entrees")

    println("Add noodles: ${entrees.add("noodles")}")
    println("Entrees: $entrees")

    println("Add spaghetti: ${entrees.add("spaghetti")}")
    println("Entrees: $entrees")

    val moreItems = listOf("ravioli", "lasagna", "fettuccine")
    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")

    //entrees.add(0)  // error

    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
    println("Entrees: $entrees")

    println("Remove rice: ${entrees.remove("rice")}")
    println("Entrees: $entrees")

    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")

    entrees.clear()
    println("Entrees: $entrees")

    println("Empty?: ${entrees.isEmpty()}")
}

fun inmutableListExamples() {
    val numbers: List<Int> = listOf(1,2,3,4,5,6)
    println("List: $numbers")
    println("Size: ${numbers.size}")

    /*
    for (number in numbers) {
        println("Element in position $i: ${numbers[i]}")
    }
     */
    var i = 0
    while (i < numbers.size) {
        //println("Element in position $i: ${numbers.get(i)}")
        println("Element in position $i: ${numbers[i]}")
        i++
    }

    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")

    println("Contains 4? ${numbers.contains(4)}")
    println("Contains 7? ${numbers.contains(7)}")

    val colors = listOf("green", "orange", "blue")
    //colors.add("purple")  // error
    //colors[0] = "yellow" // error

    println("Reversed list of colors: ${colors.reversed()}")
    println("Sorted list of colors: ${colors.sorted()}")

    val oddNumbers = listOf(5,3,7,1)
    println("List: $oddNumbers")
    println("Sorted list: ${oddNumbers.sorted()}")
}
