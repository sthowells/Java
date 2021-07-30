import java.util.Random; // import Random to deal random cards

public class Card
{
    private static Random gen = new Random();
    private int suit, num;
    private String cardSuit, cardNum;

    //	Generate random card with face value and suit.
    public void randCard() {
	    num = gen.nextInt(13) +1; 
	    suit = gen.nextInt(4) +1;	
    }
    
    //	Set up Card for random values
    public Card () {
	    randCard();
    }

    //	To string method to match integer with card string.
    public String toString() {
        if (num >2 && num < 10)
		    cardNum = Integer.toString(num);
	    else if (num == 1)
		    this.cardNum = "Ace";
	    else if (num == 11)
		    this.cardNum = "Jack";
	    else if (num == 12)
		    this.cardNum = "Queen";
	    else 
		    this.cardNum = "King";
		
	    if (suit == 1)
		    this.cardSuit = "Spades";
	    else if (suit == 2)
		    this.cardSuit = "Hearts";
	    else if (suit == 3)
		    this.cardSuit = "Clubs";
	    else 
		    this.cardSuit = "Diamonds";
			
	    return this.cardNum + " of " + this.cardSuit; // return card face value and suit		
    }

// Return 5 random cards.
public static void main(String[] args) {
    int num = 1;
    Card myCard = new Card(); // card created

    System.out.println ("Your five cards are: \n");

    for (int i=1; i <=5; i++) {
	    myCard.randCard();
	    System.out.println (num + ": " + myCard);
	    num++;
    }
}
}