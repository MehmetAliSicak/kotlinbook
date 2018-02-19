import kotlin.browser.document

fun main(args: Array<String>) {

    /*var message = "Kotlin'den JavaScript'e merhaba:)"
    println(message)*/


    /*val PI = 3.14

    var h1 = "Kotlin'de DOM ile HTML etiketlerine erişmek"

    var title = "Tıklayınız"

    val divContent = """
            <h1> $h1 </h1>
            <p> $PI </p>
            <button id = "btn"> $title </button>
            """
    var root = document.getElementById("root")

    root!!.innerHTML= divContent

    var btn = document.getElementById("btn")

    btn!!.addEventListener("click",{println("butona tıklandı")})*/

    var root = document.getElementById("root")

    var h1 = document.createElement("h1")

    h1.textContent="Merhaba bu başlık Kotlin'den"

    var btn = document.createElement("button")

    btn.textContent="Tıklayınız"

    btn!!.addEventListener("click",{println("Butona tıkladınız")})


    root!!.appendChild(h1)
    root!!.appendChild(btn)


















}
