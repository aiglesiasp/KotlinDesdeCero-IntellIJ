//COMO LEER POR TECLADO
// readLine() nos devuelve un String?
//Posteriormente se puede transformar al tipo deseado

fun main() {
    println("Por favor, introduce un texto")
    var respuesta = readLine()
    if(respuesta != null){
        println("Has introducido: $respuesta")
    }
}