package org.hbrs.s1.ws22.uebung1.view;

import org.hbrs.s1.ws22.uebung1.control.GermanTranslator;

public class Client {
	public static GermanTranslator _germanTranslator;

	public Client(GermanTranslator translator) {
		_germanTranslator = translator;
	}

	/*
		 * Methode zur Ausgabe einer Zahl auf der Console (auch bezeichnet als CLI, Terminal)
		 */
		public void display( int aNumber ){
			// In dieser Methode soll die Methode translateNumber
			// mit dem übergegebenen Wert der Variable aNumber
			// aufgerufen werden.
			//
			// Strenge Implementierung gegen das Interface Translator gewuenscht!

			System.out.println("Das Ergebnis der Berechnung: " +
					_germanTranslator.translateNumber(aNumber)  );

		}
}





