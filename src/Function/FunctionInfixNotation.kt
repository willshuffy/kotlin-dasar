package Function

infix fun String.to(type: String): String{
    if (type == "UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

fun main() {
    val result = "Willy Saputra" to "UP"
    println(result)

    /*/
        nb : function ini familiar dengan fungsi down to, step yang sering digunakan pada tipe data Range,
             karena memang merupakan function infix secara low level jika dicek dengan ctrl + klik fungsi
                100 Down to 1
                1..100 step 2
     */
}