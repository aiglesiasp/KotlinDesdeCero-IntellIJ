/*
LAMBDAS
Es una fporma resumida de declarar una funcion, simplemente usando {}
Pueden:
    - Asignarse a variables
    - Ser/pasarse como parametros de una funcion
    - Ejecutarse cuando se desee

    Asi defino una lambda
    {
        println("Me estoy ejecutando dentro de una lambda")
    }
*/

//EN LAS LAMBAS DEVUELVE LA ULTIMA LINEA EN EJECUTARSE

fun main() {
    //Asi ejecuto una lambda "invoke" --> si añado () hago lo mismo quitando el invoke
    {
        println("Me estoy ejecutando dentro de una lambda")
    }.invoke()
    println("Primera lambda ejecutada")
    println()

    //ASIGNARLA A UNA VARIABLE
    var miLambda1 = {
        println("Me estoy ejecutando dentro de una lambda contenida en una variable")
    }
    //Ahora tengo que llamar a esa lambda
    miLambda1.invoke()
    miLambda1() //Caso identico al anterior
    println()


    //SER/PASARSE COMO PRAMETROS EN UNA FUNCION
    println("PASAR LAMBDA COMO PARAMETRO DE UNA FUNCION")
    escribe5VecesElContenidoDeUnaLambda(miLambda1)
    println()

    //Definir una LAMBDA dentro de los parametros
    println("DEFINIR LAMBDA DENTRO DE LOS PARAMETROS DE LA FUNCION")
    escribe5VecesElContenidoDeUnaLambda({ println(":)") })
    println()

    //Definir una LAMBDA que recibe 1 parametro (numero)
    println("LAMBDA QUE RECIBE UN PARAMETRO")
    var lambdaConUnParametro = { numero : Int ->
        repeat(numero){
            println("LAMBDA con parametros se repite $numero numero de veces")
        }
    }
    //Llamada a esa lambda
    lambdaConUnParametro.invoke(2)
    lambdaConUnParametro(3)
    println()

    //LAMBDA CON VARIOS PARAMETROS
    println("LAMBDA CON VARIOS PARAMETROS")
    var lambdaConVariosParametros = { texto: String, numero: Int ->
        repeat(numero){
            println(texto)
        }
    }
    //Invoco la lambda anterior
    lambdaConVariosParametros("Que pasa nen", 5)
    println()


    //LAMBDA QUE DEVUELVE UN VALOR
    println("LAMBDA QUE DEVUELVE UN VALOR")
    var lambda2ParametrosQueSuma = { num1: Int, num2: Int ->
        num1 + num2
    }
    println(lambda2ParametrosQueSuma(3,5))
    println()


    //LAMBDA COMPLEJA
    println("LAMBDA COMPLEJA QUE CAMBIA DE PAR a POSITIVO y de IMPAR a NEGATIVO")
    var lambdaAvanzada = {num:Int ->
        if(num % 2 == 0)
            num
        else num * -1
    }
    println(lambdaAvanzada(3))
    println()


    println("Fin del programa")
}

/*
"() -> Unit" --> es lo que hay que poner para que sea tipo LAMBDA
() --> indica que no se le pasa ningun parametro
Unit --> es el valor que devuelve
 */
fun escribe5VecesElContenidoDeUnaLambda(lambda: () -> Unit) {
    repeat(2){
        lambda()
    }

}