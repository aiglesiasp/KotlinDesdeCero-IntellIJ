fun main(args: Array<String>) {

    //CAMBIAR ENTRE TIPOS
    println("TEMA 4 - CONVERSION DE TIPOS")
    //Ejemplo1
    val miByte: Byte = 1
    println(miByte)
    val miEntero: Long = 5
    println(miEntero)

    //Uso toLong() para cambiar el tipo
    var suma = miEntero + miByte.toLong()
    println(suma)


    //Ejemplo2 saliendome de rango
    val miShort: Short = 200
    println(miShort.toByte())

    //Saber si me paso de rango
    val maxByte = Byte.MAX_VALUE
    println(maxByte)


}