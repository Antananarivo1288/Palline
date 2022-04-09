import javax.swing.*;

public class Finestra extends Thread{
    Pallino[] v; //oggetto condiviso per conoscere la posizione dei pallini

    public Finestra(String nome, Pallino[] v){
        super(nome);
        this.v=v;
    }
    public void run(){
        JFrame finestra=new JFrame("Animazione");
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setSize(800,600);

        Disegna d = new Disegna(v); //creo il JPanel
        finestra.setContentPane(d); //aggiungo JPanel alla finestra

        finestra.setVisible(true);

        d.ridisegna();  //chiamo il metodo per ridisegnare
    }
}
