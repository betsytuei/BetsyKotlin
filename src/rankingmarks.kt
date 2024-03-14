import java.util.Scanner

fun main() {
    var input = Scanner(System.`in`)

    println("Enter mark:")
    var mark = input.nextInt()

    var grade = when(mark){
       in  80..100 -> "A"
       in  70..79 -> "B"
       in  60..69 -> "C"
       in  50..59 -> "D"
        in 0..49 -> "E"

        else -> "Invalid"
    }
    println(grade)
}