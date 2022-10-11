import kotlin.random.Random

//RECORRIENDO ARRAYS
//for y forEach(){}

fun main() {

    //Creamos un array de INT de 10 elementos con valores aleatorios
    val array7 = Array(10) {
        "En la posicion $it guardamos un ${Random.nextInt(0, 100)}"
    }

    //RECORRER ARRAY CON REPEAT
    println("RECORRER ARRAY CON REPEAT")
    repeat(array7.size){ posicion->
        println(array7[posicion])
    }
    println()

    //RECORRER ARRAY CON FOR
    println("RECORRER ARRAY CON FOR")
    for (i in array7) {
        println(i)
    }
    println()

    //RECORRER ARRAY CON FOREACH
    println("RECORRER ARRAY CON FOREACH")
    array7.forEach { elemento ->
        println(elemento)
    }
    println()

    //RECORRER ARRAY CON FOREACH INDEXED
    println("RECORRER ARRAY CON FOREACH INDEXED")
    array7.forEachIndexed { index, elemento ->
        println("En la posicion $index se encuentra el elemento:  $elemento")
    }
    println()



}