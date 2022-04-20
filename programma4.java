public class programma4 extends Semaforo{

    
    public programma4(int v) {
        super(v);
        
    }

    int x=1;
    int vfisso=10;
    int y=0;
    
    public void A (){
        While (true) ;{
        Object item = produce_item();
        p(); 
        p(); 
        insert(item); 
        V(x);
        V(y);
        }
    }

    private void insert(Object item) {
    }

    private void V(int x2) {
    }

    private Object produce_item() {
        return null;
    }

    private void While(boolean b) {
    }

    public void B (){
        While (true) ;{
            P(y);
            P(x);
            Object item = remove_item();
            V(x);
            V(vfisso);
            consume(item);
            }
    }

    private void consume(Object item) {
    }

    private Object remove_item() {
        return null;
    }

    private void P(int y2) {
    }
    
    
    
}
