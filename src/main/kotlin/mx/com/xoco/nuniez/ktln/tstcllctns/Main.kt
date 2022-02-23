package mx.com.xoco.nuniez.ktln.tstcllctns

fun main() {
    testSets()
    testMaps()
    testLambda()
    testHighOrderFun()
    testWordLists()
}

fun testWordLists() {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    val filteredBWords = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()
    println(filteredBWords)
    val filteredCWords = words.filter { it.startsWith("c", ignoreCase = true) }
        .shuffled()
        .take(1)
    println(filteredCWords)
}

fun testHighOrderFun() {
    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())
    println(peopleNames.sortedWith{str1: String, str2: String -> str1.length - str2.length})
}

fun testLambda() {
    //val triple: (Int) -> Int = { a: Int -> a * 3 }
    val triple: (Int) -> Int = { it * 3 }
    println(triple(5))

    /**
     * see: https://play.kotlinlang.org/byExample/04_functional/02_Lambdas
     */
    // All examples create a function object that performs upper-casing.
    // So it's a function from String to String

    val upperCase1: (String) -> String = { str: String -> str.uppercase() } // 1

    val upperCase2: (String) -> String = { str -> str.uppercase() }         // 2

    val upperCase3 = { str: String -> str.uppercase() }                     // 3

    // val upperCase4 = { str -> str.uppercase() }                          // 4

    val upperCase5: (String) -> String = { it.uppercase() }                 // 5

    val upperCase6: (String) -> String = String::uppercase                  // 6

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))
}

fun testMaps() {
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 38,
        "Ann" to 23
    )

    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    peopleAges["Fred"] = 31
    println(peopleAges)

    testCollectionsFun(peopleAges)
}

fun testCollectionsFun(peopleAges: MutableMap<String, Int>) {
    peopleAges.forEach { print("${it.key} is ${it.value}, ") }

    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", "))

    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames)
}

fun testSets() {
    val numbers = listOf(0,3,8,4,0,5,5,8,9,2)
    println("list: $numbers")
    println("sorted: ${numbers.sorted()}")

    val setOfNumbers = numbers.toSet()
    println("set: $setOfNumbers")

    val set1 = setOf(1,2,3)
    val set2 = mutableSetOf(3,2,1)
    println("$set1 == $set2: ${set1 == set2}")
    println("contains 7: ${setOfNumbers.contains(7)}")
}
