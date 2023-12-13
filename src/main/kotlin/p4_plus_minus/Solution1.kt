package p4_plus_minus

fun main() {
    plusMinus(arrayOf(-5, 0, 0, 2, 3, 4, 30, -1, -1, -2))
}

fun plusMinus(arr: Array<Int>) {
    val positives = arr.count { it > 0 }
    val negatives = arr.count { it > 0 }
    var zeros = arr.count { it == 0 }

    val size = arr.size.toDouble()
    println("%.6f".format(positives / size))
    println("%.6f".format(negatives / size))
    println("%.6f".format(zeros / size))

}