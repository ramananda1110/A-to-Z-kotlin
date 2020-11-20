class Person2 {
    var name: String ="Alien";// default value 'alien'
}

fun main() {

    val person = Person2();

    // print : alien

    print(person.name)
    person.name = "Pitter"

    // print : pitter
    print(person.name)

}