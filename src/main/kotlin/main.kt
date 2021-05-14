import kotlin.random.Random

fun main(args: Array<String>) {




/*
    for (numero in ClaseArray(11).array){
        println(numero)
    }

*/



    val numero = ClaseArray(10){
        Random.nextInt(50,250)


    }


    numero.array.forEach {
        println(it)
    }

    FuncionMiembro().listaNumeros(numero.array)


}


