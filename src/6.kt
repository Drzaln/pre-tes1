fun main() {
    print("Masukkan angka desimal: ")
    val n = readLine()!!
    val num = n.toInt()

    val biner = konversiDesimalKeBiner(num)
    println("Angka Biner: $biner")
}

fun konversiDesimalKeBiner(o: Int): Long {
    var n=o
    var angkaBiner: Long = 0
    var m: Int
    var i = 1

    while (n != 0) {
        m = n % 2
        n /= 2
        angkaBiner += (m * i).toLong()
        i *= 10
    }
    return angkaBiner
}