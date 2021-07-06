enum class CardSuit{
    SPADE, DIAMOND, HEART, CLUB
}

class Card(val suit: CardSuit, val num: Int) {
    override fun toString(): String {
        var numToStr = when(num) {
            1 -> "ACE"
            11 -> "Jack"
            12 -> "Queen"
            13 -> "King"
            else -> num.toString()
        }

        return "${suit.toString()} ${numToStr}"
    }
}

fun main(args : Array<String>) {
    //
    var spade = CardSuit.SPADE
    var diamond = CardSuit.DIAMOND
    var heart = CardSuit.HEART
    var club = CardSuit.CLUB

    //
    var card1 = Card(CardSuit.SPADE, 1)
    var card2 = Card(CardSuit.DIAMOND, 2)
    var card3 = Card(CardSuit.HEART, 3)
    var card4 = Card(CardSuit.CLUB, 4)
    var card11 = Card(CardSuit.DIAMOND, 11)
    var card12 = Card(CardSuit.HEART, 12)
    var card13 = Card(CardSuit.CLUB, 13)

    println(card2)
    println(card3)
    println(card4)
    println(card1)
    println(card11)
    println(card12)
    println(card13) //  print함수의 인수로 Card 객체를 넣으면 내부적으로 toString 함수를 호출함. 따라서, Card 클래스의 toString 메서드를 재정의 해야함.


    println(card13.toString())


}