import java.util.Random;

public class text {
private String[] text = { "programowanie", "switch", "informatyka",
		"laptop" , "komputer", "monitor", "myszka", "klawiatura",
		"telefon", "internet", "dysk", "p³yta", "karta", "grafika",
		"strona", "ekran", "fotel", "kabel", "aplikacja", "praca",
		"dioda", "program", "dom", "mieszkanie", "wyraz", "elektryka",
		"telewizor", "blok", "okno", "drzwi", "futryna", "meble", "kuchnia",
		"salon", "³azienka", "sypialnia", "krzes³o", "stó³", "szafka",
		"komoda", "œwiat³o", "lampa", "fuga", "farba", "grzejnik",
		"blat", "lodówka", "kuchenka", "pó³ka", "mikrofalówka", "zlew",
		"œmieci", "³ó¿ko", "tapczan", "fotel", "biurko", "ksi¹¿ka", "zeszyt",
		"pióro", "d³ugopis", "lampka", "kartka", "kwiatek", "doniczka", "dach",
		"prysznic", "samochód", "peda³", "marka", "model", "kierownica",
		"piec", "opa³", "dachówka", "strych", "piwnica", "konfitura", "drewno", "deska",
		"ziemniak", "warzywa", "owoce", "gruszka", "banan", "marchewka", "pomidor", "seler",
		"ananas", "podwórko", "ogród", "spichlerz", "stajnia", "pies", "koñ", "kot", "szczur",
		"papuga", "ptak", "ryba", "ognisko", "silnik", "opona", "rower",
		"deskorolka", "rolki", "motocykl", "zasilacz", "gotówka", "parking",
		"reflektor", "generator", "podstawka", "aktor", "sprzedawca", "student"
};
private String selectText;
public text() {
	setSelectText();
}
public void setSelectText() {
	Random r = new Random();
	selectText = text[r.nextInt(text.length)];
}
public String getText() {
	return selectText;
}
}
