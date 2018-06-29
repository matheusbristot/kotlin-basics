package collections.data

import collections.domain.VehicleAction

class AirPlane constructor(
        model: String,
        velocity: Double,
        passengers: Int,
        fuelType: String,
        val ports: Int,
        val year: Int,
        val turbines: Int,
        private val vehicleAction: VehicleAction
) : Vehicle(model, velocity, passengers, fuelType) {

    fun turnOn(): String {
        return vehicleAction.turnOnVehicle(model)
    }

    fun speed(): Double {
        return vehicleAction.getSpeed(velocity)
    }

    fun turnOff(): String {
        return vehicleAction.turnOffVehicle()
    }
}