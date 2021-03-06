import scala.collection.mutable.ListBuffer


object Ejercicio02 {
  
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
  
  def pedirPalabra1():String = {
    println("Ingrese la palabra que se quiere modificar")
    var palabra = readLine()
    palabra
  }
  def pedirPalabra2():String = {
    println("Ingrese la palabra nueva para sustitución")
    var palabra = readLine()
    palabra
  }
  def sustituirPalabra(palabra1: String, palabra2: String, lista: => ListBuffer[String]) : ListBuffer[String] = {
    var num = 0
    for(i <- 0 until lista.size){
      if(lista(i) == palabra1){
        num += 1
        lista.remove(i)
        lista.insert(i, palabra2)
      }
    }
    lista
  }
  
  def main(args: Array[String]): Unit = {
    var lista = crearLista()
    println("Lista: " + lista)
    
    lista= sustituirPalabra(pedirPalabra1(), pedirPalabra2(), lista)
    println("Lista : " + lista)
  }
  

}