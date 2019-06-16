//    fun isPal(s: String): Boolean {
//        if (s.length == 0 || s.length == 1)
//            return true
//        return if (s[0] == s[s.length - 1]) isPal(s.substring(1, s.length - 1)) else false
//    }
//
//    fun main() {
//        print("Masukkan string: ")
//        val string = readLine()!!
//        if (isPal(string))
//            println(string + " adalah palindrome")
//        else
//            println(string + " bukan palindrome")
//    }

fun main() {
    searchString()
}

fun searchString() {
    print("Masukkan inputan: ")
    val inp = readLine()!!
    print("Masukkan yang dicari: ")
    val cri = readLine()!!
    var hasil = 0
    val masuk = inp.length
    val cari = cri.length
    for (i in 0 until  masuk){
        var potongString = inp.substring(i, cari)
        if (potongString == inp){
            hasil++
        }
    }
    for (a in 1 until masuk){
        var potongString = inp.substring(a, cari)
        if (potongString == inp){
            hasil++
        }
    }
    print("Ditemukan $hasil kali")
}
