//Parent class/Base class/Superclass
 open class Animal{
    var age = 3
    var gender = "Female"

    fun move(movement:String){
        println("Animal is $movement")

    }    }
//Child class
class Duck:Animal(){

    var color = "White"
    fun sound(){
        println("The duck is quacking")
     }
  }
class Fish{
    var hasScales = true
    var hasfins = true
    fun eat(){
        println("Fish is eating")

    }
}

fun main() {
    var elephant = Animal()

    var duckling = Duck()
    duckling.move("Swimming")
    println(duckling.color)
    var nileperch = Fish()
}