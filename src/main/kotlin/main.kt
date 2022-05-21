fun main() {
    val array = arrayOf("a", "a", "b", "a", "b", "a")

    println(findPercentageOfa(array))
}

/**
 * this function returns the percentage of "a" characters in an array
 * @param array is the array of "a" and "b" characters
 * @return either a double that represents the percentage of "a" character, or the integer -1 if the array's elements are not "a" or "b"
 */
fun findPercentageOfa(array: Array<String>): Any {
    var numberOfA: Double = 0.0
    var percentageOfA: Double = 0.0

    // region conditionals
    for (i in array.indices) {
        if (array[i] == "a") {
            numberOfA += 1
        }

        if (array[i] != "a" && array[i] != "b") {
            return -1
        } else {
            percentageOfA = numberOfA / array.size * 100
        }
    }
    // endregion

    return "%.1f".format(percentageOfA).toDouble()
}
