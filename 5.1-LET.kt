//LET
//Es una funcion

/*
PROBLEMA DE LOS NULOS
Hasta ahora hemos visto la programacion secuencial. Pero existe la programacion concurrente que presenta nuevos desafios
No nos deja acceder a variables que pueden ser nulas
println(texto.toInt())  -> esto no se puede hacer

Solucion Posible pero tampoco deja, ya que puede ser que en otro momento despues del IF alguien modifique ese valor
if (texto != null)
    println(texto.toInt())

Para ello utilizamos LET
LET ES UNA FUNCION MUY USADA EN KOTLIN. SUS FUNCIONAMIENTOS SE:
    - SE APLICA SOBRE CUALQUIER VARIABLE
    - COMO ARGUMENTO RECIBE UNA LAMBDA
            - La lambda solo se ejecuta si la variable no es null
            - La Lambda recibe una copia de la variable no nullable
 */


var texto : String? = "1"

fun main() {

    //Con el LET se genera una copia local "IT" del valor de texto, haciendo que de esta manera no se vea afectada
    println("USANDO LET PARA IMPRIMIR PANTALLA DE VALORES POSIBLES NEGATIVOS")
    texto.let {
        println(it)
    }
    println()

    //Comprovando si es NULL para imprimir
    println("COMPROVANDO SI ES NULL")
    texto.let {
        if(it!=null) {
            println("No es NULL")
            println(it.toInt())
        } else
            println("Es NULL")
    }
    println()

    //SI USO INTERROGANTE, SOLO SE EJECUTA SI ES NULL
    println("USANDO INTERROGANTE")
    texto?.let {
        println("NO ES NULL TAMPOCO")
        println(it.toInt())
    }
}
