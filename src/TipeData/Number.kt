package TipeData

fun main() {

    /*
        tipe data integer hanya maksal sampai 2 milyar,
        lebih dari akan error, jika membutuhkan lebih dari itu disarankan
        menggunakan tipe data Long
     */
    var age: Int = 200
    println(age)

    /*
        untuk menggunakan tipe data float, maka mesti ditambahka huruf "F" di akhir angka,
        jika tidak maka akan dianggap tipe data double
     */
    var sample: Float = 10.11F
    println(sample)

    /*
        untuk mencetak hexadecimal maka ditambahkan 0xFF
     */
    var hexadecimal : Int = 0xFF33
    println(hexadecimal)

    /*
        unutk menghasilkan tipe data binary mesti di sisipkan huruf b,
        jika tidak akan dianggap integer, dan inputan hanya 01 saja, selain itu maka akan error
     */
    var binary: Int = 0b010101010
    println(binary)

    /*
        fitur underscore berfungsi untuk pembatas/separator memudahkan membaca bilangan yang
        sangat banyak pada tipe data integer maupun Long, dan untuk tipe data Long mesti di tambahkan huruf "L"
     */
    var price: Long = 9_000_000_000L
    println(price)


    println("========================= CONVERTION =========================")

    /*
        contoh konversi yang salah, karena jika konversi dari Long ke Integer yag melebihi dari batas tipe data Integer 2 milyar,
        maka akan mengalami over flow
     */
    var priceInt : Int = price.toInt()
    println(priceInt)

    var doubleBinary: Double = binary.toDouble()
    println(doubleBinary)

    var binaryAge: Float = age.toFloat()
    println(binaryAge)

    //convert to binary
    var priceBinary: String = price.toString(2)
    println(priceBinary)
}