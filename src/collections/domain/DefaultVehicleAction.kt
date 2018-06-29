package collections.domain

open class DefaultVehicleAction : VehicleAction {

    private var model = ""

    override fun turnOnVehicle(model: String): String {
        this.model = model
        return "turn On Vehicle $model"
    }

    override fun turnOffVehicle(): String {
        return "turn Off Vehicle $model"
    }

    override fun lockPorts(): String {
        return "ports are locked to car $model"
    }

    override fun openWindow(): String {
        return "window are opened to car $model"
    }

    override fun closeWindow(): String {
        return "window are closed to car $model"
    }

    override fun getSpeed(speed: Double) = speed
}