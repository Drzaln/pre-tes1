import java.util.*

fun main() {
    sortArray()
}

fun sortArray() {
    val iniArray = arrayOf(6,22,34,15,2,13,26,57,42,32)
    val elementKecil = iniArray.min()
    val elementBesar = iniArray.max()
    val ascending = iniArray.sortedArray()
    val descending = iniArray.sortedArrayDescending()
    println("Data Terkecil: $elementKecil")
    println("Data Terbesar: $elementBesar")
    println("Ascending Sort: ${Arrays.toString(ascending)}")
    println("Descending Sort: ${Arrays.toString(descending)}")

}
