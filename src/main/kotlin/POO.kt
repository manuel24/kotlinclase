package POO

import java.time.LocalDate
import java.time.format.DateTimeFormatter


//En esta clase se declara la variable entre los parentesis.
class POO(val modelo:String, val puertas:Int, val velocidad:Int, val asientos:Int) {


}

//En esta clase se declaran las variables dentro de ella y en los parentesis solo van las propiedades.
class POOO(modelo:String, puertas:Int, velocidad:Int, asientos:Int) {
    val modelo= modelo
    val puertas = puertas
    val velocidad = velocidad
    val asientos = asientos
}

//Objeto llamando a la clase
val seat = POOO("seat leon", 5,160,5)


class coche(modelo:String, puertas:Int, velocidad:Int, asientos:Int) {
    val modelo= modelo
    val puertas = puertas
    var velocidad = velocidad
    val asientos = asientos
    fun cambiarVelocidad( nuevaVelocidad: Int){velocidad = nuevaVelocidad
        print("Velocidad modificada") }
    fun detener(){ val detener = "detenido" }
    fun descripcionCoche(): String = "El $modelo es un estupendo coche de $puertas con $asientos y alcanza una velocidad de $velocidad"

    val cochazo = coche("seat",5, 300,5)


}

class cochee(modeloo:String, puertaas:Int, velocidaad:Int, asientoos:Int) {
    var modelo= modeloo
    var puertas = puertaas
    var velocidad = velocidaad
    var asientos = asientoos
    init {
        modelo = modelo.uppercase()
        if (velocidad<0 || velocidad>300) velocidad= 0
        if (puertas<0 || puertas>6) puertas = 4
        if (asientos<0 || asientos>10) asientos = 5
    }

    fun cambiarVelocidad( nuevaVelocidad: Int){this.velocidad
        print("Velocidad modificada") }
    fun detener(){this.velocidad = 0}
    fun descripcionCoche(): String = "El $modelo es un estupendo coche de $puertas con $asientos y alcanza una velocidad de $velocidad"

}

class Empleado constructor(noombre: String, aapellidos: String, eedad: Int?){
    var nombre : String = noombre
        set (valor) {field = valor.uppercase()}
        get (){return "("+field+")" }

    val apellidos: String = aapellidos
    var edad: Int? = eedad
    init {
        edad= eedad?:0
    }
}

//Data class como se declara

data class Vehiculo(var modelo: String, var puertas: Int, var velocidad: Int, var asientos: Int)
{var potenciaMax:Int=300}
fun crearVehiculo(){
    val coche=Vehiculo("Seat",0,260,5)
    print("Los datos del coche son ${coche.toString()}")
}

data class Profe(var nip:Int, var contrato:String, var nombre:String, var nacimiento:String)

data class Tutor(var nip:Int, var contrato:String, var nombre:String, var nacimiento:String)

{
    init {
        var nacimiento = LocalDate.parse(nacimiento, DateTimeFormatter.ofPattern("dd-MM-yyyy"))
    }
    var salario:Float?=0f
        set(value){
            if (value!=null){
                if (value<0)field = 0f else field=value
            } else field = 0f
        }
}


data class Articulo(var codigo:Int, var descripcion:String, var precio:Float)
fun dataclassArticulo(){
    val articulo1=Articulo(1,"papas (articulo1)",3f)
    val articulo2=Articulo(2,"jamon",4f)
    val articulo3=articulo1.copy(precio = 2.50f, descripcion = "papas (articulo3)")
    val articulo4=articulo2.copy(precio = 2f)
    val copiaArticulo3 =articulo3

    println(articulo1.toString())
    print(articulo2)

    if (articulo3.equals(copiaArticulo3)) print("Son iguales $articulo3 y su copia $copiaArticulo3") else println("Articulos distintos")
    if (articulo1 == articulo3) print("Son iguales $articulo1 y $articulo3") else print("Son distintos $articulo1 y $articulo3")
}

data class dcPersona (var nombre:String, var edad:Int){

    override fun toString():String{
        return "${nombre.uppercase()}, $edad"
    }
}
val persona1 =dcPersona("Juan",65)
val persona2 =dcPersona("Pedro",35)

//ENUM CLASS

enum class Color{ROJO,AZUL,VERDE,VIOLET,BLANCO,NEGRO}
enum class TipoCarta{DIAMANTE,TREBOL,PICA,CORAZON}

//CON PROPIEDADES
enum class rgbColor(val r:Int, val g:Int, val b:Int){
    RED(255,0,0),  AZUL(0,0,255), GREEN(0,255,0),
    ORANGE(255,165,0), YELLOW(255,255,0), INDIGO(75,0,130),
    VIOLET(238,130,238);//; lo pongo si voy a incorporar metodos

    fun rgb()=(r*256+g)*256+b //RGB a hexadecimal
    fun hex() = "# ${(r*65536) + (g*256)+b}"

}

class Carta (val tipo:TipoCarta, val valor:Int){
    fun imprimir()= "Carta $tipo y su valor $valor"
}
//println("Valor RGB del color azul es: ${rgbColor.azul.r},${rgbColor.azul.g},${rgbColor.azul.b} hx: ${rgbColor.azul.hex}")

val carta_trebol = Carta(TipoCarta.TREBOL,6)

//println (carta_trebol.imprimir())


//OBJETOSS

object Alumno{
    var nombre = "Laura"
    var apellidos = "Gomez Garcia"
}


object miSeat {
    var modelo = "Leon"
    var puertas = 5
    var velocidad:Int? = 260

        set (value){
            if (value!=null){
                if (value <0) field =0 else field =value
            } else field = 0

        }

        get(){return field?:0}
    val asientos = 5

    init {
        this.modelo.uppercase()
        velocidad = velocidad?:0
    }
    fun cambiarVelocidad() =this.velocidad
    fun detener() {this.velocidad =0}


}

class Persona (var nombre: String, var edad: Int){

    fun comprobar_edad(){
        if(edad<18 )
            println("La persona es menor")
        else if (edad in 18..29)
            println("La persona es joven")
        else
            println("La persoan es mayor")
    }
}

//ejercicio hecho por RAFA

class cPersona(vnombre: String, vedad: Int){
    var nombre: String =vnombre
    var edad: Int =vedad    //Diferenciar e l valor pasado por parametro,al del nombre del atributo

    init {
        if (nombre.isEmpty()  nombre.isBlank()) nombre= "Nombre Vacio" else nombre.uppercase()
        if (edad<0  edad >120) edad=0
    }
    fun imprimirme()= when (edad){
        in 0 .. 17 -> "$nombre Persona menor de edad"
        in 17 .. 29 -> "$nombre Persona joven" else ->"$nombre persona adulta"
    }
    
}


class cTriangulo (var lado1:Int, var lado2:Int,var lado3:Int){

fun ladoMayo() = when {
    lado1 == lado2 && lado1 == lado3 -> "Los 3 lados son iguales"
    lado1 > lado2 && lado1 > lado3 -> "El lado mayor es el lado1 : $lado1"
    lado2 > lado3 -> "El lado mayor es el lado2 : $lado2"
    else -> "El lado mayor es el lado3 : $lado3"

}
}//Class cTriangulo