import java.util.Scanner;

public class Palline {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Quante palline voui creare? ---->");
        int n=sc.nextInt();
        Pallino[] v=new Pallino[n];
        for(int i=0;i<v.length;i++){
            v[i]=new Pallino("p"+i,(int)(Math.random()*800),(int)((Math.random()*(1000-200))+200));
            v[i].start();    //faccio partire i pallini
        }

        //la posizione di ogni pallino è controllata da un thread diverso*/

        //creo il thread per gestire l'interfaccia grafica
        Finestra f1=new Finestra("f1",v);
        f1.start();
        //conviene gestire l'interfaccia grafica con un altro thread, in modo da non bloccare eventuali altre operazioni
    }
}
