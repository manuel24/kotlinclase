package POO

fun main(args:Array<String>){

   println("Program arguments: ${args.joinToString()}")

   val persona1:Persona= Persona("Juan",12)
   persona1.comprobar_edad()

}