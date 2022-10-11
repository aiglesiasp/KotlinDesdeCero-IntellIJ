fun main(args: Array<String>) {
    println("TEMA 1 - VARIABLES")

    //VARIABLES
    val inmutable = "no puede cambiar el valor"
    var mutable = "se puede cambiar el valor"
    println("La variable VAL es INMUTABLE, " +inmutable+ ". En cambio la variable VAR es MUTABLE " +mutable)

    //1-BOOLEAN
    var miBooleanTrue = true
    var miBooleanFalse = false
    println(miBooleanFalse)
    println(miBooleanTrue)

    //2-INT
    var miEntero = 10
    println(miEntero)

    //3-DOUBLE
    var miDecimal = 1.0
    println(miDecimal)

    //4-CHAR
    var miLetra = 'c'
    println(miLetra)

    //5-ARRAY
    var miTexto = "Es una cadena de caracteres"
    println(miTexto)


    //ASIGNAR NUEVOS VALORES
    //Solo tengo que modificar el valor de la variable

    miLetra = 'h'
    miEntero = 23
    miDecimal = 25.47
    miTexto = "Hemos cambiado la cadena"

    println(miLetra)
    println(miEntero)
    println(miDecimal)
    println(miTexto)
}