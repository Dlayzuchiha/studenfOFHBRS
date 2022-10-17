package org.hbrs.se1.ws22.uebung2;

public class ConcreteMember implements Member{
    private static int uid = 0;
    private int ID;
    public ConcreteMember() {
        ID = uid++;
    }

    public Integer getID() {
        return ID;
    }

    public String toString() {
        return "Member ID = " + ID;
    }
}
