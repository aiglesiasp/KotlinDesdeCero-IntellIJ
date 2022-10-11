fun main(args: Array<String>) {

    //OPERACIONES CON VARIABLES
    println("TEMA 2 - OPERACIONES CON VARIABLES")
    //1-Operaciones con enteros
    var miEntero = 1
    println(miEntero)
    //-------------------------------//
    //Suma
    miEntero = 1 + 2
    println(miEntero)
    //Resta
    miEntero = 2 - 1
    println(miEntero)
    //Multiplicacion
    miEntero = 2 * 1
    println(miEntero)
    //Division
    miEntero = 10 / 5
    println(miEntero)

    //Hacer operaciones sobre la misma variable
    miEntero += 3 //Le sumo 3 al valor de miEntero anterior
    println(miEntero)
    miEntero -= 1 //Le resto 1 al valor de miEntero anterior
    println(miEntero)
    miEntero *= 2 //Multiplico por 2 el valor de miEntero anterior
    println(miEntero)
    miEntero /= 2 //Divido por 2 el valor de miEntero anterior
    println(miEntero)

    //Obtener el modulo
    var division = 9 / 2
    println("La divison es: " +division)
    var modulo = 9 % 2
    println("El modulo es: " +modulo)

    //ACCIONES QUE PUEDO HACER CON LOS ENTEROS
    miEntero.toDouble() //Para castear el valor
    println(miEntero)

    //2-OPERACIONES CON CHAR
    var miLetra = 'c'
    println(miLetra)
    miLetra += 1 //Sumo uno en el abecedario ASCII
    println(miLetra)


    //3-OPERACIONES CON ARRAY
    var miTexto = "Es una cadena de caracteres"
    println(miTexto)
    //Concatenar Strings
    var miSegundoTexto = ". Y esto es otra"
    println(miTexto + miSegundoTexto)

}