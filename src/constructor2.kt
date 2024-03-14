class Dog(var name:String,var breed:String,var weight:Int) {

    fun move(movement: String) {
        println("The dog is $movement")
    }

}

fun main() {
    var dog1 = Dog("Murife","Bulldog",41)
    var dog2 = Dog("Bob","Pitbull",32)

    println(dog1.breed)
    dog2.move("running")
    dog1.move("walking")
}
