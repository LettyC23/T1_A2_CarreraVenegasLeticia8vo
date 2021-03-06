import scala.collection.mutable.ListBuffer


object Ejercicio08 {
def verificarCapicuo(num:Int) : Boolean = {
    var n1 = ""
    var n2 = ""

    if (num.toString.length%2 == 0){
      n1 = num.toString.substring(0, num.toString.length/2)
      n2 = num.toString.substring(num.toString.length/2, num.toString.length)
    } else {
      n1 = num.toString.substring(0, num.toString.length/2)
      n2 = num.toString.substring((num.toString.length/2)+1, num.toString.length)
    }

    if (n1.equals(n2.reverse)) 
      true 
    else 
      false
  }

  def obtenerNumerosCapicuos(lista:ListBuffer[Int]) : ListBuffer[Int] = {
    val listaCapicuos = new ListBuffer[Int]()
    for (i <- lista.indices) 
      if(verificarCapicuo(lista(i))) 
        listaCapicuos += lista(i)
    listaCapicuos
  }

  def main(args: Array[String]): Unit = {
    val numeros = new ListBuffer[Int]()
    println("Ingrese la cantidad de numeros para llenar laa lista: ")
    val n = readInt()

    for (i <- 1 to n) {
      println("Ingrese el número " + i + ": ")
      numeros += readInt()
    }
    

    println("Lista")
    println(numeros)
    val capicuos = obtenerNumerosCapicuos(numeros)

    if(capicuos.isEmpty) println("No hay numeroc capicuos")
    else {
      println("Lista de numeros capicuos")
      println(capicuos)
    }
  }
}