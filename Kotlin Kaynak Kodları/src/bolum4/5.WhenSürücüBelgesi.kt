package bolum4

import java.util.*

fun main(args: Array<String>) {
    print("Doğrum tarihini giriniz:")
    var year:Int = readLine()!!.toInt()

    var age:Int = Calendar.getInstance().get(Calendar.YEAR) - year

    var result = when(age){
        in 16..18 -> "M, A1 ve B1 sınıfı ehliyet alabilirsiniz."
        in 19..20 -> "A2, B, BE, C1, C1E, F ve C sınıfı ehliyet alabilirsiniz."
        21 -> "A sınıfı ehliyet alabilirsiniz."
        in 22..24 -> "C, CE, D1 ve D1E sınıfı ehliyet alabilirsiniz."
        in 25..40 -> "D ve DE sınıfı ehliyet alabilirsiniz."
        else -> {
            "Ehliyet almak için en az 16 yaşında olmanız gerekiyor"
        }
    }

    print(result)
}
