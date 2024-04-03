fun main(args: Array<String>) {
    println("Hello World!")
    var car = Car("Audi","Toyota","Blue",60)
    car.carry(50)
    car.identity()
    println(car.calculatePackingFee(3))
    var bus = Bus("Audi","Toyota","Blue",60)
    println(bus.maxTripFare(100.50))




}
 open class Car(var make:String, var model:String, var color:String, var capacity:Int){
    fun carry(people:Int){
        if(people <=  capacity){
            println("carrying $people passanger")
        }
        else{
        var x = people - capacity
            println("over capacity by $x people")}



    }
    fun identity(){
        println("i am a $color $make $model")
    }
    open fun calculatePackingFee(hours:Int):Int{

        var fees = hours * 20
        return fees

    }


}
class Bus ( make:String,  model:String, color:String,  capacity:Int): Car(make, model, color, capacity){
    fun maxTripFare(fare: Double):Double{
        var Trip = fare * capacity
        return Trip

    }
override   fun calculatePackingFee(hours:Int):Int{
        var multiply = hours * 60
        return multiply

    }
}