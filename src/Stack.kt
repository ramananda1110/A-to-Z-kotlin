fun main() {

    push(12)
    push(90)
    push(100)
    pop()
    push(60)
    println(peek())

}

var top = -1;
var capacity = 3
var stack: IntArray = IntArray(capacity)

fun push(x: Int) {
    if (top < capacity - 1) {
        top += 1
        stack[top] = x
        println("push number $x")
    } else {
        println("Overflow stack")
    }
}

fun pop(): Int {
    if (top < 0) {
        println("data not found to stack")
        return -1
    }
    val temp = stack[top]
    top -= 1
    return temp
}

fun peek(): Int {
    if (top < 0) {
        println("data not found to stack")
        return -1
    }
    return stack[top]
}