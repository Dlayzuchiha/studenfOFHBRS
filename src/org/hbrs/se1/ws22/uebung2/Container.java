package org.hbrs.se1.ws22.uebung2;

import java.util.ArrayList;

public class Container {

    public ArrayList<ConcreteMember> concreteMembers = new ArrayList<>();

    public Container() {

    }

    public static void main(String[] args) throws ContainerException {
        Container container = new Container();
        ConcreteMember objekt0 = new ConcreteMember();
        ConcreteMember objekt1 = new ConcreteMember();

        container.addMember(objekt0);
        container.addMember(objekt1);
        container.addMember(new ConcreteMember());

        System.out.println("Anzahl an abgespeicherten Objekten: " + container.size());
        container.dump();

        System.out.println(container.deleteMember(5));
        System.out.println("Anzahl an abgespeicherten Objekten: " + container.size());

        container.dump();
        System.out.println(container.deleteMember(1));
        System.out.println("Anzahl an abgespeicherten Objekten: " + container.size());

        container.dump();
    }

    public void addMember(ConcreteMember member) throws ContainerException {
        for (ConcreteMember concreteMember : concreteMembers) {
            if (concreteMember.getID() == member.getID())
                throw new ContainerException("Das Member-Objekt mit der ID: " + member.getID() + " ist bereits vorhanden!");
        }
        concreteMembers.add(member);
    }

    public String deleteMember(Integer ID) {
        for (int i = 0; i < concreteMembers.size(); i++) {
            if (concreteMembers.get(i).getID() == ID) {
                concreteMembers.remove(i);
                return "Das Member-Objekt mit der ID: " + ID + " wurde geloescht.";
            }
        }
        return "Das Member-Objekt mit der ID: " + ID + " ist nicht vorhanden und kann deshalb nicht geloescht werden.";
    }

    public void dump() {
        for (ConcreteMember s : concreteMembers) {
            System.out.println(s.toString());
        }
    }

    public int size() {
        return concreteMembers.size();
    }
}
