package sortAlgorithms

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import Sortable

class QuickSortTest: Spek({
    val unsortedList = mutableListOf(1, 7, 3, 6, 2)
    val sortedList = mutableListOf(1, 2, 3, 6, 7)

    fun assertSortAlgorithm(subject: Sortable<Int>) = assertEquals(subject.sort(unsortedList), sortedList)

    describe(" Sorting Algorithms") {
        it("should sort list using QuickSort") { assertSortAlgorithm(QuickSort()) }
        it("should sort list using BubbleSOrt") {assertSortAlgorithm(BubbleSort<Int>())}
    }
})