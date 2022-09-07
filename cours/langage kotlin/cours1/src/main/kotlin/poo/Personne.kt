package poo


//creation d'une classe par defaut
//class Personne {
//    var nom:String="Keita"
//    var prenom:String="Sekou"
//    var age:Int=23
//}


//creation d'une classe avec un constructeru d'initialisation
//class Personne (nom:String,prenom:String,age:Int){
//    var nom:String
//    var prenom:String
//    var age:Int
//
//    init {
//        this.nom=nom
//        this.prenom=prenom
//        this.age=age
//    }
//
//    override fun toString(): String {
//        return "Personne(nom='$nom', prenom='$prenom', age=$age)"
//    }
//}

//creation d'une classe avec un constructeru d'initialisation suchargé
open class Personne (){
    lateinit var nom:String
    lateinit var prenom:String


    constructor(nom:String, prenom:String):this(){
        this.nom = nom
        this.prenom = prenom
        nbPersonne++

    }
    constructor(nom:String):this(){
        this.nom = nom
        nbPersonne++
    }

    companion object{
        var nbPersonne=0
    }

    override fun toString(): String {
        return "Personne(nom='$nom', prenom='$prenom')"
    }


}