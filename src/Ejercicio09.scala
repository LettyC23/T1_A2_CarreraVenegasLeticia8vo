import scala.collection.mutable.ListBuffer


object Ejercicio09 {
  
  def verificarPrimo(num:Int) : Boolean = {
    var divisores = 0

    for (e <- 1 to num) if (num % e == 0) divisores += 1
    if(divisores == 2) 
      true 
    else 
      false
  }

  def obtenerPrimos(lista:ListBuffer[Int]) : ListBuffer[Int] = {
    val listaP = new ListBuffer[Int]()

    for (e <- lista.indices) if(verificarPrimo(lista(e))) listaP += lista(e)

    listaP
  }

  def obtenerSumatoriaPromedio(lista:ListBuffer[Int]) : Unit = {
    var sum = 0

    for (e <- lista.indices) sum += lista(e)
    println("Sumatoria: " + sum)
    println("Promedio: " + sum.toDouble/lista.length)
    
  }

  def obtenerFactorial(lista:ListBuffer[Int]) : ListBuffer[Int] = {
    val listaF = new ListBuffer[Int]()

    for (e <- lista.indices){
      var factorial = 1
      if (lista(e) > 2) for (i <- 2 to lista(e)) factorial *= i
      else factorial = lista(e)
      listaF += factorial
    }
    listaF
  }

  def main(args: Array[String]): Unit = {
    val num = new ListBuffer[Int]()
    println("Ingresa la cantidad de números para llenar la lista")
    val n = readInt()

    for (i <- 1 to n) {
      println("Ingresa el número " + i + ": ")
      num += readInt()
    }

    println("Numeros de la lista:")
    println(num)
    val primos = obtenerPrimos(num)
println()

    if(primos.isEmpty) println("No hay numeros primos")
    else {
      println("Numeros primos de la lista")
      println(primos)
    }
    
    obtenerSumatoriaPromedio(num)
    println("Numeros Factoriales de la lista")
    println(obtenerFactorial(num))
  }
  
}