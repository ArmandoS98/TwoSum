fun main() {
    val lista = listOf(2, 5, 8, 11)
    val objetivo = 10
    var found = false

    for (i in lista.indices) {
        if (!found) {
            for (j in lista.indices) {
                if (!found) {
                    if (j + 1 < lista.size) {
                        val currentNumber = lista[i]
                        val variableNumber = lista[j + 1]
                        val sum = Integer.sum(currentNumber, variableNumber)

                        if (sum == objetivo) {
                            found = true
                            println("Lista = $lista")
                            println("Las posiciones a sumar para obtener el objetivo $objetivo son lista[$i] && lista[${j + 1}]")
                        }
                    } else {
                        if (j == lista.size - 1) {
                            found = true
                            println("Lista = $lista")
                            println("Dentro de la lista no existen numeros que al sumarlos se obtengan el numero objetivo $objetivo")
                        }
                    }
                } else break
            }
        } else break
    }
}