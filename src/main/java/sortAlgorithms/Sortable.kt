interface Sortable<T: Comparable<T>> {
    tailrec fun sort(elements: List<T>) : List<T>
}