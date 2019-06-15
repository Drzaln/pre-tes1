fun main() {
    pohonImajin(2,2)
}

fun pohonImajin(tahun:Int, tinggi:Int ) {
    var i = 0
    var b = 0
    while (i < tahun){
        val a = tinggi * 2
        b = tinggi + 1
        i += 1
    }
    print("Tinggi pohon selama $tahun tahun adalah $b meter")
}
