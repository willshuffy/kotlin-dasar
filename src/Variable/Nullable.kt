package Variable

fun main() {


    /*
        - Secara standar, variable di kotlin harus dideklarasikan / diinisialisasikan nlainya
        - Jika saat membuat variable, tidak diberi nilai, maka akan error
        - kotlin mendukung variable yang boleh null (tidak memiliki data)
        - Ini dikarenakan kotlin bisa mengakses java, dan kebanyakan di java, semua variable bisa null (tidak memiliki nilai)
        - Jika memang terpaksa diharuskan untuk membuat nilai null, di kotlin bisa menggunakan "?" (tanda tanya) setelah tipe datanya
        - Penggunaan fitur ini tidak direkomendasikan untuk dilakukan di kotlin, hanya sebagai jalan akhir jika misal mengakses kode java
     */

    var firstName: String? = null
//    firstName = "Willy"


    //dan cara mengakses function lainnya jika variable null adalah dengan tetap menambahkan "?" setelah nama variable nya
    println(firstName)
    println(firstName?.length)
}