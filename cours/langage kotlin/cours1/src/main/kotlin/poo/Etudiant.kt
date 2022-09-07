package poo

class Etudiant() :Personne() {
     var age:Int=0

    constructor(nom:String, prenom:String,age:Int):this(){
        this.nom = nom
        this.prenom = prenom
        this.age=age
    }
}