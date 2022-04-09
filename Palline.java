public class Palline {
    public static void main(String[] args) {
        //creo 2 pallini (sono dei thread)
        Pallino p1 = new Pallino("p1",300,400);
        Pallino p2 = new Pallino("p2",500,600);

        //metto i pallini in un array
        Pallino[] v=new Pallino[2];
        v[0]=p1;
        v[1]=p2;

        //creo il thread per gestire l'interfaccia grafica
        Finestra f1=new Finestra("f1",v);

        //faccio partire i pallini
        p1.start();
        p2.start();
        //la posizione di ogni pallino è controllata da un thread diverso

        f1.start();
        //conviene gestire l'interfaccia grafica con un altro thread, in modo da non bloccare eventuali altre operazioni
    }
}
