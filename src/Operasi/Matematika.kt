package Operasi

fun main() {


    //pengoperasian sudah scientific (menggunakan konsep kalibataku)
    val result = 10 + 10 / 2
    println(result)


    //jika ingin mendapatkan hasil pecahan, maka menggunakan tipe data double, bukan integer
    val result2 = 10.0 / 3.0
    println(result2)


    println("=================== AUGMENTED ASSIGNTMENTS ===================")

    var total = 0

//    val barang1 = 100
//    total = total+barang1
//
//    val barang2 = 200
//    total = total+barang2
//
//    val barang3 = 300
//    total = total+barang3


    /*
        dengan aughmented assigntmens jadi lebih simple
        menggunakan operatr berikut
        +=
        -=
        *=
        /=
        %=
     */
    val barang1 = 100
    total += barang1

    val barang2 = 200
    total += barang2

    val barang3 = 300
    total += barang3

    println(total)

    println("=================== UNARY OPERATOR ===================")

    /*
        pengoperasian kelipatan 1 atau sebaliknya
        menggunakan operator berikut
        ++
        --
     */

    total++ // total = total + 1
    total++ // total = total + 1
    total++ // total = total + 1
    println(total)


    // mendapatkan nila negatif atau positif (secara default untuk bilangan positif tidak tertulis operatornya)
    val suhu = -5
    println(suhu)

    //mendapatkan nilai boolean kebalikan
    val ganteng = true
    println(!ganteng)
}