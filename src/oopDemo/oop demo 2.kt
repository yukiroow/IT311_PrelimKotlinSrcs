package oopDemo

// parent class
open class SAMSCIS( val studentName: String) {
    open fun department() {
        toString()
        println("$studentName is part of the SAMSCIS department.")
    }

    override fun toString(): String {
        return "$studentName is part of the SAMSCIS department."
    }
}

// Child class for Financial Management
class FinancialManagement(studentName: String) : SAMSCIS(studentName) {
    override fun toString(): String {
        return "$studentName is studying Financial Management."
    }

    override fun department() {
        println(toString())
    }
}

// Child class for Information Technology
class InformationTechnology(studentName: String) : SAMSCIS(studentName) {
    override fun department() {
        println("$studentName is studying Information Technology.")
    }
}

// Child class for Accountancy
class Accountancy(studentName: String) : SAMSCIS(studentName) {
    fun dptment() {
        super.department()
        println("$studentName is studying Accountancy.")
    }
}

fun main() {
    val accountancyStudent = Accountancy("John")
    val fmStudent = FinancialManagement("Sarah")
    val itStudent = InformationTechnology("David")

    // Polymorphism in action
    accountancyStudent.dptment()    // John is studying Accountancy.
    fmStudent.department()          // Sarah is studying Financial Management.
    itStudent.department()          // David is studying Information Technology.
}
