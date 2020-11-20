class Person {
    var name: String ="Alien";// default value 'alien'
}

fun main() {

    val person = Person();

    // print : alien

    print(person.name)
    person.name = "Pitter"

    // print : pitter
    print(person.name)

}