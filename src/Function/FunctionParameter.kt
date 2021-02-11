package Function

//function parameter
fun sayHello(name: String){
    println("Hello $name")
}

//function parameter with null
fun sayHai(firstName: String, lastName: String?){
    if (lastName == null){
        println("Hai $firstName")
    }else{
        println("Hai $firstName $lastName")
    }
}

//function default parameter
fun sayHolla(firstName: String, lastName: String=""){
    if (lastName == ""){
        println("Holla $firstName")
    }else{
        println("Holla $firstName $lastName")
    }
}

fun main() {

    println("================================== Function Parameter ==================================")

    sayHello("Ayah")
    sayHello("Ibu")
    sayHello("Kakek")

    println("============================= Function Parameter with null =============================")

    sayHai("Bruce", "Wayne")
    sayHai("Alfred", null)
    sayHai("Dick", "Grayson")

    println("=============================== Function Default Parameter ===============================")

    sayHolla("Clark", "Kent")
    sayHolla("Ell")
    sayHolla("Martha")
}