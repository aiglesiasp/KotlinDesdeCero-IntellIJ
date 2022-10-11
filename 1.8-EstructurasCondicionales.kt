//8-ESTRUCTURAS CONDICIONALES

//COMPARADORES 1
/* Igualdad "=="
        · variable1 == variable2
   Mayor ">"   Mayor o igual ">="    Menor "<"   Menor o igual "<="
        · variable1 < variable2
   Pertenecia a un tipo: is
        · variable is Long
   Pertenecia a un rango: in
        · variable in 1..10
 */

//COMPARADORES 2
/* AND: "&&"
        · Ambas condiciones deben cumplirse
        · variable1 == 1 && variable2 == 10
   OR: "||"
        · Al menos una de las condiciones deben cumplirse
        · variable1 == 1 || variable2 == 10
   NEGATION: "!"
        · Niega el operador siguiente
        · variable !is Long --> La variable no debe ser un Long
        · variable != 1 --> La variable debe ser distinta a 1
 */


fun main () {

    //IF CONDICIONAL
    println("MI PRIMER IF")
    primerIF(1)
    primerIF(2)

    // IF-ELSE CONDICIONAL
    println("IF-ELSE CONDICIONAL")
   primerIfElse(1)
    primerIfElse(2)

    //IF-ELSE-IF
    compararNumeros(2, 1)

    //WHEN()
    primerWhen(0)
    primerWhen(1)
    primerWhen(2)
    primerWhen(3)
    primerWhen(4)
    primerWhen(5)
    primerWhen(6)
    primerWhen(7)

    //WHEN
    whenAvanzado(15, true)
}

//IF CONDICIONAL
fun primerIF (num: Int) {
    if (num == 1){
        println("Num es igual a uno")
        println("Sigo estando dentro del IF")
    }
    println("Fin del progreso IF CONDICIONAL")
}

//ELSE-IF CONDIFICONAL
fun primerIfElse (num: Int) {
    if (num == 1){
        println("Num es igual a uno")
        println("Sigo estando dentro del IF")
    }else {
        println("Num NO es igual a 1")
    }
    println("Fin del progreso IF-ELSE CONDICIONAL")
}

//IF-ELSE-IF
fun compararNumeros(num1: Int, num2: Int) {
    if (num1 > num2)
        println("num1 es mayor que num2")
    else if (num1 == num2)
        println("Los numeros son iguales")
    else
        println("num2 es mayor que num1")

}

//WHEN()
fun primerWhen(num: Int) {
    when(num){
        0 -> {
            println("Cero")
            println("Este es el numero mas bajo que tenemos")
        }
        1 -> println("Uno")
        2 -> println("Dos")
        in 3..6 -> println("Esta entre 3 y 6")
        else -> println("No esta en ninguna opcion")
    }
}

//WHEN
fun whenAvanzado(edad: Int, trabaja: Boolean) {

    when {
        (edad >= 18 && trabaja) -> println("Es MAYOR de edad y trabaja")
        (edad < 18 && trabaja) -> println("Es MENOR de edad y trabaja")
        (edad >= 18 && !trabaja) -> println("Es MAYOR de edad y NO trabaja")
        (edad < 18 && !trabaja) -> println("Es MENOR de edad y NO trabaja")

    }
}
