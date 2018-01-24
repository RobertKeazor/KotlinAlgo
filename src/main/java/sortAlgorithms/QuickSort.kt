package sortAlgorithms

import Sortable

class QuickSort : Sortable<Int> {
    override fun sort(items: List<Int>): List<Int> {
        if (items.count() < 1) return items
        val pivot = items[items.count()/2]
        val equal = items.filter { it == pivot }
        val less = items.filter { it < pivot }
        val greater = items.filter { it > pivot }
        return sort(less) + equal + sort(greater)
    }
}