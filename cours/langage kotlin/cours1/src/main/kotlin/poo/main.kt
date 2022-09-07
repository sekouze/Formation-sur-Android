package poo


fun main() {
//    var nom="keita"
//    var prenom="sekou"
//    var age=22
//
//    println("Nom: $nom,Prenom: $prenom,Age: $age")
//
//    var nom1="kourouma"
//    var prenom1="laye"
//    var age1=25
//
//    println("Nom: $nom1,Prenom: $prenom1,Age: $age1")
//
//    var nom2="keita"
//    var prenom2="youssouf"
//    var age2=18
//
//    println("Nom: $nom2,Prenom: $prenom2,Age: $age2")

    println("*******************Les infos de la personne1")
    val personne1=Personne("Keita","Sekou")
    val personne2=Personne("Traoré","Aicha")
    val personne3=Personne("Traoré")
    val personne=Personne()

    println( personne2.nom)


    println("Nom: ${personne1.nom.uppercase()},Prenom: ${personne1.prenom}")
    println(personne1.toString())

    println("*******************Les infos de la personne2")
    println(personne2.toString())


    val etudiant=Etudiant("Traoré","Aicha",15)
    println("*******************Les infos de l'etudiante")
    println(etudiant.toString())
    println("Nom: ${personne2.nom.uppercase()},Prenom: ${personne2.prenom}")

    println("-------------->Le nom de personne instancié est :${Personne.nbPersonne}")

    val mydatacla=MyDataClass("decrirer ma classe",true)
    val dC=mydatacla.copy(isCompleted = false)

    println("_______________________________________________________________________")
    println(mydatacla)



}