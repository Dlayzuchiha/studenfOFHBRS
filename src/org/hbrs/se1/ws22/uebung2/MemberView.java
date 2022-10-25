package org.hbrs.se1.ws22.uebung2;



import java.util.List;

public class MemberView {

    public void dump(List<Member> liste) {
        System.out.println("Ausgabe aller Memberen: ");
        // Loesung mit For each:
        for (Member m : liste) {
            System.out.println(m.toString());
        }

        // Loesung mit Iterator:
        // Iterator<Member> i = liste.iterator();
        //  while (  i.hasNext() ) {
        //	   Member p = i.next();
        //	   System.out.println("ID: " + p.getID() );
        //  }
    }
}
