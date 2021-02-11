package Function

fun jumlahkan(a: Int, b:Int): Int{

    val total = a+b
    return  total
}


/*
    jika hanya menggunakan function return seperti ini,
    maka akn error jika penghitungannya untuk pembagian 0,
    maka harus dibuat function dengan if else dan return 0
 */
//fun bagi(a: Int, b: Int):Int{
//    val hasil = a/b
//    return hasil
//}

//untuk mengatasi error pembagian 0
fun bagi(a: Int, b: Int):Int{
    if (b==0){
        return 0
    }else{
        val hasil = a/b
        return hasil
    }
}

fun main() {

    println("================================= Function Return Type =================================")
    println(jumlahkan(10, 10))
    println(jumlahkan(100, 100))

    val result = jumlahkan(200, 200)
    println(result)

    /*
        untuk contoh yang ini, tidak dapat ditampilkan
        karena tidak ada yang menampung datanya, kecuali
        jika dibuat variable terlebih dahulu (seperti variable result)
     */
    jumlahkan(5,5)

    println("================================= Function Return Type with if else return 0 =================================")

    println(bagi(100, 10))
    println(bagi(100, 0))

}