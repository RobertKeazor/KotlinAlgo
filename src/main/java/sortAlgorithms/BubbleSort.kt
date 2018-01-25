package sortAlgorithms

import Sortable

class BubbleSort<T : Comparable<T>> : Sortable<T> {

    @Suppress("UNUSED_PARAMETER", "NOTHING_TO_INLINE") //Intresting trick
    inline fun proclaim (cast: Any) = Unit

    fun swap(arr: ArrayList<T>, x: Int, y: Int) {
        var temp = arr[y]
        arr[y] = arr[x]
        arr[x] = temp
    }

    override fun sort(elements: List<T>): List<T> {
        var isSwapped = false
        proclaim(elements as ArrayList)

       do {
           isSwapped =  false
            for (position in 0..elements.size - 2) {
                if (elements[position] > elements[position + 1]) {
                    swap(elements, position, position + 1)
                    isSwapped = true
                }
            }
        }  while (isSwapped)
        return elements
    }
}
