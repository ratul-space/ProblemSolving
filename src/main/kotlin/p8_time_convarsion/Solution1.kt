package p8_time_convarsion

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
//    input: 07:05:45PM
    val splitStringList: List<String> = s.split(":")
    var hourIn12Format: Int = 0
    var minuteIn12Format: Int = 0
    var secondIn12Format: Int = 0
    var amPmIn12Format: String = ""

    hourIn12Format = splitStringList[0].toInt()
    minuteIn12Format = splitStringList[1].toInt()

    val secWithAmPm: String = splitStringList[2]

    secondIn12Format = secWithAmPm.take(2).toInt()
    amPmIn12Format = secWithAmPm.takeLast(2)

    // main logic
    var hourIn24Format: Int = 0
    var minuteIn24Format: Int = 0
    var secondIn24Format: Int = 0
    var finalResult = ""

    if (amPmIn12Format.equals("PM") && hourIn12Format < 12) {
        hourIn24Format = hourIn12Format + 12
    } else if (amPmIn12Format.equals("PM") && hourIn12Format == 12) {
        hourIn24Format = 12
    } else if (amPmIn12Format.equals("AM") && hourIn12Format < 12) {
        hourIn24Format = hourIn12Format
    } else if (amPmIn12Format.equals("AM") && hourIn12Format == 12) {
        hourIn24Format = 0
    }

    //    output: 19:05:45
    finalResult = String.format("%02d", hourIn24Format) + ":" + splitStringList[1] + ":" + secondIn12Format
    println(finalResult)
    return finalResult
}

fun main(args: Array<String>) {
    val s = "09:01:45PM"

    val result = timeConversion(s)

    println(result)
}