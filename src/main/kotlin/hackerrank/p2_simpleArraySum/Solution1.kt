package hackerrank.p2_simpleArraySum

fun main() {
    val sum = simpleArraySum(arrayOf(2, 4, 6, 10, 6))
    println(sum)
}

fun simpleArraySum2(ar: Array<Int>): Int {
    var sum = 0
    for (eliment in ar) {
        ar.forEach { sum += eliment }
    }
    return sum
}