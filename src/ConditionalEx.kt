fun main() {


    var age = 21;

    when (age) {

        1 -> print("age is 1");
        2 -> print("age is 10");
        else -> println("you entered undefined age");
    }


    when (age) {

        in 1..10 -> println("age is range is 1 to 9");
        in 10..20 -> println("age range is 10 to 20");
        else -> println("you entered undefined age");
    }


    if (age == 1) {
        print("age is 1")
    } else if (age == 90) {
        print("age is 10")
    } else {
        print("undefined age")
    }

}