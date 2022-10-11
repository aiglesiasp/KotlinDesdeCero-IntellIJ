//BUCLES - REPEAT

fun main() {
    funcionRepeat()
}

//ESTRUCTURA REPEAT
fun funcionRepeat() {

    //Repite 10 veces y guarda el indice en posicion
    repeat(10) { posicion ->
        println(posicion)
    }

    println()
    //Repite 1 veces solo los pares
    repeat(10) {posicion ->
        if (posicion % 2 == 0) {
            println(posicion)
        }
    }

    println()
    //Si no pongo "posicion" puedo usar IT
    repeat(10) {
        println(it)
    }

    println()
    //Pasandole una variable
    val numRep = 5
    repeat(numRep) {
        println(it)
    }

    println()
    //Con un RETURN, saltamos de la funcion
    val numRep2 = 5
    repeat(numRep2) {
        println(it)
        if (it > 1)
            return
    }
}
