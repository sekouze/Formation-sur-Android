package poo.formesAbtract

fun main() {
    //Les classes abtraites
    val cercle= Cercle()

    cercle.dessiner()
    cercle.colorer()

    println(cercle.couleur)

}