package Lab4;

public class CardTest {
    public static void main(String[] args) {

        Deck deck1 = new Deck();
        deck1.displayCards();
        deck1.shuffle();
        deck1.displayRandoms();
    }
}
