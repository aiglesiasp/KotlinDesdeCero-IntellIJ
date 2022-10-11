//LISTAS
//Son colecciones de tamaño variable de elementos
//Se pueden añadir elementos a la lista


fun main() {

    //Creando la primera Mutable List con mutableListOf
    println("MUTABLE LIST OF")
    val mutableList1 = mutableListOf(1,2,3,4,5)
    println(mutableList1)
    println()

    //Modificar valor de la lista
    println("Modificando valor de la lista")
    mutableList1[1] = 1
    println(mutableList1)
    println()

    //Añadir elemento al final con ADD
    println("Añadir un elemento - add()")
    mutableList1.add(99)
    println(mutableList1)
    println()

    //Borrar elemento de una posicion
    println("Borrar elemento en tal posicion - removeAT()")
    mutableList1.removeAt(3)
    println(mutableList1)
    println()

    //Añadir elemento en tal posicion
    println("Añadir elemento en tal posicion - add(indice, elemento)")
    mutableList1.add(1, 45)
    println(mutableList1)
    println()

    //Creando un ARRAY 2 de otra manera
    println("CREANDO LISTA2 DE MUCHOS ELEMENTOS")
    var mutableList2 = MutableList(10) {posicion ->
        posicion
    }
    println(mutableList2)
    println()

    //Añadiendo elementos a la lista2
    println("Añadiendo elementos a la segunda lista")
    mutableList2.add(99)
    println(mutableList2)
    println()

    //Creando LISTA 3 vacia
    println("CREANDO LISTA3 VACIA DE ENTEROS")
    var mutableList3 = mutableListOf<Int>()
    println(mutableList3)
    println()




}