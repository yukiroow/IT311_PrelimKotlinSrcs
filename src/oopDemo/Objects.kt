package oopDemo

class PhilSysId(
    val idNo: Int,
    val person: Resident
) {
    override fun toString(): String {
        return """
               PHILSYS ID No.: $idNo
               Name: $person
        """.trimIndent()
    }
}

class Resident(
    val firstName: String,
    private val middleName: String?,
    val lastName: String
) {
    constructor(firstName: String, lastName: String) : this(firstName, null, lastName)

    override fun toString(): String {
        return if(middleName != null) "$firstName $middleName $lastName" else "$firstName $lastName"
    }
}