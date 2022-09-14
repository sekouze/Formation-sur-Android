import kotlin.concurrent.thread

fun main() {
//    La programmation synchrome & assynchrone
    println("Je vien de me lancer :${Thread.currentThread().name}")

    thread{
        println("Je recupere des données depuis une API ${Thread.currentThread().name}")
        Thread.sleep(1000);
        println("J'ai fini la recuperation des données depuis  l'API ${Thread.currentThread().name}")

    }


    println("J'ai fini mon lancement :${Thread.currentThread().name}")


}