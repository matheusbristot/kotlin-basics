package collections.domain

interface VehicleAction {

    fun turnOnVehicle(model: String): String

    fun turnOffVehicle(): String

    fun lockPorts(): String

    fun openWindow(): String

    fun closeWindow(): String

    fun getSpeed(speed: Double): Double
}