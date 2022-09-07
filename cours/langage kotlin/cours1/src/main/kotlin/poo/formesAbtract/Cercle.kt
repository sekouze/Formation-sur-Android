package poo.formesAbtract

class Cercle: Forme() {
    override fun dessiner() {
        println("dessiner le cercle.....")
    }

    override fun colorer() {
        println("colorer le cercle")
    }
}