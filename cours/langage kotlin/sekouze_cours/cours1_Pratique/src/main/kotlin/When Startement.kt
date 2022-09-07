fun main(){
    println("Saississez un nombre compris entre 1 et 7 et je vous donne le jour correspondant")
    var jour = readLine()!!.toInt()
    when(jour){
        1-> println("LUNDI")
        2-> println("MARDI")
        3-> println("MERCREDI")
        4-> println("JEUDI")
        5-> println("VENDREDI")
        6-> println("SAMEDI")
        7-> println("DIMANCHE")
        else -> println("desoler veuillez saisir 1 ou 7 pour avoir le jour correspondant")

    }
}