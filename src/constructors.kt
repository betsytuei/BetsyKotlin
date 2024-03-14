

   class Employee(var firstname:String,var age:Int,var gender:String,var salary:Double)
   fun role(task:String){
    println("The role is $task")
}
   fun main() {
       var employee1 = Employee("John",52,"Male",520000.00)
       var employee2 = Employee("George", 32,"Male",230000.00)

   println(employee1.firstname)
       println("Employee1 is ${employee1.age} years old ")
   }
