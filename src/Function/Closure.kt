package Function

fun main() {

    /*
        closure : kemampuan untuk mengakses seluruh data di sekitarnya dan dapat merubahnya (disarankan untuk berhati" menggunakan closure karena sangat mudah untuk mengubah data)
     */

    var counter: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("Lambda increment")

        counter++
    }

    val anonymousIncrement= fun (){
        println("Anonymous Increment")

        counter++
    }

    fun functionIncrement(){
        println("Function Increment")
        counter++
    }
    
    
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    
    println(counter)
    
}