package mx.com.xoco.nuniez.ktln.tstmultithrdconcry

import kotlinx.coroutines.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    //firstRun()
    //secondRun()
    //thirdRun()
    //fourthRun()
    //fifthRun()
    //sixthRun1()
    sixthRun2()
}

fun sixthRun1() {
    val states = arrayOf("Starting", "Doing Task 1", "Doing Task 2", "Ending")
    repeat(3) {
        runBlocking {
            println("${Thread.currentThread()} has started")
            for (i in states) {
                async {
                    println("${Thread.currentThread()} - $i")
                    delay(5000)
                }
            }
        }
    }
}

fun sixthRun2() {
    val states = arrayOf("Starting", "Doing Task 1", "Doing Task 2", "Ending")
    repeat(3) {
        GlobalScope.launch {
            println("${Thread.currentThread()} has started")
            for (i in states) {
                println("${Thread.currentThread()} - $i")
                delay(5000)
            }
        }
    }
}

fun fifthRun() {
    runBlocking {
        //val num1 = getValue()
        val num1 = async { getValue() }
        //val num2 = getValue()
        val num2 = async { getValue() }
        //println("result of num1 + num2 is ${num1 + num2}")
        println("result of num1 + num2 is ${num1.await() + num2.await()}")
    }
}

val formatter = DateTimeFormatter.ISO_LOCAL_TIME
val time = { formatter.format(LocalDateTime.now())}

suspend fun getValue(): Double {
    println("entering getValue() at ${time()}")
    delay(3000)
    println("leaving getValue() at ${time()}")
    return Math.random()
}

fun fourthRun() {
    repeat(3) {
        GlobalScope.launch {
            println("Hi from ${Thread.currentThread()}")
        }
    }
}

fun thirdRun() {
    var count = 0
    for (i in 1..50) {
        Thread {
            count += 1
            println("Thread: $i count: $count")
        }.start()
    }
}

fun firstRun() {
    val thread = Thread {
        println("${Thread.currentThread()} has run.")
    }
    thread.start()
}

fun secondRun() {
    val states = arrayOf("Starting", "Doing task 1", "Doing Task 2", "Ending")
    repeat(3) {
        Thread {
            println("${Thread.currentThread()} has started")
            for (i in states) {
                println("${Thread.currentThread()} - $i")
                Thread.sleep(5000)
            }
        }.start()
    }
}
