// Função com parâmetros
// Dando argumentos para as funções
// .reversed() - Propriedade para inverter a palavra

fun main() {
    println(solucao("reviver"))
}
fun solucao(palavra: String) {
    // Se a palavra invertida for igual a palavra, é verdade que ele é um palíndromo
    if (palavra.reversed() == palavra) {
        println("A palavra $palavra é um palíndromo")
    } else {
        println("A palavra $palavra não é um palíndromo")
    }
}