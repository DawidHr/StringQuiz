import java.util.Random;

public class text {
private String[] text = { "programowanie", "switch", "informatyka",
		"laptop" , "komputer", "monitor", "myszka", "klawiatura",
		"telefon", "internet", "dysk", "p�yta", "karta", "grafika",
		"strona", "ekran", "fotel", "kabel", "aplikacja", "praca",
		"dioda", "program", "dom", "mieszkanie", "wyraz", "elektryka",
		"telewizor", "blok", "okno", "drzwi", "futryna", "meble", "kuchnia",
		"salon", "�azienka", "sypialnia", "krzes�o", "st�", "szafka",
		"komoda", "�wiat�o", "lampa", "fuga", "farba", "grzejnik",
		"blat", "lod�wka", "kuchenka", "p�ka", "mikrofal�wka", "zlew",
		"�mieci", "��ko", "tapczan", "fotel", "biurko", "ksi��ka", "zeszyt",
		"pi�ro", "d�ugopis", "lampka", "kartka", "kwiatek", "doniczka", "dach",
		"prysznic", "samoch�d", "peda�", "marka", "model", "kierownica",
		"piec", "opa�", "dach�wka", "strych", "piwnica", "konfitura", "drewno", "deska",
		"ziemniak", "warzywa", "owoce", "gruszka", "banan", "marchewka", "pomidor", "seler",
		"ananas", "podw�rko", "ogr�d", "spichlerz", "stajnia", "pies", "ko�", "kot", "szczur",
		"papuga", "ptak", "ryba", "ognisko", "silnik", "opona", "rower",
		"deskorolka", "rolki", "motocykl", "zasilacz", "got�wka", "parking",
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
