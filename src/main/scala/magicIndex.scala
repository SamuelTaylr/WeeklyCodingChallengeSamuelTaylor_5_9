import scala.collection.mutable.ListBuffer

object magicIndex extends App {

  val testArray = Array[Int](1,2,3,3,7,5)

  def findMagicIndex(a: Array[Int]): Unit = {

    var count = 0
    var index = 0
    var dontGoHere = 0
    var dontGoHereList = ListBuffer[Int]()

    try {
      for(x <- a) {
        dontGoHere = x
        index = count
        if(x == a(x) && count == x) {
          println(s"Magic Index is $x at index $x")

        }
        count += 1
      }
    } catch {
      case e: ArrayIndexOutOfBoundsException => {
        println(s"Array index $dontGoHere was out of bounds.")
        dontGoHereList.append(dontGoHere)

        // Sets values that give out of bounds exceptions to 0 so full array can be traversed using recursion
        a(index) = 0
        println(s"Array index $dontGoHere was out of bounds.")
        findMagicIndex(a)
      }

    }


    // First try at a recursive method to revisit array while skipping values that give index out of bounds exceptions
    /*try {
      for(x <- a) {

        var counter = 0

        println("in here")

        if(x != dontGoHere) {

          if(x == a(x) && counter == x) {
            println(s"Magic Index is $x at index $x")

          }


        }
        counter += 1
      }
    }*/

  }

  findMagicIndex(testArray)

}
