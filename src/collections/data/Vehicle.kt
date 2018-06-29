package collections.data

//Em Kotlin, para herdar esta classe, preciso colocar no inicio anotacao open, por default todas as classes sao final.
open class Vehicle(val model: String, val velocity: Double, val passengers: Int, val fuel: String) {

    companion object {
        object FuelType {
            const val GASOLINE = "gasoline"
            const val ALCOHOL = "alcohol"
            const val DIESEL = "diesel"
            const val ENERGY = "energy"
            const val KEROSENE = "kerosene"
        }
    }
}