import java.io.Console;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class quiz {
String text;
int wrongAnswer = 10;
Set<String> letters = new HashSet<String>(); 
Scanner in = new Scanner(System.in);
ArrayList<String> yourLetters = new ArrayList<String>();
	public quiz(String text) {
	this.text=text;
	changeTextToLetters();
	guess();
}
	
	
	public void changeTextToLetters() {
		
		for(int i=0;i<text.length();i++) {
			letters.add(text.charAt(i)+"");
			yourLetters.add("*");
		}
	}
	
	public void guess() {
		System.out.println("Witam w zgadywaniu. Gra polega na zgadniêciu s³owa lub liter jakie znajduja siê w zgadywanym s³owie. ");
		
		while(true) { 
		System.out.println("Zgadywane s³owo posiada " + text.length()+ " znaki.");
		Iterator itt2 = yourLetters.iterator();
		while(itt2.hasNext()) {
			
			System.out.print(itt2.next());
		}
		System.out.println("\nZgaduj: ");
		String text1 = in.next();
		if(text.equalsIgnoreCase(text1)) {
			win();
			break;
		}
		if(letters.contains(text1.toUpperCase()) || letters.contains(text1.toLowerCase())) {
			System.out.println(text1);
			serachLetters(text1);
			if(!yourLetters.contains("*"))
			win();
			letters.remove(text1); }
		else{
			wrongAnswer--;
			System.out.println("Poda³eœ b³êdn¹ odpowiedz. Zosta³y Ci jeszcze "+wrongAnswer+" b³edy.");
		}
		if(wrongAnswer==0)
			lose();
		}
	
	}
		
	public void serachLetters(String quess) {
		for(int i=0, w=1;i<=text.length()-1;i++,w++) {
			String s = text.substring(i, w);
			if(s.equalsIgnoreCase(quess))
				yourLetters.set(i, quess);
			
		}
	}
	
	public void win() {
		System.out.println("WYGRANA\n Zgad³eœ gratulujemy");
		System.out.println("Jesli masz ochote zagraæ ponownie proszê wpisac s. Podanie innego znaku zakonczy program");
		String char1 = in.next();
		if(!char1.equalsIgnoreCase("s"))
			System.exit(0);
		else {
			quiz game = new quiz(new text().getText());
		}
	}
	
	public void lose() {
		System.out.println("Przykro mi PRZEGRA£EŒ :(");
		System.out.println("Poprawne has³o to "+text);
		System.out.println("Jesli masz ochote zagraæ ponownie proszê wpisac s. Podanie innego znaku zakonczy program");
		String char1 = in.next();
		if(!char1.equalsIgnoreCase("s"))
			System.exit(0);
		else {
			quiz game = new quiz(new text().getText());
		}
	}
}
