import scala.io.StdIn.readLine;
import scala.io.StdIn.readInt;

object Main {

  def isRainbow(len: Int): Boolean = {
    val cLine : Array[Int] = readLine().split(" ").map(_.toInt)
    var front : Int = 0
    var back : Int = cLine.length - 1
    val maxNo : Int = 7
    var curNo : Int = 1

    var noFound : Boolean = false
    while(front <= back && curNo <= maxNo) {
      noFound = false

      while( front <= back && cLine(front) == curNo && cLine(front) == cLine(back)) {
        noFound = true
        front += 1
        back -= 1
      }

      if( ! noFound ) return false
      curNo += 1
    }

    if(curNo == maxNo + 1) return true else return false
  }
  def main(args: Array[String]) {
    var T = readInt()

    while (T > 0) {
      var N = readInt()

      if (isRainbow(N))
        println("yes")
      else
        println("no")

      T -= 1
    }

    return 0
  }
}

