
import java.util.ArrayList;

public class ADT2D<E> {

    private ArrayList<E> ren, col, aux;
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
    
    public int getLenghtRow(){
        return this.numRenglones;
    }
    
    public int getLenghtCol(){
        return this.numColumnas;
    }
    
    public void clear(E dato){
        for(int i=0; i<numRenglones ; i++){
            for(int j=0 ; j<numColumnas ; j++){
                col.set(j,dato);
            }
            ren.set(i, (E) col);
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
    
    public String toString(){
        return String.format("%s", ren);
    } 
}
