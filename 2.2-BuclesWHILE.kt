// BUCLE WHILE
//Ojo con los casos de bucles infinitos
fun main() {
    println("FUNCION WHILE")
    funcionWhile()
    println("FUNCION WHILE PARES")
    funcionWhilePares()
    println("FUNCION WHILE RETURN")
    funcionWhileReturn()
}

//Funcion While normal
fun funcionWhile() {
    var num = 0
    while (num < 10) {
        println(num)
        num++
    }
}

//Funcion While que imprime pares
fun funcionWhilePares() {
    var num = 0
    while (num < 10) {
        if (num % 2 == 0 ) {
            println(num)
        }
        num++
    }
}

//Funcion While con Return
fun funcionWhileReturn() {
    var num = 0
    while (num < 10) {
        if (num > 5)
            return
        println(num)
        num++
    }
}

//Podemos usar el BREAK para continuar