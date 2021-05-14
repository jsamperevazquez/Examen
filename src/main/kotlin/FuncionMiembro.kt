/**
 *
 * Creado por @autor: angel
 *       El  14 de may. de 2021.
 *   //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
class FuncionMiembro {
    val listaNumeros = { numero: Array<Int> ->
        numero.filter { it % 2 != 0 }.forEach{ println(it)}
    }
}

