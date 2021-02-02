package Expression

fun main() {

    println("========================= IF =========================")

    val nilai = 90

    if (nilai > 75){
        println("Good Job")
    }else{
        println("Silahka coba lagi tahun depan")
    }

    println("========================= ELSE IF =========================")

    val nilaiUjian = 70

    if (nilaiUjian > 90){
        println("Cool")
    }else if (nilaiUjian > 75){
        println("Good Job")
    }else if (nilaiUjian > 65){
        println("Not bad")
    }else{
        println("Silahka coba lagi tahun depan")
    }
}