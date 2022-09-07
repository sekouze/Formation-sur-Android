package poo.formesAbtract

abstract class Forme {
    var couleur:String=""
    init {
        couleur="bleu ciel"
    }
    abstract fun dessiner()
    abstract fun colorer()
}