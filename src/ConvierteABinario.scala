object ConvierteABinario {
  def main(args: Array[String]): Unit = {
    var uno=0
    println("Ingresa el numero a convertir")
    uno = scala.io.StdIn.readInt()
    println("El valor Binario es :"+ uno.toBinaryString)
  }

}

