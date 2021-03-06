import scala.collection.mutable.ListBuffer


object Ejercicio06 {
  def listaNumeros(lista: ListBuffer[Int]) : Unit = {
    println("Ingrese la cantidad de numeros para llenar la lista ")
    var n = readInt()
    for(i <- 1 to n){
      println("Ingrese el número " + i + ": ")
      lista += readInt()
    }
  }
  
  def mostrar(lista: ListBuffer[Int]) : Unit = {
    print("[")
    for(i <- lista.indices){
      if(i == lista.length-1){
        print(lista(i))
      }else{
        print(lista(i) + ", ")
      }
    }
    println(" ]")
  }
  
  def suma(lista: ListBuffer[Int]) : ListBuffer[Int] = {
    var suma = new ListBuffer[Int]()
    
    for (e <- lista.indices) if(e == 0) suma += lista(e) else suma += suma(e-1) + lista(e)
    
    suma
  }
  
  def main(args: Array[String]): Unit = {
    var numeros = new ListBuffer[Int]()
     listaNumeros(numeros)
    
    println("Lista de sumatoria acumulada: " + suma(numeros))
  }
}