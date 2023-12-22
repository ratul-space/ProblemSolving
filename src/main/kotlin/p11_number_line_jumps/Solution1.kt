package p11_number_line_jumps

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    var returnValue = ""
    val distance = x2 - x1
    val jumpDiff = v1 - v2

    if (v1 > v2 && distance % jumpDiff == 0) {
        returnValue = "YES"
    } else {
        returnValue = "NO"
    }

    return returnValue
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val x1 = first_multiple_input[0].toInt()

    val v1 = first_multiple_input[1].toInt()

    val x2 = first_multiple_input[2].toInt()

    val v2 = first_multiple_input[3].toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}