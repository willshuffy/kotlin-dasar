package Function

fun toUpper(value: String): String = value.toUpperCase()

fun main() {

    /*
           Lambda Expression : - function yang tidak memiliki nama
                               - bisa langsung membuat function tanpa harus mendeklarasikan function itu sendiri (tanpa kata kunci fun dll)
                               - function dapat langsung dimasukan ke variable, array, atau parameter
                               - tanpa harus menggunakan return
     */


    //contoh lambda pada variable
    val contohLambda: (String, String) -> String = {firstName: String, LastName: String ->
        val result = "$firstName $LastName"
        result //secara default menjadi return value
    }

    val result = contohLambda("Willy", "Saputra")
    println(result)


    //kode it dipakai jika parameter yg dimiliki hanya satu dan tidak perlu dideklarasikan kembali, hanya panggil It saja
    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Batman"))

    //menggunakan methode reference (::) untuk mejadikan function lain menjadi lambda expression
    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("willy"))
}