package Loops

fun main() {

    /*
        Break       : menghentikan seluruh perulangan (dapat digunakan pada semua jenis perulangan)
        Continue    : menghentikan / meng skip perulangan yang saat itu sedang berjalan (dapat digunakan pada semua jenis perulangan)
     */

    println("=================================== Infinie loop ===================================")

//    var i = 0
//    while (true){
//        println("perulangan ke : $i")
//        i++
//    }

    println("=================================== Break ===================================")

    var i = 0
    while (true){
        println("perulangan ke : $i")
        i++

        if (i > 100){
            break
        }
    }

    println("=================================== Continue ===================================")

    for (index in 1..100){

        if (index % 2 == 0){
            continue
        }

        println(" Angka = $index")
    }
}