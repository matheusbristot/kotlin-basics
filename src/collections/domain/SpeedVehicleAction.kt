package collections.domain

class SpeedVehicleAction(private val addSpeed: Double) : DefaultVehicleAction() {

    override fun getSpeed(speed: Double): Double {
        return speed + addSpeed
    }
}