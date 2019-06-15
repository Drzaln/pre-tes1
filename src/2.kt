fun main() {
    print("Masukkan angka: ")
    val n = readLine()!!
    var m = n.toInt()
    segitigaPrima(m)
}

fun segitigaPrima(m : Int) {
    if (m < 10){
        for (i in 1..m) {
            var p = 0
            for (j in 1..i) {
                if (i % j == 0){
                    p += 1
                }
                print("$j ")
            }
            println()

            if ( p <= 2){
                print("$i ")
            }
        }
    }else{
        print("masukkan angka < 10")
    }
}
