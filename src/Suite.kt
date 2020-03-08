object Suite {

    fun going(n: Int): Double {
        return if (n == 0) 0.0
        else 1 + going(n - 1) / n
    }
}

fun main() {
    println(Suite.going(7))
}