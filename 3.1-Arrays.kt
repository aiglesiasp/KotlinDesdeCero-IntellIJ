import kotlin.random.Random

//ARRAYS
// Son colecciones de tamaño fijo de elementos, por ejemplo, un array de Strings
//NO SE PUEDEN AÑADIR NUEVOS ELEMENTOS
//Usar debugg para verlo mejor

fun main() {

    //Creando un array de enteros
    val array1 = arrayOf(1,2,3,4,5)
    println("ARRAY DE ENTEROS")
    println(array1[0]) //Acceder a un indice concreto del array
    println(array1[1])
    println(array1[2])
    println(array1[3])
    println(array1[4])
    println()

    //Creando un array de caracteres
    val array2 = arrayOf('a', 'b', 'c', 'd', 'e')
    println("ARRAY DE CARACTERES")
    println(array2[0])
    println(array2[1])
    println(array2[2])
    println(array2[3])
    println(array2[4])
    println()

    //Cambiar valores de un array
    println("CAMBIANDO VALORES A ARRAYS")
    array2[0] = 'z'
    println(array2[0])
    array1[1] = 1
    println(array1[1])
    println()

    //Creando un array de cosas distintas
    val array3 = arrayOf(1, 'a', 3, 'd', 5)
    println("ARRAY DE ELEMENTOS DIVERSOS")
    println(array3[0])
    println(array3[1])
    println(array3[2])
    println(array3[3])
    println(array3[4])

    //Creando arrays de forma dinamica
    println("CREANDO ARRAYS DE FORMA DINAMICA")
    //Creamos un array de integers de 10 elementos donde todos valen UNO
    val array4 = Array<Int>(10) {
        1
    }
    println(array4)
    println()

    //Creamos un array de INTEGERS (sin decirselo de 10 elementos donde cada valor es la posicion
    val array5 = Array(10) {
        it
    }
    println(array5)
    println()

    //Creamos un array de STRINGS de 10 elementos donde cada valor es la posicion
    val array6 = Array(10) {
        "Esta es la posicion ${it.toString()}"
    }
    println(array6)
    println()

    //Creamos un array de INT de 10 elementos con valores aleatorios
    val array7 = Array(10) {
        "En la posicion $it guardamos un ${Random.nextInt(0, 100)}"
    }
    println(array7)
    println()

    //Podemos cambiar el it por un nombre, como posicion + la FLECHITA
    val array8 = Array(10) {posicion ->
        "En la posicion $posicion guardamos un ${Random.nextInt(0, 100)}"
    }
    println(array8)
    println()

    //Crear array de dos caras
    val array9 = Array(10) {posicion ->
        if (posicion % 2 == 0) {
            "Es par"
        }
        else {
            "Es impar"
        }
    }
    println(array9)
    println()



}