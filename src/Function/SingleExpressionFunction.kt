package Function

/*
        - menyederhanakan function tanpa isi body
        menjadi satu baris kode
 */


//fun multipleTwo(a:Int):Int{
//    return a * 2
//}
fun multipleTwo(a:Int):Int = a * 2


//fun sapa(name: String): Unit{
//    println("Hello $name")
//}
fun sapa(name: String): Unit = println("Hello $name")

fun main() {

    println(multipleTwo(10))
    sapa("Willy")

}