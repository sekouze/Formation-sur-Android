fun main(){
    println("Saississez un nombre compris entre 1 et 7 et je vous donne le jour correspondant")
    var jour = readLine()!!.toInt()
    if (jour == 1){
        println("Dimanche")
    } else if (jour == 2) {
        println("Lundi")
    } else if (jour == 3) {
        println("Mardi")
    } else if (jour == 4) {
        println("Mercredi")
    } else if (jour == 5) {
        println("Jeudi")
    } else if (jour == 6) {
        println("Vendredi")
    } else if (jour == 7) {
        println("Samedi")
    }else{
        println("Désolé veuillez entrer un nombre compris entre 1 et 7 pour voir le jour correspondant")
    }
}