abstract class ModeloVehiculo(var modelo: String, var numbastidor:String, var peso:Float?, var color:String){
    //Propiedades abstractas.
    abstract var velocidadMax: Float
    //Metodos abstractos, hay que definirlos en la clase hijo para ser llamados.
    abstract fun acelerar(valor:Int)
    abstract fun detener()
    //Métodos no abstractos definidos, pueden ser sobrescritos o llamadas.
    open fun fichaVehiculo() = println("Coche (Caracteristicas) \n  Modelo: $modelo \n No. Bastidor: $numbastidor \n Peso: $peso \n Color: $color \n Velocidad Max: $velocidadMax")
}

class ModeloSeat(_modelo:String, _bastidor:String, _peso:Float, _color:String):
    ModeloVehiculo(_modelo, _bastidor, _peso, _color){
    override var velocidadMax:Float = 0f
        set(value){
            if (value < 0) field = 0f else field = value
        }
    init {
        modelo = _modelo.uppercase()
        numbastidor = _bastidor.uppercase()
        peso = _peso?:0f
        color = _color.uppercase()
    }
    override fun acelerar(valor:Int) = println("Modelo Seat, acelerando a $valor")
    override fun detener() = println("Modelo Seat: Detenido")
    override fun fichaVehiculo(){
        println("Caracteristicas del Modelo Seat")
        super.fichaVehiculo()
    }
}