package TipeData

fun main() {

    val family: Array<String> = arrayOf("Ayah", "ibu", "kakak", "adik")

    val values: Array<Int> = arrayOf(10, 100, 1000)

    //mengubah isi index array
//    family.set(0, "kakek")
    family[0] = "nenek"

    //mencetak array sesuai index nya
    println(family[0])
    println(values[2])

    //mencetak banyaknya index array
    println(family.size)
    println(values.size)


    println("============= ARRAY NULLABLE =============")

    val foods: Array<String?> = arrayOfNulls(5)
    println(foods[0])

    val foods2: Array<String?> = arrayOfNulls(5)
    foods2[0]="nasi"
    foods2[1]="sayur"
    foods2[2]="lauk"
    foods2[3]="buah"
    foods2[4]="susu"
    println(foods2[4])

    /*
        jika ada index yang diset null, maa banyanya index tidak berkurang
     */
    val foods3: Array<String?> = arrayOfNulls(5)
    foods2[0]="nasi"
    foods2[1]="sayur"
    foods2[2]="lauk"
    foods2[3]= null
    foods2[4]="susu"
    println(foods3.size)

}