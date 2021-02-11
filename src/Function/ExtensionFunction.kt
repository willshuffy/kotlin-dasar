package Function

//extension function menggunakan single function
fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hai $this")

fun main() {
    val name = "Willy"

    println(name.hello())

    name.printHello()

    "Saputra".printHello()

    /*
        nb: extension function dapat digunakan untuk mengubah isi tipe data
            file kotlin atau library milik orang lain yang ingin kita gunakan
            dengan menambhakan function tambahan
     */
}
