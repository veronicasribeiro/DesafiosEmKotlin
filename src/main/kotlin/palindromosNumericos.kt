// desafio de encontrar números palindrômicos dentro de um intervalo dado

fun main() {
    println(isPalindromo(158))
}

// A função irá retornar um valor boolean
fun isPalindromo(numero: Int): Boolean {
    // Número será convertido para String desse jeito podemos verificar se ele é palíndromo
    val convercaoNumeroParaSring = numero.toString()
    // A conversão irá retornar se o inverso do número irá ser igual a ordem original
    return convercaoNumeroParaSring == convercaoNumeroParaSring.reversed()
}