package zivie;

import java.util.Comparator;

public abstract class Zivocich implements Comparator,Comparable {
    private int pocetNoh;
    private String meno;
    public abstract void zvuk();

    @Override
    public int compare(Object o1, Object o2) {
        return ((Zivocich)o1).meno.compareTo(((Zivocich)o2).meno);
    }

    @Override
    public int compareTo(Object o) {
        return this.meno.compareTo(((Zivocich)o).meno);
    }

    Zivocich(int pocetNoh, String meno){
        this.pocetNoh=pocetNoh;
        this.meno=meno;
    }

    @Override
    public String toString() {
        return meno+" ";
    }
}
