package Function

/*
    - Varargs (variable arguments) : dalam function ini datanya bisa menerima lebih dari satu input atau dianggap seperti array
    - hanya dapat dijadikan pada parameter di posisi terakhir
 */

//fun hitungTotal(values: Array<Int>): Int{
fun hitungTotal(name: String, vararg values:Int): Int{
    var total = 0

    for (value in values){
        total += value
    }

    return total
}

fun main() {
//    val nilai = arrayOf(10,10,10,10)
//    val result = hitungTotal(nilai)
    val result = hitungTotal("Willy",10,10,10,10)


    println(result)
}