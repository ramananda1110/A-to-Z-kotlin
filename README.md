# A-to-Z-kotlin
 It has been prepared for the beginners to help them understand the basics of Kotlin programming language. After completing this tutorial, you will find yourself at a moderate level of expertise in Kotlin, from where you can take yourself to the next levels.


### Print hello world :

```kotlin

fun main() {
    print("this is hello world")
}

```

Class & Object : 

```kotlin
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
```
