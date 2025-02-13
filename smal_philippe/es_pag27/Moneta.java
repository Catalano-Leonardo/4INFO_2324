public class Moneta {
    private int testa = 0;
    private int faccia;

    public Moneta() {
        lancia();
    }

    public void lancia() {
        faccia = (int)(Math.random() * 2);
    }

    public boolean isTesta() {
        return (faccia == testa);
    }

    public String toString() {
        String nomeFaccia;
        if (isTesta()) nomeFaccia = "Testa";
        else nomeFaccia = "Croce";

        return nomeFaccia;
    
    }




}
