/* Leave comments here [...]
 * 
 */

package blackjack;

public class Card {

	//attributes
	private String suit;
	private String id;
	private int value; //value of card - deals with the "face card" issue (Queen has value of 10, etc)

	//constructor - takes in string and int to create a card (suit and value)
	public Card(String s, int v) {
		suit = s;
		if (v == 11) {
			value = 10;
			id = "Jack";
		} else if (v == 12) {
			value = 10;
			id = "Queen";
		} else if (v == 13) {
			value = 10;
			id = "King";
		} else if (v == 1) {
			value = 11;
			id = "Ace";
		} else {
			value = v;
			id = Integer.toString(v);
		}
	}

	//get and set methods
	public String getSuit() { return suit; }

	public String getID() { return id; }

	public int getValue() { return value; }

	public void setSuit(String s) { suit = s; }

	public void setID(String i) { id = i; }

	public void setValue(int v) { value = v; }

	//toString method
	public String toString() { return id + " of " + suit; }
}//end Card class
