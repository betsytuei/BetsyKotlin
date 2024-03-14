import java.util.Scanner

fun main() {
    var input = Scanner(System.`in`)

    println("Enter first number:")
    var first = input.nextInt()

    println("Enter second number:")
    var second = input.nextInt()

    println("Enter Operator:")
    var operator = input.next()
     var result = when(operator){
         "+" -> first + second
         "-" -> first - second
         "*" -> first * second
         "/" -> first / second

         else -> "Invalid"
     }
    println(result)

}