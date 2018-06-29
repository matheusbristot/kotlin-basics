package collections

import collections.data.AirPlane
import collections.data.Car
import collections.data.Vehicle
import collections.domain.DefaultVehicleAction
import collections.domain.SpeedVehicleAction

fun main(args: Array<String>) {

    val vehicles = loadVehicles()
    vehicles.forEach {
        when (it) {
            is Car -> {
                println("Selected Vehicle Car: ${it.model} - ${it.velocity}")
                println("${it.turnOn()} - ${it.speed()} - ${it.fuel}\n")
            }
            is AirPlane -> println("Selected Vehicle AirPlane: ${it.model} - ${it.velocity}")
        }
    }

    println("==Cars== Total: ${vehicles.size}")
    val cars = vehicles.filter { it is Car }
    println("Total ${cars.size}")
    cars.forEach { println(it.model) }

    println("==AirPlanes== Total: ${vehicles.size}")
    val airPlanes = vehicles.filter { it is AirPlane }
    println("Total: ${airPlanes.size}")
    airPlanes.forEach { println(it.model) }

    println("==DistinctBy Number of Passenger== Total: ${vehicles.size}")
    val distinct = vehicles.distinctBy { it.passengers }
    println("Total: ${distinct.size}")

    println("==First and Last==")
    println(vehicles.first().model + " | " + vehicles.last().model)
}

//Dummy Example:
private fun loadVehicles() = listOf(
        Car("SUV", 180.0, 5, Vehicle.Companion.FuelType.DIESEL, 4, 2013, DefaultVehicleAction()),
        AirPlane("Boeing 747-400", 988.0, 416, Vehicle.Companion.FuelType.KEROSENE, 5, 2009, 2, DefaultVehicleAction()),
        Car("Car Speed", 220.0, 5, Vehicle.Companion.FuelType.GASOLINE, 2, 2017, SpeedVehicleAction(250.0)),
        AirPlane("Air-XXX", 760.0, 123, Vehicle.Companion.FuelType.KEROSENE, 5, 2012, 4, DefaultVehicleAction()),
        Car("SUV-2", 195.7, 6, Vehicle.Companion.FuelType.DIESEL, 4, 2015, DefaultVehicleAction()),
        AirPlane("MIG", 1300.0, 1, Vehicle.Companion.FuelType.KEROSENE, 1, 2007, 2, DefaultVehicleAction())
)