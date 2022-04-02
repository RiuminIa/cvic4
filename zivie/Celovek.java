package zivie;

public class Celovek extends Zivocich{
        public Celovek(String name){
            super(2,name);
        }
        @Override
        public void zvuk() {
            System.out.println("blya blya");
        }

}

