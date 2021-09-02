fun main() {

    val valor = "0xFFC4C4C4"
    val hexa = "0123456789ABCDEFabcdef"
    var estado = 0

    valor.forEach { it ->
        when (estado) {
            0 -> estado = if (it == '0') 1 else 4
            1 -> estado = if (it == 'x' || it == 'X') 2 else 4
            2 -> estado = if (hexa.contains(it)) 3 else 4
            3 -> estado = if (hexa.contains(it)) 3 else 4
        }
    }
    if (estado == 3) println("Cadeia reconhecida pelo autômato!") else println("Cadeia não reconhecida!")
}