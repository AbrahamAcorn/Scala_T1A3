object Sumatoria {

  def fSuma(x:Int, y:Int, va:Int): Unit={
    var sum=va+x
    if(x<y)
      fSuma(x+1,y,sum)
    else
      println("Fin xD: "+ sum)
  }

  def main(args: Array[String]): Unit = {

    var uno=0
    var dos=0

    println("Ingresa el primer numero")
    uno = scala.io.StdIn.readInt()

    println("Ingresa el primer numero")
    dos = scala.io.StdIn.readInt()

    fSuma(uno,dos,0)
  }

}
