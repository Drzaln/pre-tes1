fun main() {
    pohonImajin(2,2)
}

fun pohonImajin(tahun:Int, tinggi:Int ) {
    var i = 0
    while (i < tahun){
        val a = tinggi * 2
        val b = tinggi + 1
        i += 1
        print(b)
    }
}
