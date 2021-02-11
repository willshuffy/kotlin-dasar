package Function

fun main() {

    fun hello(name: String, transformer: (String) -> String): String{
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }


    /*
        anonymous function : mirip seperti lambda namun untuk variable yang lebih kompleks (contoh If else),
        dan dari parameter yang berada paling ujung
     */
    val upper = fun(value: String): String{
        if (value == ""){
            return "UPS..."
        }else{
            return value.toUpperCase()
        }
    }

    println(hello("Rahma", upper))
    println(hello("", upper))

    //dan bisa dapat langsung dimasukan ke parameter (anonymous function as parameter)
    println(hello("UMARU", fun (value: String): String{
        return value.toLowerCase()
    }))
}