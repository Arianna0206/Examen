package Examen

object Ejercicio1 extends App{

  val arreglo = Array(1,2,-3,-4,5,-6)
  var p = 0
  var n = 0
  for (i <- arreglo) {
    if (i > 0) {
      print(i + ",")
    }
  }
  for(i <- arreglo){
    if(i < 0){
      print(i + ",")
    }
  }
}
