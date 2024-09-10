package oopDemo

class Person(var name: String, var age: Int)

fun main() {
    val person1 = Person("Maria", 20)
    val person2 = person1

    println("Before modification:")
    println("Person 1: ${person1.name}, Age: ${person1.age}")
    println("Person 2: ${person2.name}, Age: ${person2.age}")


    person2.name = "Freskkie"
    person2.age = 19

    println("\nAfter modification:")
    println("Person 1: ${person1.name}, Age: ${person1.age}")
    println("Person 2: ${person2.name}, Age: ${person2.age}")
}

//constructor, setter, getter
/**class it311 (var Name: String) {

//constructor(studentName: String) : this(studentName)


var Name: String = "none"
get() {
return field
}

set(value) {
field = value
}

}
 */