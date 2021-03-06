import scala.collection.mutable.ListBuffer

object Ejercicio04 {
  def crearLista1() : ListBuffer[String] = {
    var lista = new ListBuffer[String]()
    println("Ingrese el número de palabras que quiere ingresar a lista 1: ")
    var num = readInt()
    for(i <- 0 until num){
      println("Ingrese la palabra " +(i+1) + ":")
      lista +=readLine()
    }
    lista
    
  }
  
  def crearLista2() : ListBuffer[String] = {
    var lista = new ListBuffer[String]()
    println("Ingrese el número de palabras que quiere ingresar a lista 2: ")
    var num = readInt()
    for(i <- 0 until num){
      println("Ingrese la palabra " +(i+1) + ":")
      lista +=readLine()
    }
    lista
    
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
  
 def eliminarPalabras(lista1: => ListBuffer[String], lista2: => ListBuffer[String]) : ListBuffer[String] = {
    var lista = lista1
    for(i <- 0 until lista2.size){
      lista = eliminarPalabra(lista2(i), lista1) 
    }
    lista
  }
  
  def main(args: Array[String]): Unit = {
    var lista1 = crearLista1()
    var lista2 = crearLista2() 
    println("Lista1: " + lista1)
    println("Lista2: " + lista2)
    
    lista1 = eliminarPalabras(lista1, lista2)
    println("Lista 1: " + lista1)

  }
}