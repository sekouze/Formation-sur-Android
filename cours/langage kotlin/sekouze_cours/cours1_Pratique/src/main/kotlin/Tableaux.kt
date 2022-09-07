fun main (){

    val moyenne = arrayOf(10,9,15,16,17,18)
    val premierElement = moyenne.get(moyenne.size-1)
    println(premierElement)
    val animaux = arrayOf<String>("Chat","Chien","Lion","Loup")

    animaux[0]="Tigre"
    println(animaux.contentToString())


    val animaux2 = mutableListOf<String>("Chèvre","Brebis","Poule","Python")

    //PARCOURS D'un tablau avec la boucle for
    //LA BOUCLE FOR

    for(element in animaux2){
        println(element)
    }
        for (i in 100 downTo 1 step 10){
            println(i)
        }

    //LA BOUCLE REPEAT
    repeat(times = 10){
        println("Bonjour")
    }


    //LA BOUCLE WHILE IL VERIFIE LA CONDITION AVANT DE TESTER
    var compteur =5
    while (compteur < 5){
        println(compteur)
        compteur +=1
    }

    //LA BOUCLE DO WHILE IL TESTE AU MOINS UNE FOIS LE CODE
    var compteur2 = 5
    do {
        println("do while: $compteur2")
        compteur2 +=1
    }while (compteur2<5)

}


