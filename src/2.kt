fun main() {
    print("Masukkan angka: ")
    val n = readLine()!!.toInt()

    segitigaPrima(n)
}

 var numPrima = IntArray(1000)
    fun createPrima() {
        var count = 0
        for (i in 1 until numPrima.size) {
            var prima = 0
            for (j in 1 until numPrima.size) {
                if (i % j == 0) {
                    prima++
                }
            }
            if (prima == 2 && i != 1) {
                numPrima[count] = i
                count++
            }
        }

    }

    fun segitigaPrima(alas: Int) {
        createPrima()
        if (alas < 10){
            for (i in 1..alas) {
                for (j in 0 until i) {
                    print("${numPrima[j]} ")
                }
                println(" ")
            }
        }else{
            print("Masukkan angka < 10")
        }
    }