package calculator

fun main(args: Array<String>) {

    val listNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val listOfNumbersWithNullToSum = listOf(null, 2, null, 4, null, 6, null, 8, null, 10)

    println(sum(listNumbers))

    println(sumWithNulls(listOfNumbersWithNullToSum))

    println(2.minus(3))

    println(2.plus(3))

    println(1 sumUniqueNumber 2 sumUniqueNumber 3 sumUniqueNumber 3 sumUniqueNumber 3 sumUniqueNumber 3 sumUniqueNumber 3)

    println("H e l l o" removeBlankCharacter " B a s i c K ot li n")

}

private fun sum(numbersToSum: List<Int>) = numbersToSum.sumBy { it }

private fun sumWithNulls(numbersToSum: List<Int?>) = numbersToSum.sumBy {
    it //quando numero != null
            ?: //operador `elvis`
            0 //quando numero == null
}


//TODO: Bônus infix!
/* Infix precisa obedecer 3 coisas:
1. Parametro unico
2. Ser funcao membro ou funcao para estender (como eh nosso caso)
3  não aceita varargs e nem valores em default (number: Int = 2) por exemplo
Vantagens: O uso dele evita o this ponto e também os parenteses
-> exemplo de aplicacao $1 sumUniqueNumber $2
*/
private infix fun Int.sumUniqueNumber(number: Int): Int {
    //println("Int.sumUniqueNumber: "+ this)
    return this.plus(number)
}

// ou também em Strings, quando quer aplicar algum filtro, voce oculta o .filter, podendo aplicar da maneria que voce quiser,
private infix fun String.removeBlankCharacter(s: String): String {
    return this.plus(s).filter { it.toInt() != 32 }
    //.filter aplica o filtro, lembrando que o it, eh um char no exemplo, onde aplicamos a remocao do espaco em branco
}
