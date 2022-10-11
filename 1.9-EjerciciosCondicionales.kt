fun main() {

    //EJERCICIO 1 - CON UN IF
    var aitor = calcularPrecioIF(15, "Aitor")
    var toni = calcularPrecioIF(62, "Toni")
    var fina = calcularPrecioIF(66, "Fina")
    println(aitor)
    println(toni)
    println(fina)

    //EJERCICIO 1 - CON UN WHEN
    var aitor1 = calcularPrecioWhen(15, "Aitor")
    var toni1 = calcularPrecioWhen(62, "Toni")
    var fina1 = calcularPrecioWhen(66, "Fina")
    println(aitor1)
    println(toni1)
    println(fina1)

}

//EJERCICIO 1
//Crea una funcion que reciba un Integer y un String
//Integer = edad y String = nombre
//La funcion se llama calcularPrecio
/*
La funcion debe devolver:
    - Menor de 18 --> "Nombre, debes abonar 5€"
    - Entre 18 y 65 --> "Nombre, debes abonar 10€"
    - Mas de 65--> "Nombre, para ti es GRATIS"
 */


fun calcularPrecioIF (edad: Int, nombre: String): String {
    return if (edad < 18) "$nombre, debes abonar 5€"
    else if (edad < 65) "$nombre, para ti es Gratis"
    else "$nombre, debes abonar 10€"
}

fun calcularPrecioWhen (edad: Int, nombre: String): String {
    when {
        (edad < 18) -> return "$nombre, debes abonar 5€ con WHEN"
        (edad >= 18 && edad <=65) -> return "$nombre, debes abonar 10€ con WHEN"
        else -> return "$nombre, para ti es Gratis con WHEN"

    }
}