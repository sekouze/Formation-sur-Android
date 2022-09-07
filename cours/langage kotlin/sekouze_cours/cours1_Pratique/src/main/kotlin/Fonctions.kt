fun main(){
    val result = addition(10, 30)
    println(result)
    addition(10, 5)
    addition(10, 20)
    addition(10, 8)
    //on ne pas obliger de respecter l'ordre
    AfficheInformations(nomEtPrenom= "Thierno Ousmane", age=18, profession= "Informaticien", salaire= 5000.0)

}
fun addition(n1: Int, n2: Int)= n1 + n2


fun AfficheInformations(nomEtPrenom: String,age:Int,profession:String,salaire:Double){
    println("Je suis $nomEtPrenom, j'ai $age ans, je suis $profession de profession et j'ai un salaire de $salaire GNF")
}
