package kata

object Cards {

  def getHighest(cards: Seq[Int]): Int =
    cards.max

  def getPair(cards: Seq[Int]): (Int, Int) =
  // group by the value
  // identity just maps each value to itself
    cards
      .groupBy(identity)
      // filter to keep only those with
      // at least 2 of a value
      .filter{ case (_, xs) => xs.length == 2 }
      // convert each (value, seq) to a (value, value)
      // we don't care how many at this point
      .map{ case (value, _) => (value, value) }
      // take the maximum of all the tuples
      // (scala knows implicitly how to find the max of a list of tuples)
      .max

  // Flow:
  // Seq[Int] ==groupBy==> Map(Int, Seq[Int])
  //          ==filter==>  Map(Int, Seq[Int]) (with non-pairs removed)
  //          ==map==>     Map(Int, Int)
  //          ==max==>     (Int, Int)
}
