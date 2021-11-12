package Examen

object Pregunta2 extends App{
  val a = List(1,2,3)
  val b = List(1,2,3,4)

  println(a)
  println(b)

  val c = List.concat(a,b)
  println(c)
  

  if(a == b){
    println(true)
  }else{
    println(false)
  }
}
