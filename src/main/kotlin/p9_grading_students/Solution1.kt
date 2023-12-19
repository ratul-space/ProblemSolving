package p9_grading_students

//4
//73
//67 sample input
//38
//33

// 75
//67   sample output
//40
//33

fun gradingStudents(grades: Array<Int>): Array<Int> {
    return grades.map {
        when {
            it < 38 -> it
            it % 5 == 3 -> it + 2
            it % 5 == 4 -> it + 1
            else -> it
        }
    }.toTypedArray()
}

fun main(args: Array<String>) {
//    val gradesCount = readLine()!!.trim().toInt()
//
//    val grades = Array<Int>(gradesCount, { 0 })
//    for (i in 0 until gradesCount) {
//        val gradesItem = readLine()!!.trim().toInt()
//        grades[i] = gradesItem
//    }

    val result = gradingStudents(arrayOf(4, 73, 67, 38, 33))
    println(result.contentToString())
}
