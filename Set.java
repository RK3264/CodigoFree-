
package Conjunto;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author Daniel Bermeo
 */
public class Set<T> {

    private ArrayList<T> set;

    public Set() {
        set = new ArrayList(0);
    }

    public int getLength() {
        return set.size();
    }

    public boolean contiene(T t) {
        boolean centinela = false;

        for (T a : set)
        {
            if (a == t)
            {
                centinela = true;
            }
        }

        return centinela;
    }

    public void agregar(T t) {

        boolean centinela = true;

        for (T a : set)
        {
            if (a == t)
            {
                centinela = false;
            }
        }

        if (centinela)
        {
            set.add(t);
        }
    }

    public void eliminar(T t) {

        set.remove(t);

    }

    public boolean equals(Set conjunto) {
        boolean centinela = true;

        if (set.size() == conjunto.getLength())
        {

            for (T a : set)
            {
                if (!conjunto.contiene(a))
                {
                    centinela = false;
                }
            }

        } else
        {
            centinela = false;
        }

        return centinela;
    }
    
    public boolean esSubConjunto(Set subConjunto){
        boolean centinela = true;
        
        if(subConjunto.getLength() > set.size()){
            
            for(T a: set){
                
                if(!subConjunto.contiene(a)){
                    centinela = false;
                }
                
            }
            
        }else{
            centinela = false;
        }
        
        return centinela;
    }
    
    public Set union(Set conjunto){
       
        Set nuevo = conjunto;
        
        for(T a: set){
            nuevo.agregar(a);
        }
        
        return nuevo;
    }
    
    public Set interseccion(Set conjunto){
        Set nuevo = new Set();
        
        for(T a: set){
            
            if(conjunto.contiene(a)){
                nuevo.agregar(a);
            }
            
        }
        
        return nuevo;
    }
    
    public Set diferencia(Set conjunto){
        Set nuevo = new Set();
        
        for(T a: set){
            
            if(!conjunto.contiene(a)){
                nuevo.agregar(a);
            }
        }
        
        return nuevo;
    }
    
    public Iterator iterator(){
        return set.iterator();
        
    }
    
    
}
