package oopDemo

import kotlin.system.exitProcess
/*
 * Requirements:
 * 1. App should run indefinitely until stop
 * 2. Operator can issue an ID
 * 3. Operator can view all IDs
 */
fun main() {
    val ids: MutableList<PhilSysId> = mutableListOf()
    initIDs(ids)
    println("Application Started...")
    while(true) {
        displayMenu()
        val choice: Int = readIntInput()
        when(choice) {
            1 -> { displayAll(ids) }
            2 -> { searchId(ids) }
            3 -> {
                println("Please enter the PHILSYS ID of the resident...")
                val message: String = if(issueID(ids, readIntInput())) "Successfully issued ID!" else "ID Not Found!"
                println("$message\n")
            }
            4 -> {
                println("Exiting Application...")
                exitProcess(0)
            }
            else -> { println("Invalid Choice") }
        }
    }
}

fun initIDs(ids: MutableList<PhilSysId>) {
    ids.add(PhilSysId(
        1001,
        Resident("Harry", "Covalles", "Dominguez"))
    )
    ids.add(PhilSysId(
        1002,
        Resident("Cazandra Jae", "Lapig"))
    )
    ids.add(PhilSysId(
        1003,
        Resident("Cariel Joyce", "Garlejo", "Maga"))
    )
    ids.add(PhilSysId(
        1004, Resident("Ma. Earl Freskkie", "Alvarez", "Encarnacion"))
    )
    ids.add(PhilSysId(
        1005,
        Resident("Sean Justin", "Aromin"))
    )
    ids.add(PhilSysId(
        1006,
        Resident("Jude Angelo", "Ilumin"))
    )
}

fun displayMenu() {
    println(
        """
            ------------------------------------------
            PHILSYS ID Inventory Application
            ------------------------------------------
                1. View all PHILSYS IDs
                2. Check Availability
                3. Issue a PHILSYS ID
                4. Exit App
            ------------------------------------------
        """.trimIndent()
    )
}

fun readIntInput(): Int {
    print(">>> ")
    try {
        val choice: Int = readlnOrNull()?.toInt() ?: -1
        return choice
    } catch (nfe: NumberFormatException) {
        return -1
    }
}

fun displayAll(ids: MutableList<PhilSysId>) {
    println("\n-----------------------   MASTERLIST   ---------------------------")
    for(id:PhilSysId in ids) {
        println("$id\n")
    }
}

fun searchId(ids: MutableList<PhilSysId>) {
    val localCopy: MutableList<PhilSysId> = mutableListOf(ids)
    try {
        println("Enter last name: ")
        val idQueryA: String = readln()!!
        println("Enter given name: ")
        val idQueryB: String = readln()!!

        localCopy.removeIf { it.lastName.equals(idQueryA, true) && it.firstName.equals(idQueryB, true) }
        println("\n----------------------- SEARCH RESULTS ---------------------------")
        println(localCopy.get(0).toString())
    } catch (npe: NullPointerException) {
        println("Please enter the required information!)
    }
}

fun issueID(ids:MutableList<PhilSysId>, idNo: Int) : Boolean {
    return ids.removeIf { it.idNo == idNo }
}
