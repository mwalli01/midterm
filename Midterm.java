package assignments;
import java.util.*;
public class Midterm {
	//returnCards
	//
	//this method takes a card abbreviation and returns the unabbreviated form.
	//By: m.w.
	//10/28/2019
	//*******************************************************************
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		returnCards("j","s");
	}
	
	public static void returnCards(String rank, String suit) {
		//create two arraylists to store the unabbreviated rank and suit names
		ArrayList<String> r = new ArrayList<String>();
		ArrayList<String> s = new ArrayList<String>();
		//add suite and rank names to the arraylist
		r.add("zero");
		r.add("one");
		r.add("two");
		r.add("three");
		r.add("four");
		r.add("five");
		r.add("six");
		r.add("seven");
		r.add("eight");
		r.add("nine");
		r.add("ten");
		r.add("jack");
		r.add("queen");
		r.add("king");
		r.add("ace");
		
		s.add("hearts");
		s.add("spades");
		s.add("diamonds");
		s.add("clubs");
		//loop thru the rank array, excluding the last 4 ranks because they dont match with integer based indices
		for(int i = 0; i<r.size();i++) {
			if(!((rank == "j")||(rank == "q")||(rank == "k")||(rank == "a"))) {
				//parse rank parameter to compare to the correct indice to print
				int p = Integer.parseInt(rank);
				if( p == i) {
					System.out.print(r.get(i));
					
				}
			}
			//else if statements to find parameter entries if entry is a face card
			else if(rank == "j") {
				System.out.print("jack");
				break;
			}
			else if(rank == "q") {
				System.out.print("queen");
				break;
			}
			else if(rank == "k") {
				System.out.print("king");
				break;
				
			}
			else if(rank == "a") {
				System.out.print("ace");
				break;
			}
		}
		//if statements to find which unabbreviated form to use for the suite
		if(suit == "h") {
			System.out.print(" of hearts");
			
		}
		if(suit == "s") {
			System.out.print(" of spades");
			
		}
		if(suit == "d") {
			System.out.print(" of diamonds");
			
		}
		if(suit == "c"){
			System.out.print(" of clubs");
			
		}

	}

}
