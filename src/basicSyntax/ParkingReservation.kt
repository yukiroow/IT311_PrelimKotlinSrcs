package basicSyntax

fun main() {
    val totalSpots = 50
    var reservedSpots = 0
    var isRunning = true

    println("Baguio Parking Reservation System")
    println("1. Make Reservation")
    println("2. Check Available Spots")
    println("3. Exit")

    while (isRunning) {
        print("\nEnter your choice (1-3): ")
        val choice = readLine()

        when (choice) {
            "1" -> {
                if (reservedSpots < totalSpots) {
                    reservedSpots++
                    println("Reservation made. Spots left: ${totalSpots - reservedSpots}")
                } else {
                    println("Sorry, no spots available.")
                }
            }
            "2" -> {
                println("Available spots:")
                for (i in (reservedSpots + 1)..totalSpots) {
                    println("Spot $i is available")
                }
                println()
            }
            "3" -> {
                println("Thank you for using the Parking Reservation System.")
                isRunning = false
            }
            else -> {
                println("Invalid option. Please try again.")
            }
        }
    }
}
