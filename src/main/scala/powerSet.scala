object powerSet extends App {

  val s1 = Set(1,2,3,4)
  val s2 = Set(2,3)
  val s3 = Set(7,8)

  def findSubset(set1: Set[Int], set2: Set[Int]): Unit = {

    if(set2.subsetOf(set1)) {
      println(s"Set 2: $set2 is a subset of Set 1: $set1")
    }
    else if(set1.subsetOf(set2)) {
      println(s"Set 1: $set1 is a subset of Set 2: $set2")
    }
    else println("Sets aren't subsets of each other")
  }

  findSubset(s1,s2)
  findSubset(s1,s3)

}
