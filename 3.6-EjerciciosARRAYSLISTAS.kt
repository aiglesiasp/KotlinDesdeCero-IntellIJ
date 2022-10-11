import kotlin.random.Random
import kotlin.random.nextInt

//EJERCICIO - ARRAYS y LISTAS
fun main() {

    //Creando listaRandom
    println("EJERCICIO 1")
    //Imprimir pantalla
    println("IMPRIMIENDO LISTA RANDOM")
    crearListaRandom()
    println()

    println("EJERCICIO 2")
    separarListas()
    println()

}

//EJERCICIO 1
/*
Crea una lista "listaRandom" de 100 elementos compuesta de numeros aleatorios comprendidos entre el 0 y el 9
Imprime la lista por pantalla
 */
/*
Crear una lista vacia "listaResultado" en cuya posicion...
    - Posicion 0 se debe contar cuantos 0 hay en la listaRandom
    - Posicion 1 se debe contar cuantos 1 hay en la listaRandom
    - etc. con todos los numeros
 */
fun crearListaRandom() {
    //Crear lista Random
    var listaRandom = MutableList(100) {
        Random.nextInt(0..9)
    }
    listaRandom.forEachIndexed { index, elemento ->
        println("En el indice $index tenemos el elemento: $elemento")
    }

    //Crear lista vacia "listaResultado"
    println("Creando lista vacia listaResultado")
    var listaResultado = MutableList(10){
        0
    }
    println(listaResultado)

    //Recorrer listaRandom para guardar los elementos
    println("Recorriendo lista")
    listaRandom.forEach {
        listaResultado[it]++
    }

    println(listaResultado)
}

//EJERCICIO 2
/*
Crear lista de varios elementos
val lista = listOf("H", 1, 2, "o", "I", 1.0, "a", 0.3, "!")
Realiza un programa que sume todos los numeros de la lista
Concatena todos los Strings en uno unico
 */

fun separarListas() {
    val lista = listOf("H", 1, 2, "o", 0.2, "l", 1.0, "a", 0.3, "!")
    var stringConcatenado = ""
    var suma = 0.0

    lista.forEach {
        it is String
        when {
            it is Int -> suma += it
            it is Double -> suma += it
            it is String -> stringConcatenado += it
        }
    }
    println("Los strings concatenados dan esto: $stringConcatenado y el sumatorio es igual a: $suma")
}