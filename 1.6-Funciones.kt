fun main() {
    println("TEMA 6 - FUNCIONES")
    //1-FUNCION SIMPLE
    saludo()
    //2-FUNCION QUE DEVUELVE DATOS
    val saludo = devuelveSaludo()
    println(saludo)
    //3-FUNCION CON PARAMETROS
    saludaConParametros("Aitor")
    //4-FUNCUON CON TO DO
    val nom = "Paco"
    val total = conTodo(nom)
    println(total)
    //5-FUNCION CON OPCIONALES
    opcionales()
}

//1-FUNCION SIMPLE
//Funcion Saludo
fun saludo() {
    val texto = "Hola"
    println(texto)
}

//2-FUNCION QUE DEVUELVE DATOS
fun devuelveSaludo() : String {
    val text = "SALUDO"
    return text
}

//3-FUNCION CON PARAMETROS DE ENTRADA
fun saludaConParametros(nombre: String) {
    val apellido = nombre.plus(" Perez")
    println("Hola $apellido")
}

//4-FUNCION CON PARAMETROS DE ENTRADA Y SALIDA
fun conTodo(nombre : String) : String {
    return "$nombre CONTODO"
}

//5-FUNCION CON PARAMETROS OPCIONALES
fun opcionales(nombre : String = "Desconocido") {
    println("Hola $nombre")

}
