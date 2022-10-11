//EJERCICIO LAMBDAS
//Transformar las siguientes funciones en Lambdas y ejecutarlas
/*
//FUNCION 1
fun lambda1() {
    println("Esta Lambda escribe: Hola")
}
//FUNCION 2
fun lambda2 (integer: Int) {
    println("Esta Lambda recibe un Int y lo escribe: $integer")
}
//FUNCION 3
fun ejercicio3 (posicion: Int, list: List<Any>) {
    println("Esta Lambda recibe un Int y una Lista.")
    println("Escribe al elemento que haya en la posicion ${list[posicion]}")
}
*/

fun main() {
    //FUNCION 1 con LAMBDAS
    println("FUNCION 1")
    val lambda1 = { println("Esta Lambda escribe: Hola") }
    lambda1()
    println()

    //FUNCION 2 con LAMBDAS
    println("FUNCION 2")
    val lambda2 = { integer: Int -> println("Esta Lambda recibe un Int y lo escribe: $integer") }
    lambda2(4)
    println()

    //FUNCION 3 con LAMBDAS
    println("FUNCION 3")
    val lambda3 = { posicion: Int, list: List<Any> ->
        println("Esta Lambda recibe un Int y una Lista.")
        println("El elemento de la posicion $posicion es:  ${list[posicion]}")
    }
    val list1 = listOf("Hola", 0, 'c', 2.25)
    lambda3(1, list1)
    println()
}

