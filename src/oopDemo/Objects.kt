package oopDemo

class PhilSysId(
    val idNo: Int,
    private val person: Resident
) {
    override fun toString(): String {
        return """
               PHILSYS ID No.: $idNo
               Name: $person
        """.trimIndent()
    }
}

class Resident(
    private val firstName: String,
    private val middleName: String,
    private val lastName: String
) {
    constructor(firstName: String, lastName: String) : this(firstName, "\b", lastName)

    override fun toString(): String {
        return """
            $firstName $middleName $lastName
        """.trimIndent()
    }
}