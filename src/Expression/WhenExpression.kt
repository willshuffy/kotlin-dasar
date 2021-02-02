package Expression

fun main() {

    println("================================= When Expression =================================")

    val finalExam = 'A'

    when (finalExam){
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try again next year")
        else -> println("Not found")
    }

    val ujianAkhir = "F"

    when (ujianAkhir){
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not Bad")
        }
        "D" -> {
            println("Bad")
        }
        else -> {
            println("Try again next year")
        }
    }

    println("========================= When Expression Multiple Option =========================")


    val nilaiUjian = "B"

    when (nilaiUjian){
        "A","B","C" -> {
            println("Selamat anda lulus")
        }
        else -> {
            println("Maaf, anda tidak lulus")
        }
    }

    println("=============================== When Expression In ================================")

    val nilai = "C"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (nilai){
        in nilaiLulus -> println("Congratulation")
        !in nilaiLulus -> println("Sorry...")
    }

    println("=============================== When Expression Is ================================")

    val name = "Willy"

    when (name){
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    println("========================= When Expression tanda variable =========================")

    val nilaiKelulusan = 85
    when{
        nilaiKelulusan > 90 -> println("Mantab")
        nilaiKelulusan > 80 -> println("Sipokeh")
        nilaiKelulusan > 70 -> println("Cukup")
        else -> println("Ngulang tahun depan")
    }

}