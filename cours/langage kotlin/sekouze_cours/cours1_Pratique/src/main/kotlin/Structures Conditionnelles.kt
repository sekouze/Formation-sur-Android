fun main(){
    println("Veuillez entrer votre age pour avoir accès:")
    var age:Int = readLine()!!.toInt()

    //condition
    if (age== 18 ){
        //Traitement
        println("Bienvenue dans notre maison de 18 ans")
    }else if (age > 18 ){
        //Traitement
        println("Bienvenue dans notre maison plus de 18 ans")
    }else{
        //Traitement à exécuter quant la condition est fausse
        println("Vous n'êtes pas la bienvenue")
    }
}