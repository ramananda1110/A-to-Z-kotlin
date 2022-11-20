fun main() {

    val st = Student("ramannanda ", Type.MALE)
    val st2 = Student("Rafi ", Type.FEMALE)
}

class Student(name:String , gender:Type) {
    init {
        println("$name is type ${gender}");
    }
}

enum class Type(val type: String){
    MALE("male"),
    FEMALE("female")
}