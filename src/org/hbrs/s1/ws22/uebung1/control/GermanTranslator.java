package org.hbrs.s1.ws22.uebung1.control;

public class GermanTranslator implements Translator {

	public String date = "Okt/2022"; // Default-Wert

	/**
	 * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
	 */
	public String translateNumber( int number ) {
		// [ihr Source Code aus Übung 1-2]
		String eins_zehn[] = {"", "eins", "zwei", "drei", "vier", "fuenf", "sechs", "sieben", "acht", "neun", "zehn"};

		if (number >= 1 && number <= 10)
			return eins_zehn[number];

		return "Übersetzung der Zahl " + number + " nicht möglich. Versionsnummer des Translators " + Translator.version;
	}

	/**
	 * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
	 */
	public void printInfo(){
		System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
	}

	/**
	 * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: Okt/2022))
	 * Das Datum sollte system-intern durch eine Control-Klasse gesetzt werden und nicht von externen View-Klassen
	 */
	public void setDate( String date ) {
		this.date = date;
	}

}
