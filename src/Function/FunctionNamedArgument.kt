package Function

fun fullName(firstName: String,
             middleName: String,
             lastName: String
) {
    println("Hello $firstName $middleName $lastName")
}

fun main() {

    //jika tanpa named argument akan waib berurutan dalam pemanggilan parameternya
    fullName("Willy", "Rahma", "Saputra")

    //jika dengan named argument bisa secara random memamngil parameternya
    fullName(lastName = "Saputra",
            firstName = "Willy",
            middleName = "Rahma")
}