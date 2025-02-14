//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DeckOfCards {
    public static void main(String[] args) {
       int[] deck = new int[52];
       String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
       String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        //Initialize cards
        // deck[i] = 0 means Ace of Spades
        //deck[i] = 1 means 2 of Spades
        //...
        //deck[i] = 12 means King of Spades
        //deck[i] = 13 means Ace of Hearts
        //deck[i] = 14 means 2 of Hearts (14 % 13 = 1 --> a 2; 14/13 = 1 --> a Hearts)
        //...
        //deck[i] = 25 means King of Hearts
        //...

        for(int i = 0; i < deck.length; i++){
            deck[i] = i;
        }

        //Shuffle the card
        for(int i = 0; i < deck.length; i++){
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        // Display the first four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }
}