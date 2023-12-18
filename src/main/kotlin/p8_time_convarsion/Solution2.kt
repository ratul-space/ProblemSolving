package p8_time_convarsion

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion2(s: String): String {
//    input: 07:05:45PM
    var hour = s.take(2).toInt()
    val amPm = s.takeLast(2)
    val middle = s.substring(2..7)

    if (amPm.equals("AM")) {
        if (hour == 12) {
            hour = 0
        }
    } else {
        if (hour < 12) {
            hour += 12
        }
    }

    val formattedHour = String.format("%02d", hour) // 2 digit
    //    output: 19:05:45
    return formattedHour + middle
}

fun main(args: Array<String>) {
    val s = "12:01:45AM"

    val result = timeConversion(s)

    println(result)
}