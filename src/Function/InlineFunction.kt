package Function

/*
    inline function : - merupakan function yang dibuat untuk mencegah pengulangan pembuatan object secara background yang dapat menimbulkan penurunan performa project
                      - tanpa menggunakan inline akan selalu berulang membuat objectnya, dengan function inline akan terduplicate isi functionnya dan ini tidak memakan proses di backgroundnya
                      - secara struktur code, tidak ada perbedaan pada function biasanya, hanya ditambahkan inline, dan dapat terlihat perbedaannya jika dilihat dengan decompile menjadi java code
                      - sebaiknya penggunaan function inline hanya untuk digunakan untuk sebuah pengulangan data yang cukup banyak saja, agar tidak terlalu banyak function yang terduplicate pada bytecode nya
 */

//inline function
inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

/*
    noinline function : - by default saat function dijadikan inline, maka semua parameter akan menjadi inline
                        - jika ingin membuat salah satu parameter, kita bisa menandakan parameter tersebut dengan noinline
 */

//inline function with noinline
inline fun hai(firstName: () -> String,
               noinline lastName: () -> String): String {

    return "Hai ${firstName()} ${lastName()}"
}

fun main() {
    for (i in 0..100) {
        println(hello { "Willy" })
    }

    for (i in 0..100) {
        println(hai({ "Willy" }, { "Saputra" }))
    }
}