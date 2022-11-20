import java.util.*

fun main() {


    val maps: Map<String, Int> = mapOf("id" to 12, "regi_no" to 1234);

    println(maps["regi_no"]);

    println(
            maps.count() {
                it.value == 1234;
            }
    )

    println(
            maps.filterKeys {
                it == "id";
            }
    )

    println(maps.getOrDefault("idd", "no data found"));

}

