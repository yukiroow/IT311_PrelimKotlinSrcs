package basicSyntax

fun main() {
    // Call a function :)
    printLnExample()
//    readLnExample()
//    varVsVal()
//    stringTemplatesExample()
//    ifExample()
//    forLoopExample()
}

fun printLnExample() {
    println("Burnham Parking Reservation System")
}

fun readLnExample() {
    println("Enter plate number: ")

    // Reads and stores the user input.
    val plateNumber = readln()

    print("Plate Number: ")
    print(plateNumber)
}

fun varVsVal() {
    val totalSpots = 50     // Cannot be reassigned
    var reservedSpots = 0   // Can be reassigned
    reservedSpots = 1
    print(reservedSpots)
}

fun stringTemplatesExample() {
    val totalSpots = 50
    println("Parking in Burnham Park has $totalSpots parking spots")
}

fun ifExample() {
    val totalSpots = 50
    var reservedSpots = 0
    if (reservedSpots < totalSpots) {
        reservedSpots++
        println("Reservation made. Spots left: ${totalSpots - reservedSpots}")
    } else {
        println("Sorry, no spots available.")
    }

    // or

    val reservationMessage = if (reservedSpots < totalSpots) {
        reservedSpots++
        "Reservation made. Spots left: ${totalSpots - reservedSpots}"
    } else {
        "Sorry, no spots available."
    }

    print(reservationMessage)
}

fun forLoopExample() {
    val totalSpots = 50
    var reservedSpots = 0
    for (i in (reservedSpots + 1)..totalSpots) {
        println("Spot $i")
    }
}