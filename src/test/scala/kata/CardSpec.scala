package kata

import org.scalatest.{MustMatchers, FlatSpec}

class CardSpec extends FlatSpec with MustMatchers {

  "Cards#doThings" must "receive a list of cards" in {
    Cards.getHighest(
      Seq(
        1
      )
    )
  }
  it must "return the highest card" in {
    Cards.getHighest(Seq(2, 5)) mustBe 5
    Cards.getHighest(Seq(7, 5)) mustBe 7
    Cards.getHighest(Seq(7, 5, 2, 4, 7, 8, 2)) mustBe 8
  }
  it must "return a pair if it exists" in {
    Cards.getPair(Seq(1, 1, 7)) mustBe (1, 1)
    Cards.getPair(Seq(2, 2, 7)) mustBe (2, 2)
  }
}
