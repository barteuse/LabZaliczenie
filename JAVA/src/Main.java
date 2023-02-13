public class Main {
    public static void main(String[] args) {

        sum sum1 = new sum(1,10);
        sum sum2 = new sum(11,20);
        sum sum3 = new sum(21,30);
        sum sum4 = new sum(31,40);
        sum sum5 = new sum(41,50);
        sum sum6 = new sum(51,60);
        sum sum7 = new sum(61,70);
        sum sum8 = new sum(71,80);
        sum sum9 = new sum(81,90);
        sum sum10 = new sum(91,100);

        sum1.start();
        sum2.start();
        sum3.start();
        sum4.start();
        sum5.start();
        sum6.start();
        sum7.start();
        sum8.start();
        sum9.start();
        sum10.start();

        try{
            sum1.join();
            sum2.join();
            sum3.join();
            sum4.join();
            sum5.join();
            sum6.join();
            sum7.join();
            sum8.join();
            sum9.join();
            sum10.join();
        }catch (InterruptedException e){}

        System.out.println("-------------------------------------------------");
        System.out.println ("Suma: "+sum1.suma + " Srednia: " + sum1.srednia);
        System.out.println ("Suma: "+sum2.suma + " Srednia: " + sum2.srednia);
        System.out.println ("Suma: "+sum3.suma + " Srednia: " + sum3.srednia);
        System.out.println ("Suma: "+sum4.suma + " Srednia: " + sum4.srednia);
        System.out.println ("Suma: "+sum5.suma + " Srednia: " + sum5.srednia);
        System.out.println ("Suma: "+sum6.suma + " Srednia: " + sum6.srednia);
        System.out.println ("Suma: "+sum7.suma + " Srednia: " + sum7.srednia);
        System.out.println ("Suma: "+sum8.suma + " Srednia: " + sum8.srednia);
        System.out.println ("Suma: "+sum9.suma + " Srednia: " + sum9.srednia);
        System.out.println ("Suma: "+sum10.suma + " Srednia: " + sum10.srednia);
    }
}

class sum extends Thread{
    int odilu, doilu;

    sum(int odilu, int doilu){
        this.odilu = odilu;
        this.doilu = doilu;
    }
    int suma = 0;
    int srednia = 0;

    public void run(){
        for (int i = odilu; i<doilu; i++){
            suma = suma + i;
        }
        System.out.println("Policzono sume");
        srednia = suma/10;
    }
}

