public class Pallino extends Thread{
    public int x;
    public int y;
    public int velocita;    //quanti pixel al secondo percorre
    public int verso;
    public Pallino(String nome, int x  , int velocita){
        super(nome);    //chiamo il costruttore di nome
        this.x=x;

        this.velocita=velocita;
        this.verso=+1;  //+1 verso il basso, -1 verso l'alto
    }
    public void run(){
        while (true){
            avvio();    //chiama continuamente questo metodo che aggiorna la posizione del pallino
        }
    }
    public void avvio(){
        //calcolo ogni 8 millisecondi la posizione del Pallino
        //1000/60=16 ms     Se si vogliono 60 fps bisogna aggiornare ogni 16 millisecondi (ma calcoliamo la posizione ogni 8 per avere più fluidità)
        try {   //obbligatoria la try/catch
            Thread.sleep(8);
        } catch (Exception e) {
            e.printStackTrace();
        }

        y=y+(int)((double)velocita*8*verso/1000);  //calcolo quanto spazio il pallino percorre in 8 millisecondi
        //in base al verso lo sommo o lo sottraggo

        if(y>600){
            this.y=600;
            this.verso=-1;
            //quando arrivo in basso alla finestra inverto il verso e riparto da 600 (per non farlo andare oltre)
        }
        if(y<0){
            this.y=0;
            this.verso=+1;
            //quando arriva in alto alla finestra inverto nuovamente il verso
        }
    }

    //restituisce la posizio del Pallino
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
//non sincronizziamo i metodi avvio, getX e getY per problemi di prestazioni
