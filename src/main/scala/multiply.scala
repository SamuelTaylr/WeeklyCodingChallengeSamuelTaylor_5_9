object multiply extends App {

  def multiplyFunction(x: Int, y: Int): Int = {

    if(x == 0 || y == 0) {


      return 0
    }
    else if(y < 0) {

      return - x + multiplyFunction(x, y + 1)
    }
    else return x + multiplyFunction(x, y -1)


  }

  println(multiplyFunction(4,4))
  println(multiplyFunction(3,-3))
  println(multiplyFunction(0,1))

}
