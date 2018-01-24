package sortAlgorithms

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

class QuickSortTest: Spek({
    val unsortedList = mutableListOf(1, 7, 3, 6, 2)
    val sortedList = mutableListOf(1, 2, 3, 6, 7)
    describe("A quick sort") {
        val subject =  QuickSort()

        it("should sort a list of integer") {
            assertEquals(subject.sort(unsortedList), sortedList)
        }
    }

})