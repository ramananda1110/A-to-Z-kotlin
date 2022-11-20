import java.util.*

fun main() {

    val array:IntArray = intArrayOf(1,2,4,5,6,5,4,10,33,100,8);

    val sortArray:IntArray = array.sortedArray();

    println(Arrays.toString(sortArray));

    val number:Int? = array.find {
        it % 44 ==0;
    }

    print(number);
}

