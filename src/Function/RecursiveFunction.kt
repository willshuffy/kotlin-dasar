package Function

fun main() {

    /*
        - Recursive function : function yang memanggil dirinya sndri
        - berikut ada function for loop dan function recursive untuk membedakan
     */

    //function for loop
    fun factorialLoop(value: Int): Int{
        var result = 1
        for (i in value downTo 1){
            result *= i
        }
        return result
    }

    println(factorialLoop(10))

    //function recursive
    fun factorialRecursive(value: Int): Int{
        return when (value){
            1 -> 1
            else -> value * factorialRecursive(value - 1)
        }
    }

    println(factorialRecursive(10))
}