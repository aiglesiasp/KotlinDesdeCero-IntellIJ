//RECORRER LISTAS
// for y forEach


fun main() {

    //Creo lista 2
    var lista2 = List(5) {
        "Tengo el elemento ${it * 10}"
    }
    //La paso a mutable
    var mutableList3 = lista2.toMutableList()

    //Recorrer Lista con FOR
    println("RECORRER LISTA CON UN FOR")
    for (elemento in mutableList3){
        println(elemento)
    }
    println()

    //Recorrer Lista con FOREACH
    println("RECORRER LISTA CON FOREACH")
    mutableList3.forEach {elemento ->
        println(elemento)
    }
    println()

    //Recorrer Lista con FOREACH INDEXED
    println("RECORRER LISTA CON FOREACH INDEXED")
    mutableList3.forEachIndexed { index, elemento ->
        println("En la posicion $index se ha guardado lo siguiente: $elemento")
    }
    println()


}