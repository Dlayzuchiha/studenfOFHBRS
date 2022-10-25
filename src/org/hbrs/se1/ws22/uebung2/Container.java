package org.hbrs.se1.ws22.uebung2;

import org.hbrs.se1.ws22.uebung3.persistence.PersistenceException;
import org.hbrs.se1.ws22.uebung3.persistence.PersistenceStrategyStream;

import java.util.ArrayList;
import java.util.List;

public class Container {

    public List<ConcreteMember> concreteMembers = new ArrayList<>();

    public Container() {

    }

    public void addMember(ConcreteMember member) throws ContainerException {

        if (member == null){
            throw new ContainerException();
        }

        for (ConcreteMember concreteMember : concreteMembers) {
            if (concreteMember.getID() == member.getID())
                throw new ContainerException(member.getID().toString());
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
