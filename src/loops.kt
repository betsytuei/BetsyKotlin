fun main() {
    //While loop
    var number = 20
    while (number <= 25){
        println("Number is $number")
        number++
    }

    //Decrementing
    var num = 100
    while (num >= 95) {
        println("Number is $num")
        num--
    }

    //Do..while
    var x = 34
    do {
        println(x)
        x++
    }while (x <= 20)

    //For loop
    var devices = arrayOf("Laptop","phone","tablet")
    for (device in devices){
        println("Device is $device")
    }

    var marks = arrayOf(50,80,65)
    for (mark in marks){
        println("Mark is $mark")
    }

    for (mynumber in 50..60)
        println(mynumber)

    for (letter in 'a'..'d')
        println(letter)

}

