package sortAlgorithms

import Sortable

class QuickSort : Sortable<Int> {
    override tailrec fun sort(items: List<Int>): List<Int> {
        if (items.count() < 1) return items
        val pivot = items[items.count()/2]
        return sort(items.filter { it < pivot }) + items.filter { it == pivot } + sort(items.filter { it > pivot })
    }
}