package Function

fun main() {

    //Return If
    fun sayHello(name: String = ""):String{

//        if (name == ""){
//            return "Hello Bro"
//        }else{
//            return "Hello $name"
//        }
        return if (name == ""){
            "Hello Bro"
        }else{
            "Hello $name"
        }
    }

    //Return When
    fun sayHai(name: String = ""):String{

//        when(name){
//            "" -> return "Hai Bro"
//            else -> return "Hai $name"
//        }
        return when(name){
            "" -> "Hai Bro"
            else -> "Hai $name"
        }
    }

    println("================================= Return If =================================")

    println(sayHello())
    println(sayHello("Willy"))

    println("================================= Return When =================================")

    println(sayHai())
    println(sayHai("Willy"))
}