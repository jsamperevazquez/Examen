import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    val numero = ClaseArray(10){
        Random.nextInt(50,250)
    }

    numero.array.forEach {
        println(it)
    }
}


