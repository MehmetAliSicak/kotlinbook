package bolum4

fun main(args: Array<String>) {
    print("Lütfen bir rakam giriniz:")
    var x: Int = readLine()!!.toInt()

    var result = when (x) {
        in 1..5 -> "Girilen rakam: $x"
        else -> {
            println("Başka kodlar")
            "1,2,3,4 ve 5 ten farklı bir rakam girdiniz."
        }
    }

    print(result)
}
