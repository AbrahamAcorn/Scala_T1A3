object Vocales {

  def fVocal(pos: Int, cadena: String, sum: Int): Unit={
    var count=sum
    if(pos< cadena.length) {
      if(cadena.charAt(pos)=='a'||cadena.charAt(pos)=='e'||cadena.charAt(pos)=='i'||cadena.charAt(pos)=='o'||cadena.charAt(pos)=='u')
        count+=1
      fVocal(pos+1,cadena,count)
    }else
      println("FIN la canridad de vocales es: "+count)




  }

  def main(args: Array[String]): Unit = {
    var uno=""

    println("Ingresa una cadena")
    uno = scala.io.StdIn.readLine()

    fVocal(0,uno,0)

  }

}
