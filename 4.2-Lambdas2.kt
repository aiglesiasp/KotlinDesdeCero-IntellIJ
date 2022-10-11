//LAMBDAS

/*
HEMOS VISTO LMBDAS EN:
    - Repeat(X) {}
    - lista.forEach{}
    - if {}
 */
fun main() {

    //REPEAT
    println("TIPO REPEAT")
    //Con lambda
    println("- Con LAMBDAS")
    repeat(5, {num: Int -> println(num)})
    //De la manera normal
    println(" -NORMAL")
    repeat(5) {num: Int ->
        println(num)
    }
    println()

    //LISTAS
    println("TIPO LISTAS FOREACH")
    var l = listOf(1,2,3,4,5)
    //Con lambda
    println("- Con LAMBDAS")
    l.forEach({elemento : Int -> println(elemento)})
    //De la manera normal
    println(" -NORMAL")
    l.forEach { elemento : Int -> println(elemento) }
    println()

    //LAMBDAS
    println("PASANDO LAMBDA AL FOREACH")
    var miLambda = { elemento : Int ->
        var out = elemento * 2
        println(out)
    }
    l.forEach(miLambda)
}