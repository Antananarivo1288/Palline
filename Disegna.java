import javax.swing.*;
import java.awt.*;

public class Disegna extends JPanel {
    public Pallino[]v;  //oggetto condiviso per conoscere la posizione dei pallini

    public Disegna(Pallino[]v){
        super();
        this.v=v;
    }
    public void ridisegna(){
        while(true){
            try {
                Thread.sleep(16);
            } catch (Exception e) {
                e.printStackTrace();
            }
            repaint();  //ogni 16 millisecondi richiamo il metodo paint per disegnare
        }
    }

    public void paint(Graphics g){
        super.paint(g); //cancello tutto (lo ricreo vuoto)
        g.setColor(Color.white);
        g.fillRect(0,0,800,600);    //disegno lo sfondo
        g.setColor(Color.red);  //disegno i pallini
        int x,y;
        for(int i=0;i<v.length;i++){
            //leggo tutti gli elementi dell'array di pallini
            x=v[i].getX();
            y=v[i].getY();
            g.fillOval(x,y,20,20);  //disegno i pallini
        }
    }
}
