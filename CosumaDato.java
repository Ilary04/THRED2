 class ConsumaDato extends Thread{
    Semaforo pieno ;
    Semaforo vuoto;
    int dato;
    public ConsumaDato(Semaforo s1, Semaforo s2,boolean finito){
        pieno=s1;
        vuoto=s2;
        finito=true;
    }
    public void run(){
        while(true){
            pieno.p();
            vuoto.v();
            vuoto.v2();
            dato=MainEsercizi.buffer;
            System.out.println("dato letto"+dato);
        }
       
    }
}