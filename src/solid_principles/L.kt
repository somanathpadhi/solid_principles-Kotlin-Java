package solid_principles
//problem in liskov substitution principle

open class Vehicle {
    open fun getNumberOfWheels(): Int =  2
    open fun hasEngine(): Boolean? = true
}
class MotorCycle: Vehicle()

class Car : Vehicle() {
    override fun getNumberOfWheels(): Int = 4
}

// this class downsizing its capability as it has no engine, and
// it returns engine as null
class Bicycle: Vehicle(){
    override fun hasEngine(): Boolean? = null
}

//fun main() {
//    val list = arrayListOf<Vehicle>()
//    list.add(MotorCycle())
//    list.add(Car())
//    list.add(Bicycle())
//
//    for (vehicle in list){
//        println(vehicle.hasEngine().toString())
//    }
//}
// liskov principle says that all the child classes should be able to substitute
// each other without breaking the code but when we add child class such as
// Bicycle and if we add to the list then it will break the code, and it will
// return null and the hasEngine capability, it is downsizing, which is against
// liskov substitution principle

//solution for this problem
//---------------------------//
//So in the parent class (here vehicle class) put only very generic methods which are
//very common for all

open class Vehicle1 {
    open fun getNumberOfWheels(): Int =  2
}
open class EngineVehicle: Vehicle1(){
    open fun hasEngine(): Boolean? = true
}
class Bicycle1: Vehicle()

class MotorCycle1: EngineVehicle()

class Car1 : EngineVehicle() {
    override fun getNumberOfWheels(): Int = 4
}
fun main() {
    val list = arrayListOf<EngineVehicle>()
    list.add(MotorCycle1())
    list.add(Car1())
    //Not able to add Bicycle1
    //list.add(Bicycle1())

    for (vehicle in list){
        println(vehicle.hasEngine().toString())
    }
}