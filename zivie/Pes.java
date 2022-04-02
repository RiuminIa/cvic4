package zivie;

public class Pes extends Zivocich{
    public Pes(String meno){
        super(4,meno);
    }
    @Override
    public void zvuk() {
        System.out.println("gaf gaf");
    }
}
