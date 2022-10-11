//LISTAS
//No son mutables, no puedo añadir elementos


fun main() {

    //CREANDO NUESTRA PRIMERA LISTA CON VAL
    println("Primera Lista con LIST y VAL")
    val lista1 = List(5) {
        "Tengo el elemento ${it * 5}"
    }
    println(lista1)
    println()

    //NO SE PUEDEN AÑADIR NI BORRAR ELEMENTOS
    //TAMPOCO PODEMOS CAMBIAR LOS VALORES DE LOS ELEMENTOS
    // list1 = listOf("Hola") Esto no se puede hacer ya que es val

    //CREANDO SEGUNDA LISTA CON VAR
    println("Segunda Lista con LIST y VAR")
    var lista2 = List(5) {
        "Tengo el elemento ${it * 10}"
    }
    println(lista2)
    println()

    //Puedo asignarle otra lista
    println("Modificando LISTA2")
    lista2 = listOf("Hola", "Adios")
    println(lista2)
    println()

    //Puedo modificar la lista2 a mutableList
    println("Pasar a mutableList y crear copia en lista3")
    var mutableList3 = lista2.toMutableList()
    mutableList3.add("!")
    println(mutableList3)

}