package TipeData

fun main() {

    /*
        Range : membuat data angka berurutan
     */

//    val range = 1..100

    //range terbalik
    val range = 100 downTo 1

    //untuk menghitung banyaknya length
    println(range.count())

    //untuk memeriksa apakah value tersebut ada pada range
    println(range.contains(80))
    println(range.contains(101))

    //mendapatkan nilai pertama
    println(range.first)

    //mendapatkan nilai terakhir
    println(range.last)

    ////mendapatkan nilai kenaikan
    println(range.step)

    println("============= ARRAY DENGAN STEP =============")

    val range2 = 1..100 step 2

    //untuk menghitung banyaknya length
    println(range2.count())

    //untuk memeriksa apakah value tersebut ada pada range
    println(range2.contains(80))
    println(range2.contains(3))

    //mendapatkan nilai pertama
    println(range2.first)

    //mendapatkan nilai terakhir
    println(range2.last)

    ////mendapatkan nilai kenaikan
    println(range2.step)
}