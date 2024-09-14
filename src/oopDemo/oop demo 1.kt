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

class Student(var name: String?, id: Int) {
    constructor(id: Int) : this(null, id)

    var id: Int = id
        get()  {
            return field + 1
        }
        set(value) {
            field = value + 1
        }
}