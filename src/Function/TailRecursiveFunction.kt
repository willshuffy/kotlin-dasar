package Function

fun main() {

    /*
        merupakan function untuk menghindari stack overflow akibat terlalu banyak pemanggilan dirinya sendiri
     */

    tailrec fun display(value: Int){
        println("Recursive $value")
        if (value > 0){
            display(value -1)
        }
    }

    display(10)

    tailrec fun factorialRecursive(value: Int, total: Int = 1): Int{
        return when (value){
            1 -> total
            else -> factorialRecursive(value -1, total*value)
        }
    }

    println(factorialRecursive(10))
}