package org.hbrs.se1.ws22.uebung2;

import org.hbrs.se1.ws22.uebung3.persistence.PersistenceException;
import org.hbrs.se1.ws22.uebung3.persistence.PersistenceStrategyStream;

public class Client {

    public static void main(String[] args) throws ContainerException, PersistenceException {
        MemberView memberView = new MemberView();
        GenericContainer genericContainer = GenericContainer.getInstance();
        genericContainer.setPersistenceStrategy(new PersistenceStrategyStream());

        genericContainer.addMember(new ConcreteMember());
        genericContainer.addMember(new ConcreteMember());
        genericContainer.addMember(new ConcreteMember());
        memberView.dump(genericContainer.getCurrentList());
        genericContainer.addMember(new ConcreteMember());
        genericContainer.addMember(new ConcreteMember());
        memberView.dump(genericContainer.getCurrentList());

        genericContainer.store();

        genericContainer.deleteMember(0);
        memberView.dump(genericContainer.getCurrentList());

        genericContainer.load();
        System.out.println(genericContainer.getCurrentList());
    }
}
