import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {
    @Test
    fun should_ReturnPercentageOfA_When_ArrayElementsAreWrittenCorrectly() {
        // given an array with only "a" and "b" characters
        val array = arrayOf("a", "a", "b", "a", "b", "a")
        // when calculate the percentage of "a"
        val percentageOfA = findPercentageOfa(array)
        // then check the result
        assertEquals(66.7, percentageOfA)
    }

    @Test
    fun should_ReturnMinus1_When_SomeArrayElementsContainMoreThan1Character() {
        // given an array with more than one character in some of its strings
        val array = arrayOf("ab", "aaa", "b")
        // when try to calculate the percentage of "a"
        val percentageOfA = findPercentageOfa(array)
        // then check the result
        assertEquals(-1, percentageOfA)
    }

    @Test
    fun should_ReturnMinus1_When_SomeArrayElementsAreNotAsNorBs() {
        // given an array with different types of characters that some of them are not "a" nor "b"
        val array = arrayOf("m", "1", "*", "", "b")
        // when try to calculate the percentage of "a"
        val percentageOfA = findPercentageOfa(array)
        // then check the result
        assertEquals(-1, percentageOfA)
    }

    @Test
    fun should_ReturnMinus1_When_ThereIsNoCharacterInArray() {
        // given an array with empty strings
        val array = arrayOf("")
        // when try to calculate the percentage of "a"
        val percentageOfA = findPercentageOfa(array)
        // then check the result
        assertEquals(-1, percentageOfA)
    }
}
