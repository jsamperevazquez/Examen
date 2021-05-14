import java.util.*

/**
 *
 * Creado por @autor: angel
 *       El  14 de may. de 2021.
 *   //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
class ClaseArray (val sizeArr:Int, arrayInicio:(Int)->Int ){

    var array = Array(
        size = sizeArr,
        arrayInicio
    )

}


