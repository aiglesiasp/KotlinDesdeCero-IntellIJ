import kotlin.random.Random

fun main() {
    println("JUEGO ADIVINAR NUMERO DEL 0 al 9")
    adivinarNumero()

}

//EJERCICIO
// Utilizando bucles adivinar un numero entre el 0 y el 9
fun adivinarNumero() {

    //Funcion Random para generar numero aleatorio entre 0 y 10 (no incluido)
    var numeroAleatorio = Random.nextInt(0, 10)
    var encontrado = false
    do {
        println("Escribe tu numero del 0 al 9: ")
        var numeroIntroducido = readLine()
        if (numeroIntroducido != null){
            if(numeroAleatorio == numeroIntroducido.toInt()){
                println("Enhorabuena, has encontrado el numero, era el $numeroAleatorio")
                encontrado = true
            }
            else if (numeroIntroducido.toInt() < numeroAleatorio){
                println("El numero que buscas es mas grande")
            }
            else{
                println("El numero que buscas es mas pequeño")
            }
        }
    }while(!encontrado)
}