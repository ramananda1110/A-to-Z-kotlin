fun main() {

    var name: String? = "default name"

    println(name);
    name = null;

    println(name);

    var fullName: String? = "Ramananda sarkar"

    println(fullName?.length);

    fullName = null;

    print("this is " + fullName?.length);
}