package Examen

object Ejercicio1 extends App{

  val arreglo: Array[Int] = Array(1,-2,-3,-4,5,-6)

  def PositivosNegativos(arreglo : Array[Int]): Array[Int] = {
    arreglo.sorted.reverse
  }
  println("Arreglo" + PositivosNegativos(arreglo).mkString(","))


}
