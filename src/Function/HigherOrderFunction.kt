package Function

fun main() {

    /*
        Higher order : - menjadikan function sebagai parameter di sebuah function
                       - dapat menggunak return
     */

    //parameter kedua berupa lambda yang input dan outputnya berupa string
    fun hello(name: String, transformer: (String) -> String): String {
        //memamggil lambda
        val nameTransform = transformer(name)

        return "Hello $nameTransform"
    }

    //dengan menggunakan lambda kita dapat mengganti jenis lambda yang kita buat (lambdaUpper & lambdaLower) untuk digenerate sesuai keinginan kita
    val lambdaUpper = { value: String -> value.toUpperCase() }
    val lambdaLower = { value: String -> value.toLowerCase() }
    println(hello("Willy", lambdaUpper))
    println(hello("Willy", lambdaLower))
    println(hello("Rahma", { value: String -> value.toLowerCase() }))

    /*
        - contoh dengan higherorder lambda biasa (result1) dan dengan trailing lambda (result2)
        - hanya bisa jika lambda nya ada di ujung parameter
     */

    val result1 = hello("willy", { value: String -> value.toLowerCase() })
    val reslut2 = hello("Willy") { value: String ->
        value.toLowerCase()
    }

    println(result1)
    println(reslut2)
}