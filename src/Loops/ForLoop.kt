package Loops

fun main() {
    /*
        For = adalah perulangan terhadap data iterator (array, range, dll)
     */

    println("============================== For Loop Array ==============================")

    val array = arrayOf("Ayah", "ibu", "kakak", "adik", "paman", "bibi", "kakek", "nenek")

    for (name in array){
        println(name)
    }

    println("============================== For Loop Array with total ==============================")

    val arrayFamily = arrayOf("Ayah", "ibu", "kakak", "adik", "paman", "bibi", "kakek", "nenek")

    var total = 0
    for (person in arrayFamily){
        println(person )
        total++
    }
    println("total perulangan : $total")


    println("============================== For Loop Range ==============================")

//    for (i in 0..100){
//    for (i in 0..100 step 2){
    for (i in 100 downTo 0 step 2){
        println(i)
    }

    println("============================== For Loop Combination Array with Range ==============================")

    val dataArray = array.size -1
    for (index in 0..dataArray){
        println("Index $index = ${array.get(index)}")
    }
}