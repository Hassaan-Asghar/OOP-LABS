package Lab4;

import java.util.Random;

public class Deck {
    String colour [] = {"Blue","Green","Red","Yellow"};
    String ranks [] = {"1","2","3","4","5","6","7","8","9","Reverse","Reverse","Skip","Skip","Draw Two","Draw Two"};

    Card cards [] = new Card[60];

    Deck(){
        int counter = 0;
        for (int i = 0; i < colour.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards[counter++] = new Card(colour[i], ranks[j]);
            }
        }
    }

    public void displayCards(){
        System.out.println("\nDisplaying UNO Cards: \n");
        for(int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);

            if (i == 14 || i == 29 || i == 44 || i == 59){
                System.out.println();
            }
        }
    }

    public void shuffle(){
        Random random = new Random();
        for(int i = 0; i < 6000; i++)
        {
            Card temp = cards[0];
            int ran=random.nextInt(52);
            cards[0] = cards[ran];
            cards[ran] = temp;

        }
    }

    public void displayRandoms(){
        System.out.println("Displaying Random UNO Cards: \n");
        for(int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }
    }
}

