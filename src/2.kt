fun main() {
    print("Masukkan angka: ")
    val n = readLine()!!
    var m = n.toInt()
    segitigaPrima(m)
}

fun segitigaPrima(m : Int) {
    if (m < 10){
        for (i in 1..m) {
            for (j in 1..i) {
                print("$j ")
            }
            println()
        }
    }else{
        print("masukkan angka < 10")
    }
}
