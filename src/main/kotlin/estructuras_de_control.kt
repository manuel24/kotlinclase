import java.util.InputMismatchException


//Ejercicios

//Ejercicio 1. Realizar el almacenamiento de dos numeros enteros por teclado e imprimir suma y producto

fun Ejercicio1_1 () {
    println("Ejercicio 1. \n Realizar el almacenamiento de dos numeros enteros por teclado e imprimir suma y producto \n")
    var muk: Int?
    print("Ingresa el primer valor: ")
    muk = readLine()?.toIntOrNull()
    val num1: Int = muk ?: 0
    print("Ingresa el segundo valor: ")
    muk = readLine()?.toIntOrNull()
    val num2: Int = muk ?: 0
    print("La suma de $num1 y $num2 es ${num1 + num2}")
    print("La multiplicacion de $num1 y $num2 es ${num1 * num2}")

}


//Ejercicio 2. Calcula el lado de un cuadrado,mostrar pon pantalla el area del mismo

fun Ejercicio1_2 () {
    println("Ejercicio 2. \n Calcula el lado de un cuadrado,mostrar pon pantalla el area del mismo \n")

    var muk: Float?
    print("Escribe cuanto mide el lado de un cuadrado: ")
    muk = readLine()?.toFloatOrNull()
    var lado: Float = muk ?: 0.0f
    print("El area del cuadrado es : ${lado * lado}")

}

//Ejercicio 3 Se debe desarollar un programa que pida el ingreso de un articulo y la cantidad que se lleva el comprador Mostrar lo que debe abonar el comprador


fun Ejercicio1_3 (){
    println("Ejercicio 3 \n Se debe desarollar un programa que pida el ingreso de un articulo y la cantidad que se lleva el comprador Mostrar lo que debe abonar el comprador\n")
    var muk: Float?
    print("Escribe el valor del articulo que te llevas: ")
    muk = readLine()?.toFloatOrNull()
    var articulo: Float = muk ?: 0.0f
    var muk1: Int?
    print("Ingresa el numero de articulos que te llevas: ")
    muk1 = readLine()?.toIntOrNull()
    var cantidad:Int = muk1  ?: 0
    print("El comprador debe abonar : ${cantidad * articulo}")



}

//Ejercicio 4 se introducen 4 numeros y se muestra resultado de la suma del 1 y 2 ademas del producto del 3 y 4

fun Ejercicio1_4 (){
    println("Ejercicio 4 \n se introducen 4 numeros y se muestra resultado de la suma del 1 y 2 ademas del producto del 3 y 4 \n ")
    var muk: Int?
    print("Ingresa el primer valor: ")
    muk = readLine()?.toIntOrNull()
    val num1: Int = muk ?: 0
    print("Ingresa el primer valor: ")
    muk = readLine()?.toIntOrNull()
    val num2: Int = muk ?: 0
    print("Ingresa el primer valor: ")
    muk = readLine()?.toIntOrNull()
    val num3: Int = muk ?: 0
    print("Ingresa el primer valor: ")
    muk = readLine()?.toIntOrNull()
    val num4: Int = muk ?: 0
    print("La suma de los primeros 2 numeros son : ${num1+num2}")
    print("El producto de los ultimos  2 numeros son : ${num3+num4}")

}

//Realizar un programa que lea 4 numeros enteros e informe de su suma y promedio, el programa principal llama a la funcion que devuelve el promedio


fun Ejercicio1_5 (){
    print("Ejercicio5 \n Realizar un programa que lea 4 numeros enteros e informe de su suma y promedio, el programa principal llama a la funcion que devuelve el promedio \n")
    var muk: Int?
    print("Ingresa el primer valor: ")
    muk = readLine()?.toIntOrNull()
    val num1: Int = muk ?: 0
    print("Ingresa el segundo valor: ")
    muk = readLine()?.toIntOrNull()
    val num2: Int = muk ?: 0
    print("Ingresa el tercer valor: ")
    muk = readLine()?.toIntOrNull()
    val num3: Int = muk ?: 0
    print("Ingresa el cuarto valor: ")
    muk = readLine()?.toIntOrNull()
    val num4: Int = muk ?: 0
    print("La suma de todos los numeros son : ${num1+num2+num3+num4}\n")
    fun promedio(){
        print("EL promedio es ${(num1+num2+num3+num4)/4}")
    }
    promedio()

}
//

fun Ejercicio_fizzbuz () {
    do {
        print("Ejercicio en clase para  Realiza el programa FizzBuzz \n")
        var muk: Int?
        print("Ingresa un numero: ")
        muk = readLine()?.toIntOrNull()
        val num: Int = muk ?: 0
        var exit:Int
        if (num % 15 == 0) {
            print("FizzBuzz \n")
        } else if (num % 3 == 0) {
            print("Fizz \n")
        } else if (num % 5 == 0) {
            print("Buzz\n")
        } else {
            print("$num \n")
        }
        println("¿Quieres continuar?  Pulsa 1 para continuar o 0 para salir")
        exit = readLine()?.toIntOrNull()!!
    }while (exit!=0)

}





