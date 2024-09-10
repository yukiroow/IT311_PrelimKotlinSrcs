package oopDemo

interface Drivable {
    fun drive()
    fun stop() {
        println("Stopping the vehicle.")
    }
}

class Car : Drivable {
    override fun drive() {
        println("Car is driving.")
    }

    override fun stop() {
        println("Car has stopped.")
    }
}

class Bicycle : Drivable {
    override fun drive() {
        println("Bicycle is pedaling.")
    }

    // Using the default stop() from the interface
}

fun main() {
    val car: Drivable = Car()
    val bike: Drivable = Bicycle()

    car.drive()  // Output: Car is driving.
    car.stop()   // Output: Car has stopped.

    bike.drive()  // Output: Bicycle is pedaling.
    bike.stop()   // Output: Stopping the vehicle. (default implementation)
}