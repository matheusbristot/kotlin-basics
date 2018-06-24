package calculator

fun main(args: Array<String>) {

    val listOfNumbersToSum = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val listOfNumbersWithNullToSum = listOf(null, 2, null, 4, null, 6, null, 8, null, 10)

    println(sum(listOfNumbersToSum))

    println(sumWithNulls(listOfNumbersWithNullToSum))
}

private fun sum(numbersToSum: List<Int>) = numbersToSum.sumBy { it }

private fun sumWithNulls(numbersToSum: List<Int?>) = numbersToSum.sumBy {
    it //Number != null
            ?: //Operator `elvis`
            0 //Number is null
}
