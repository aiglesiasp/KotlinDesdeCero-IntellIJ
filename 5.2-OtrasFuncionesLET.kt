//OTRAS FUNCIONES SIMILARES

/*
    - RUN
    - WITH
    - ALSO
    - RUN
    - APPLY
 */

var texto1 : String? = "1"


fun main() {



    //RUN
    println("RUN")
    texto1?.run{
        println(this.toInt())
    }
    println()

    //WITH - No se puede quitar el interrogante
    /*println("WITH")
    with(texto1){
        println(this.toInt())
    }
    println()
     */

    //ALSO
    println("ALSO")
    texto1?.also {
        println(it.toInt())
    }
    println()

    //RUN - No se puede tampoco
    /*println("RUN")
    run(texto1){

    }
    println()
     */

    //APPLY
    println("APPLY")
    texto1?.apply {
        println(this.toInt())
    }
    println()
}