package poo.AnimalsInterface

fun main() {
    val chat1=Chat("mimi")
    val chat2=Chat("juliette")
    val chat3=Chat("julie")

    var listeAnimals= listOf<IAnimal>(chat1,chat2,chat3)


    println("**********************La liste de tout les animaux")

    for (animal in listeAnimals){
        println(animal.deplacement())
        println(animal.cris())
        println(animal.manger())

        println("___________________________________________________________")
    }




}