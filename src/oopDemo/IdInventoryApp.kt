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
    while (true) {
        displayMenu()
        val choice: Int = readIntInput()
        when (choice) {
            1 -> {
                print("Enter last name: ")
                val idQueryA: String = readln().trim()
                print("Enter given name: ")
                val idQueryB: String = readln().trim()

                val message: String = searchId(ids, idQueryA, idQueryB)?.toString() ?: "No Available ID Found"
                println("\n----------------------- SEARCH RESULTS ---------------------------")
                println(message)
            }

            2 -> {
                println("Please enter the PHILSYS ID Number of the resident...")
                val idNo: Int = readIntInput()
                val idIssued: Boolean = issueID(ids, idNo)
                val message: String = if (idIssued) "Successfully issued ID!" else "ID Not Found!"
                println("$message\n")
            }

            3 -> {
                println("Exiting Application...")
                exitProcess(0)
            }

            else -> {
                println("Invalid Choice")
            }
        }
    }
}

fun initIDs(ids: MutableList<PhilSysId>) {
    ids.add(
        PhilSysId(
            1001,
            Resident("Harry", "Covalles", "Dominguez")
        )
    )
    ids.add(
        PhilSysId(
            1002,
            Resident("Cazandra Jae", "Lapig")
        )
    )
    ids.add(
        PhilSysId(
            1003,
            Resident("Cariel Joyce", "Garlejo", "Maga")
        )
    )
    ids.add(
        PhilSysId(
            1004, Resident("Ma. Earl Freskkie", "Alvarez", "Encarnacion")
        )
    )
    ids.add(
        PhilSysId(
            1005,
            Resident("Sean Justin", "Aromin")
        )
    )
    ids.add(
        PhilSysId(
            1006,
            Resident("Jude Angelo", "Ilumin")
        )
    )
}

fun displayMenu() {
    println(
        """
            ------------------------------------------
            PHILSYS ID Inventory Application
            ------------------------------------------
                1. Check Availability
                2. Issue a PHILSYS ID
                3. Exit App
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

fun searchId(ids: MutableList<PhilSysId>, idQueryA: String, idQueryB: String): PhilSysId? {
    val localCopy: MutableList<PhilSysId> = ids.toMutableList()
    localCopy.retainAll { it.person.lastName.equals(idQueryA, true) && it.person.firstName.equals(idQueryB, true) }
    return if (localCopy.isNotEmpty()) localCopy[0] else null
}

fun issueID(ids: MutableList<PhilSysId>, idNo: Int): Boolean {
    return ids.removeIf { it.idNo == idNo }
}
