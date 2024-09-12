package oopDemo

interface Drivable {
    fun drive()
    fun stop() {
        println("no movement.")
    }
}

class Car : Drivable {
    override fun drive() {
        println("You are now part of the traffic.")
    }

    override fun stop() {
        println("Car no movement.")
    }
}

class Bicycle : Drivable {
    override fun drive() {
        println("What a great exercise!")
    }

    // Using the default stop() from the interface
}

fun main() {
    val car: Drivable = Car()
    val bike: Drivable = Bicycle()

    car.drive()
    car.stop()

    bike.drive()
    bike.stop()
}