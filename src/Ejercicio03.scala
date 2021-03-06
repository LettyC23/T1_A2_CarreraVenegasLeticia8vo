import scala.collection.mutable.ListBuffer


object Ejercicio03 {

  
  def crearLista() : ListBuffer[String] = {
    var lista = new ListBuffer[String]()
    println("Ingrese el número de palabras que quiere ingresar a lista: ")
    var num = readInt()
    for(i <- 0 until num){
      println("Ingrese la palabra " +(i+1) + ":")
      lista +=readLine()
    }
    lista
    
  }
  
  def pedirPalabra():String = {
    println("Ingrese una palabra para buscarla en la lista y eliminarla: ")
    var palabra = readLine()
    palabra
  }
  
  def eliminarPalabra(palabra: String, lista: => ListBuffer[String]) : ListBuffer[String] = {
    var num = 0
    for(i <- 0 until lista.size){
      if(lista(i) == palabra){
        num += 1
      }
    }
     for(e <- 0 until num){
      lista -= palabra
    }
    lista
  }

  
  
  def main(args: Array[String]): Unit = {
    var lista = crearLista()
    println("Lista: " + lista)
    
    lista = eliminarPalabra(pedirPalabra(), lista)
    println("Lista modificada: " + lista)
  }
}