fun main() {

    sayHi();

    sayHi(name = "Ramananda");

    println(name());


    println(greetings(first = "Ramananda", second = "Sarkar"));

    println(greetings(first = "Ramananda"));

}

fun sayHi() {
    println("Hi");
}


fun name(): String {
    return "This is name"
}

fun sayHi(name: String) {
    println(name);
}

fun greetings(first: String = "hi", second: String = "Himunshu"): String {

    return first + " " + second;
}