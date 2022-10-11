import kotlin.random.Random

//EJERCICIOS CLASES

/*
EJERCICIO 1
Crea una clase dado que reciba un valor minimo y un valor maximo.
Los dados deben:
    - Poder lanzarse "tiradaSimple(), devolviendo un numero aleatorio comprendido entre el valor maximo y minimo
    - Poder lanzar varias tiradas "tiradaMultiple(x)", siendo X un int y devolviendo
    una lista con X numeros aleatorios entre el valor maximo y el minimo
    - El dado debe almacenar en una lista todas las tiradas (individuales y multiples) que el dado haya realizado.
    Asegurate de que nadie pueda ni cambiar ni ver ese valor.
 */

/*
EJERCICIO 2
Partiendo del ejercicio anterior, crea una Clase denominada AnalizadorEstadistico
Este analizador tendra una funcion llamada: "analizarTirada" que, recibiendo un Dado, nos debera escribir por pantalla:
    - el numero de tiradas realizadas
    - el numero de veces que se repite cada valor
    - la media de las tiradas
Modifica la clase DADO si fuera necesario
 */
fun main() {
    val dado1 = Dado(1, 6)

    //Tirada simple
    println("EJEMPLO TIRADA SIMPLE")
    val tirada1 = dado1.tiradaSimple()
    println(tirada1)
    println()

    //Tirada Multiple
    println("EJEMPLO TIRADA MULTIPLE")
    val tirada2 = dado1.tiradaMultiple(5)
    println(tirada2)
    println()

    //AnalizadorDeTiradas
    val analizador = AnalizadorEstadistico()
    analizador.analizarTiradas(dado1)

}


class Dado(val minimo: Int, val maximo: Int) {

    private val historicoTiradas = MutableList(0) { 0 }
    //Metodos
    fun tiradaSimple() : Int {
        val result = Random.nextInt(minimo, maximo+1)
        historicoTiradas.add(result)
        return result
    }

    fun tiradaMultiple(tiradas: Int) : List<Int> {
        val list = MutableList(0){ 0 }
        repeat(tiradas){
                var result = tiradaSimple()
                list.add(result)
            }
        return list
    }

    fun getHistorico() : List<Int> {
        return historicoTiradas
    }
}

class AnalizadorEstadistico() {

    //Metodo Analizar Tiradas
    fun analizarTiradas(dado: Dado) {

        //Numero de tiradas realizadas
        println("Se ha tirado el dado ${dado.getHistorico().size} veces")

        //Numero de veces que se repite cada valor
        println(contarApariciones(dado))

        //La media de las tiradas
        println(calcularMedia(dado))
    }

    private fun calcularMedia(dado: Dado): String {
        var sumatorio = 0
        dado.getHistorico().forEach { sumatorio +=1 }
        val media = sumatorio / dado.getHistorico().size.toDouble()
        return media.toString()

    }

    private fun contarApariciones(dado: Dado): String {
        var listadoResultado = MutableList(dado.maximo - dado.minimo) {
            0
        }
        dado.getHistorico().forEach {
            listadoResultado[it - dado.minimo] += 1
        }
        return listadoResultado.toString()
    }
}