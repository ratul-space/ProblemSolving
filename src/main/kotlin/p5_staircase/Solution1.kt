package p5_staircase

fun main() {
    staircase(4)
}

fun staircase(n: Int): Unit {
    for (line in 1..n) {
        println(" ".repeat(n - line) + "#".repeat(line))
    }
}
