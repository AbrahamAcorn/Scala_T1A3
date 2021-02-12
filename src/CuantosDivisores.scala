object CuantosDivisores {
  def fDivisores(x:Int, y:Int, sum:Int): Unit={
    var min=x-1
    var sm=sum
    if(x>0) {
      if((y%x)==0) {
        //println(x + " es un divisor de "+ y)
        sm=sm+1
      }
      fDivisores(min,y,sm)
    }else println("Fin..... el numero de divisores es: "+sm)
  }

  def main(args: Array[String]): Unit = {
    var uno=0
    println("Ingresa un numero para conocer sus divisores")
    uno = scala.io.StdIn.readInt()
    fDivisores(uno,uno,0)
  }
}
