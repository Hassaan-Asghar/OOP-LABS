package Lab4;

public class Card {
    final String colour;
    final String rank;

    Card(String suit, String rank){
        this.colour = suit;
        this.rank = rank;
    }

    public String getColour() {
        return colour;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString(){
        return rank + " of " + colour;
    }
}

