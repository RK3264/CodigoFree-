import java.util.ArrayList;
public class ADT2D<E> {
    private ArrayList<E> ren, aux;
    private int numRenglones, numColumnas;
    
    public ADT2D(int a, int b){    
        this.numRenglones = a;
        this.numColumnas = b;
        for(int i=0; i<numRenglones ; i++){
            ArrayList<E> tmp = new ArrayList();
            for(int j=0 ; j<numColumnas ; j++){
                tmp.add(null);
            }
            ren.add((E) tmp);   
        }
    }
    public void clear(E dato){
        for(int i=0; i<numRenglones ; i++){
            for(int j=0 ; j<numColumnas ; j++){
                aux.set(j,dato);
            }
            ren.set(i, (E) aux);
        }
    }
    public void setElement(int a,int b,E dato){
            aux =(ArrayList<E>) ren.get(a);
            System.out.println(aux);
            aux.set(b, dato);          
            ren.set(a, (E) aux);    
    }
    public E getElement(int a, int b){
        aux = (ArrayList<E>)ren.get(a);
        return (E) aux.get(b);            
    } 
    public int getLenghtRow(){
        return this.numRenglones;
    }
    public int getLenghtCol(){
        return this.numColumnas;
    }
    public String toString(){
        return String.format("%s", ren);
    } 
}
