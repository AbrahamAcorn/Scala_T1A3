object Factorial {

  def fFactorial(x:Int, y:Int): Unit={
    if(x>0) {
      fFactorial(x-1,y*x)
    }else println("El factorial es: "+y)
  }

  def main(args: Array[String]): Unit = {
    var uno=0
    println("Ingresa un numero y encuntra el factorial :v")
    uno = scala.io.StdIn.readInt()
    fFactorial(uno,1)
  }

}
