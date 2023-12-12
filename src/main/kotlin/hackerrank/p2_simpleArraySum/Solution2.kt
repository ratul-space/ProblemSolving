package hackerrank.p2_simpleArraySum

fun main() {
    val sum = simpleArraySum(arrayOf(2, 4, 6, 10, 6))
    println(sum)
}

fun simpleArraySum(ar: Array<Int>): Int {
    var sum = 0

    for (element in ar) {
        sum += element
    }

    return sum
}