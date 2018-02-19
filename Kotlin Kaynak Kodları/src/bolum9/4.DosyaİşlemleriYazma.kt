package bolum9

import java.io.FileWriter

fun main(args: Array<String>) {

    print("Birşeyler yazınız. Bunlar dosyaya yazılacak")
    var value = readLine()!!

    try {
        var file = FileWriter("src/FirstFile.txt",true)
        file.write(value+"\n")
        file.close()
        println("Girilen veri dosyaya yazıldı")

    } catch (ex: Exception) {
        println("Hata meydana geldi:" + ex.toString())
    }



}
