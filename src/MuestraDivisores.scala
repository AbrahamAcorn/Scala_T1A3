object MuestraDivisores {
  def fDivisores(x:Int, y:Int): Unit={
    var min=x-1
    if(x>0) {
      if((y%x)==0) {
        println(x + " es un divisor de "+ y)
      }
      fDivisores(min,y)
    }else println("Fin.....")
  }

  def main(args: Array[String]): Unit = {
    var uno=0
    println("Ingresa un numero para conocer sus divisores")
    uno = scala.io.StdIn.readInt()
    fDivisores(uno,uno)
  }

}
