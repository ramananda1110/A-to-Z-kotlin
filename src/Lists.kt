import java.util.*

fun main() {


    val list: MutableList<Int> = mutableListOf(1, 2, 4, 5, 6, 5, 4, 10, 33, 100, 8);


    val evenList = list.filter {
        it % 2 == 0;
    };

    println(evenList)

    val oddList = list.filterNot {
        it % 2 == 0
    }

    println(oddList)

    println(list[6])

    println(list.isEmpty())
}

