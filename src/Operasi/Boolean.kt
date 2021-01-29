package Operasi

fun main() {

    /*
        operator boolean :

        &&  (konjungsi)
        ||  (disjungsi)
        !   (negasi)
     */

    val nilaiUjian = 85
    val nilaiAbsen = 80
    val nilaiExtra = 70

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahLulusExtra = nilaiExtra > 75

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusExtra
//    val apakahLulus = (apakahLulusUjian && apakahLulusAbsen) && apakahLulusExtra
//    val apakahLulus = ((apakahLulusUjian && apakahLulusAbsen) && apakahLulusExtra)

    println(apakahLulus)
}