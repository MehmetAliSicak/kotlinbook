package bolum9

import java.io.FileReader

fun main(args: Array<String>) {
    /*try {
        var file = FileReader("src/FirstFile.txt")
        var readingData: Int
        do {
            readingData = file.read()
            print(readingData.toChar())
        } while (readingData != -1)

        file.close()
    } catch (ex: Exception) {
        println("Hata meydana geldi:" + ex.toString())
    }*/

    /*try {
        var file = FileReader("src/FirstFile.txt")
        var readingData: Int
        do {
            readingData = file.read()
            println(readingData.toChar()+":"+readingData)
        } while (readingData != -1)

        file.close()
    } catch (ex: Exception) {
        println("Hata meydana geldi:" + ex.toString())
    }*/

    var file = FileReader("src/FirstFile.txt")
    file.forEachLine {
        println(it)
    }

}
