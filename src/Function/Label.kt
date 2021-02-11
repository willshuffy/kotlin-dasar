package Function

/*
    - label adalah penanda
    - Semua expression pada kotlin bisa ditandai dengan label
    - penulisannya dengan nama label dan @ tanpa spasi
    - bisa diintegrasikan dengan break, continue, return
    - disarankan untuk tidak terlalu banyak menggunakan label, karena jika sudah terlalu banyak menggunakan label, maka aken sulit mentrace kemana saja perpindahan label yang dipanggil

 */

//contoh break to label
fun labelBreak(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            if (i > 5){
                break@loopI //jika hanya break saja, maka hanya bisa menghentkan proses di blok kode tempat break berada
                // namun dengan memanggil label, kita bisa menentukan ke label mana (label yang dipanggil) kode akan berhenti
            }
            println("$i * $j = ${i*j}")
        }
    }
}

//contoh continue to label
fun labelContinue(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            if (j == 5){
                continue@loopI //jika hanya continue saja, maka hanya bisa menghentkan proses di blok kode tempat continue berada
                // namun dengan memanggil label, kita bisa menentukan ke label mana (label yang dipanggil) kode akan berhenti
            }
            println("$i * $j = ${i*j}")
        }
    }
}

fun main() {

    //contoh return to label
    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)  //menggunakan single function

    test("Willy")test@{
        if (it == ""){
            return@test //lambda secara default tidak memilki return
                        // jika tidak ada label, maka return tidak dapat digunakan
                        // dengan adanya label, maka kita dapat menggunakan return pada lambda
        }else{
            println("Rahma")
        }
    }

}
