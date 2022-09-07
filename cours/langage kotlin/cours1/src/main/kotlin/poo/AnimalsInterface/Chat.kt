package poo.AnimalsInterface

class Chat(override var nom: String) :IAnimal {
    override fun deplacement() {
        println("Je suis $nom et je me deplce sur 4 pattes")
    }

    override fun cris() {
        println("Je suis $nom et je cris miaouuuuuu!!!!!!!!!")
    }

    override fun manger() {
        println("je suis $nom et je mange de la viande")
    }

    override fun toString(): String {
        return "Chat(nom='$nom')"
    }
}