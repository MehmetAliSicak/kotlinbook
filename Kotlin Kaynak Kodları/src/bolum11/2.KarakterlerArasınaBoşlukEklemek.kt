package bolum11

fun main(args: Array<String>) {

    print("Lütfen bir veri giriniz:")
    var text = readLine()!!

    for (char in text){
        print(char)
        print(" ")
    }
}
