fun main() {
    //EJERCICIO 1
    val num1 = 10
    val num2 = 15
    val result1 = sumaIntegers(num1, num2)
    println("El resultado del EJERCICIO 1 es: " +result1)

    //EJERCICIO 2
    val text1 = "1"
    val text2 = "2"
    val result2 = sumaStrings(text1, text2)
    println("El resultado del EJERCICIO 2 es: " +result2)

    //EJERCICIO 3
    val result3 = diResultado(sumaIntegers(num1, num2), sumaStrings(text1, text2))
    println(result3)

    //EJERCICIO 4
    val result4 = saludoTotal("Aitor","Iglesias")
    println(result4)

    //EJERCICIO 5
    val result5 = cambioIntToString(4,5)
    println(result5)
}

//EJERCICIO 1
//Crea una función que reciba dos Integer y devuelva un Double.
//Llama "sumaIntegers". Escribe el resultado por pantalla
fun sumaIntegers(num1: Int, num2: Int) : Double {
    val result = num1 + num2
    return result.toDouble()
}

//EJERCICIO 2
//Crea una funcion que reciba dos Strings, los transforma a Integer, los sume y devuelva un Double.
//Llama "sumaStrings". Escribe el resultado por pantalla.
//Asume que los String se transforman en Int sin problemas
fun sumaStrings(text1: String, text2: String) : Double {
    val num1 = text1.toInt()
    val num2 = text2.toInt()
    val result = sumaIntegers(num1, num2)
    return result

}

//EJERCICIO 3
//Crea una funcion que reciba el resultado de las 2 funciones anteriores y escriba:
// "sumaIntegers ha devuelto un {numero1} y SumaStrings ha devuelto un {numero2}
//Llama "diResultado"
fun diResultado(dou1: Double, dou2: Double) : String {
    val result = "SumaIntegers ha devuelto un $dou1 y SumaStrings ha devuelto un $dou2"
    return result
}

//EJERCICIO 4
//Crea una función que reciba dos Strings, nombre y apellido
//Debe escribir por pantalla: Hola, soy "nombre" y me apellido "apellido"
fun saludoTotal(nombre: String, apellido: String) : String  {
    val result = "Hola, soy $nombre y me apellido $apellido"
    return result
}

//EJERCICIO 5
//Crea una funcion que reciba dos Int, num1 y num2 y devuelva un String
//La funcion debe sumarlos y devolver un string con el resultado
fun cambioIntToString(num1:Int, num2:Int) : String {
    val result = num1 + num2
    return "El resultado de la suma es: ${result.toString()}"
}