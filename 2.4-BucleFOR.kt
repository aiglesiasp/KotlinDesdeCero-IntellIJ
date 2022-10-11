//BUCLE FOR

fun main() {
    println("BUCLE FOR")
    funcionFor()
    println("BUCLE FOR CON PARES")
    funcionForPar()
}

//Funcion FOR de 0..9
fun funcionFor() {
    for(i in 0..9) {
        println(i)
    }
}

//Funcion FOR solo con PARES
fun funcionForPar() {
    for(i in 0..9) {
        if (i % 2 ==0 )
            println(i)
    }
}
