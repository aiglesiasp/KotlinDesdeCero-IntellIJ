//CLASES
/*
Las clases son una combinacion de variables y funciones que denominaremos atributos y metodos
Los objetos son las variables creades de una clase
 */

/*
ATRIBUTOS
    - Publicos -> si no pongo nada, cualquiera puede acceder desde fuera
    - Privados -> "private", no se puede acceder desde fuera
    - Otros ->
 */

/*
METODOS
Pueden se rpublicos y privados tambien
 */
/*
QUE PASA SI IMPRIMO UNA CLASE -->no sale bien
solucion toString()
 */

/*
INICIALIZAR CLASES
Podemos pasarle parametros como si de un metodo se tratase
class Persona(var nombre: String, private var edad: Int)
 */

fun main() {

    //Declaracion de los objetos personas
    var persona = Persona("Juan", 20)
    persona.apellido = "Perez"
    persona.cumplirAnios()
    println(persona)

    var persona2 = Persona("Aitor", 33)
    persona2.cumplirAnios()
    println(persona2)
}


//DECLARACION DE LA CLASE PERSONA
class Persona(var nombre: String, private var edad: Int) {

    //Declaracion de atributos
    public var apellido = ""
    private var dni = ""

    //Declaracion de metodos publicos
    fun cumplirAnios() {
        celebrarCumpleAnios()
        edad++
    }

    //Declaracion de metodos privados
    private fun celebrarCumpleAnios() {
        println("Soy $nombre y voy a cumplir años")
    }

    //Metodo toString() Modificar
    override fun toString() : String {
        return "Me llamo $nombre y tengo $edad años"
    }


}

