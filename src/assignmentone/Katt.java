package assignmentone;

import javax.swing.JOptionPane;

public class Katt extends Djur{

    public Katt(String namn, int vikt) {
        super(namn, vikt);
    }
  
    @Override
    public void mat() {
        double matVikt = Math.round(((this.getVikt()*1000)/150)*100.0)/100.0;
        JOptionPane.showMessageDialog(null,"Katten " + this.getNamn() + " ska ha " + matVikt + "g Kattmat");
    }
}
