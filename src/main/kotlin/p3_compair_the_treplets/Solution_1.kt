package p3_compair_the_treplets

fun main() {
    val a = arrayOf(1, 2, 3)
    val b = arrayOf(3, 2, 1)
    val result = compareTriplets(a, b)

    println("${result[0]} ${result[1]}")
}

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var scoreOfAlice = 0
    var scoreOfBob = 0

    for (i in 0..2) {
        if (a[i] > b[i]) {
            scoreOfAlice += 1
        }

        if (a[i] < b[i]){
            scoreOfBob += 1
        }
    }

    return arrayOf(scoreOfAlice, scoreOfBob)
}