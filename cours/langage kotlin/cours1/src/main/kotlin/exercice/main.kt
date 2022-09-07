package exercice

fun main() {
    val chien1=Chien("boubou",2,"blanche")
    val chien2=Chien("george",1,"blanche")
    val chien3=Chien("baré",5,"noir")

    val    listeChiens= listOf<Chien>(chien1,chien2,chien3)


    println("**************************Voici la liste de tout vos chien enregistré*******************************")
    for ( chien in listeChiens){
        println(chien)
    }
}