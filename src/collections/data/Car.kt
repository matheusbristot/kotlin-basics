package collections.data

import collections.domain.VehicleAction

class Car constructor(
        model: String,
        velocity: Double,
        passengers: Int,
        fuelType: String,
        val ports: Int,
        val year: Int,
        private val vehicleAction: VehicleAction
) : Vehicle(model, velocity, passengers, fuelType){

    fun turnOn(): String{
        return vehicleAction.turnOnVehicle(model)
    }

    fun speed(): Double {
        return vehicleAction.getSpeed(velocity)
    }

    fun turnOff(): String{
        return vehicleAction.turnOffVehicle()
    }

}