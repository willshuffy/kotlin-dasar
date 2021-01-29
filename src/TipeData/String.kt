package TipeData

fun main() {

    //contoh string yang hanya membutuhkan 1 line saja
    val firstName: String = "Willy"
    val lastName: String = "Saputra"

    //contoh string yang membutuhkan lebih dari 1 line
    /*
        menggunkan timIndent muncul secara default ketika setelah
        mengetik kutip 3kali, dan tanpa menggunakan marginPrefix
     */
    val addressHome: String = """
        Jl.KRT Radjiman
        kp.pulo jahe
        no97b
    """.trimIndent()

    /*
        membutuhkan marginPrefix untuk menentukan awal pencetakan,
        jika tidak maka akan ada spasi sebleum isi string
     */
    val addressOffice: String = """
        -Jl.Tebet Dalam II
        -Jakarta Selatan
        -No. 22
    """.trimMargin("-")


    println(firstName)
    println(lastName)
    println()
    println(addressHome)
    println()
    println(addressOffice)


    //Penggabungan beberapa String dengan simple expession
    val fullName: String = "$firstName $lastName"
    println()
    println(fullName)

    //penggabungan beberapa String dengan kompleks expression atau menggabungkan dengan function lain
    val descName: String = "$fullName memiliki ${fullName.length} karakter"
    println()
    println(descName)
}