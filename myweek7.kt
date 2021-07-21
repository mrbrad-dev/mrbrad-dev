fun main() {
    val list: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(reverse(list))

}

fun reverse(list: List<Int>): List<Int> {
    val result: ArrayList<Int> = arrayListOf<Int>()
    for (i: Int in 0 until list.size) {
        val number: Int = list[list.size - 1 - i]
        result.add(number)
    }
    return result
}