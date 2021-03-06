import scala.collection.mutable.ListBuffer


object Ejercicio07 {
     
  def verificarPalabras(palabra:String) : Boolean = {
    if (palabra.equals(palabra.reverse)) 
      true 
    else 
      false
  }

  def Palindromas(lista:ListBuffer[String]) : ListBuffer[String] = {
    val listaPalindromas = new ListBuffer[String]()
    
    for (i <- lista.indices) 
      if (verificarPalabras(lista(i))) 
        listaPalindromas += lista(i)
    listaPalindromas
  }

  def main(args: Array[String]): Unit = {
    
    val palabras = new ListBuffer[String]()
    println("Ingrese la cantidad de palabras para llenar la lista")
    val numPalabras = readInt()

    for (i <- 1 to numPalabras) {
      println("Ingrese la palabra " + i + ": ")
      palabras += readLine()
    }

    println("Lista")
    println(palabras)
    val palindromas = Palindromas(palabras)

    if(palindromas.isEmpty) 
      println("No se encontraron palabras palindromas")
    else {
      println("Lista de palabras palindromas")
      println(palindromas)
    }
  }
}