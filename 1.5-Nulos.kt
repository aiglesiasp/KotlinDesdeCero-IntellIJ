fun main(args: Array<String>) {

    //NULOS
    println("TEMA 5 - NULOS o OPCIONALES")
    //Kotlin impide que haya NULOS
    var miEntero = null

    //Como crear variable con nulo, con el interrogante
    var miEnternoConNulo: Int? = null

    //No podemos hacer operaciones con NULO
    //miEnternoConNulo += 1

    //Si el entero es opcional ? tampoco se pueden hacer operaciones
    var miEnteroConNulo2: Int? = 1
    //miEnteroConNulo2 += 1

    //Hay que gestionar este tipo de variables que pueden ser nulos
    //Para eso añado el interrogante
    miEnteroConNulo2?.toDouble()


    //EJEMPLO
    var miText: String? = null
    println(miText?.length)


}