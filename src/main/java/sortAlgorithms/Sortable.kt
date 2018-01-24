interface Sortable<T: Comparable<T>> {
    fun sort(elements: List<T>) : List<T>
}