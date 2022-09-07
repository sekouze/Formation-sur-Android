package exercice

class Chien {
    lateinit var nom:String
    lateinit var race:String
    var age:Int=0

    constructor(nom:String,age:Int,race:String){
        this.nom=nom
        this.age=age
        this.race=race
    }

    override fun toString(): String {
        return "Chien(nom='$nom', race='$race', age=$age)"
    }


}