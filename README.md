# A-to-Z-kotlin
 It has been prepared for the beginners to help them understand the basics of Kotlin programming language. After completing this tutorial, you will find yourself at a moderate level of expertise in Kotlin, from where you can take yourself to the next levels.


Print hello world :

```kotlin

fun main() {
    print("this is hello world")
}

```

Variable declaration

Kotlin uses two different keywords to declare variables: val and var.

- Use val for a variable whose value never changes. You can't reassign a value to a variable that was declared using val.
- Use var for a variable whose value can change.

```kotlin
fun main() {

    var num1 = 5;
    num1 = 20;

    val num2 = 10;
    var name:String = "default value"
    name = "re-assign value"
    
    num2 = 12; // can't reassign a value

    val result = num1 + num2;

    print(result)
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
