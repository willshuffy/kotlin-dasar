package Function

/*
    jika function dibuat di luar function main,
    maka function tersebut dapat dipanggil pada function manapun berada dalam project kotlin
 */

fun satu(){
    //error
//sayhello()
}

fun dua(){
    //error
//    sayhello()
}

fun main() {
    /*
        jika function dibuat di dalam function main,
        maka function tersebut tidak dapat dipanggil pada function di luar function main,
        hanya dapat dipanggil di function main
     */

    fun sayhello(){

        println("Hello World")
    }
    sayhello()
}

