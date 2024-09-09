package oopDemo

/**
 * reference class
 * create constructor
 * create setters & getters
 * how override default methods (tostring)
 * how to inheritance super
 * how to create and implement an interface
 */

// parent class
open class SAMSCIS(val studentName: String) {
    open fun department() {
        println("$studentName is part of the SAMSCIS department.")
    }
}

// Child class for Accountancy
class Accountancy(studentName: String) : SAMSCIS(studentName) {
    override fun department() {
        super.department()
        println("$studentName is studying Accountancy.")
    }
}

// Child class for Financial Management
class FinancialManagement(studentName: String) : SAMSCIS(studentName) {
    override fun department() {
        println("$studentName is studying Financial Management.")
    }
}

// Child class for Information Technology
class InformationTechnology(studentName: String) : SAMSCIS(studentName) {
    override fun department() {
        println("$studentName is studying Information Technology.")
    }
}

fun main() {
    val accountancyStudent = Accountancy("John")
    val fmStudent = FinancialManagement("Sarah")
    val itStudent = InformationTechnology("David")

    // Polymorphism in action
    accountancyStudent.department()  // John is studying Accountancy.
    fmStudent.department()            // Sarah is studying Financial Management.
    itStudent.department()            // David is studying Information Technology.
}
