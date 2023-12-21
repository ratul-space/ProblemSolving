package p9_grading_students

// 75
//67   sample output
//40
//33
fun gradingStudents2(grades: Array<Int>): Array<Int> {
    var resultArray: MutableList<Int> = arrayListOf()

    grades.forEachIndexed { index, value ->
        //println("$index : $value")
        if (value < 38) {
            // not round the value
            resultArray.add(value)
        } else if (value % 5 == 3) {
            resultArray.add(value + 2)
        } else if (value % 5 == 4) {
            resultArray.add(value + 1)
        } else {
            resultArray.add(value)
        }
    }

    return resultArray.toTypedArray()
}

fun main(args: Array<String>) {
    val result = gradingStudents2(arrayOf(4, 73, 67, 38, 33))
    println(result.contentToString())
}