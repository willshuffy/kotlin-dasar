package Variable

/*
    - Constan adalah imutable data yang biasanya diakses untuk keperluan global (dapat diakses di manapun)
    - biasanya menggunakan UPPER_CASE
    - penulisannya hanya dapat di luar function
    - jika di dalam class, dibutuhkan copanion object
 */

const val APP_NAME = "Project Kotlin"
const val VERSION = "0.0.1"

fun main() {

    println("Welcome to $APP_NAME version : $VERSION")

}