fun main() {
    dapatMi()
}

fun dapatMi() {
    val mie = 2500
    val duit = 50000
    val sisa = duit % mie
    val miAwal = (duit-sisa)/mie
    val sisa2 = miAwal % 4
    val mieBonus = (miAwal + sisa2)/4

    print(miAwal + mieBonus)
}
