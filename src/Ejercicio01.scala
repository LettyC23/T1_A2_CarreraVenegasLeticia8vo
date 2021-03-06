import scala.collection.mutable.ListBuffer


object Ejercicio01 {
  
  def crearLista() : ListBuffer[String] = {
    var lista = new ListBuffer[String]()
    println("Ingrese el número de palabras que quiere ingresar a lista")
    var num = readInt()
    for(i <- 0 until num){
      println("Ingrese la palabra " +(i+1) + ":")
      lista +=readLine()
    }
    lista
    
  }
  
  def pedirPalabra():String = {
    println("Ingrese una palabra para buscarla en la lista")
    var palabra = readLine()
    palabra
  }
  
  def numeroDePalabras(palabra: String, lista: =>ListBuffer[String]): Unit ={
    var num = 0
    for (p <- lista){
      if(p == palabra){
        num+=1
      }
    }
    println("Número de veces que aparece la palabra: " + num)
  }
  
  
  def main(args: Array[String]): Unit = {
    var lista = crearLista()
    numeroDePalabras(pedirPalabra, lista)
  }
}