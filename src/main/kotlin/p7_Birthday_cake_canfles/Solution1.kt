package p7_Birthday_cake_canfles

fun main() {
    val result = birthdayCakeCandles(arrayOf(4, 4, 2, 1, 4))
    println(result)
}

fun birthdayCakeCandles(candles: Array<Int>): Int {
    var tallest = 0
    var counter = 0

    for (candle in candles) {
        if (candle > tallest) {
            tallest = candle
            counter = 0
        }
        if (candle == tallest) counter += 1

    }
    return counter
}