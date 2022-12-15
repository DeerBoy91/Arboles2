
package proyecto_3;

public class Arbol {
    
    Nodo raiz;
    public Arbol(){
    raiz=null;
}
    
    public void insertar(int i, String genero, String nombre){
        Nodo n = new Nodo (i);
        n.contenido = genero;
        n.nombre = nombre;
        
        if(raiz==null){
            raiz=n;
        }else{
            Nodo aux = raiz;
            while(aux!=null){
                n.padre=aux;
                if(n.llave>=aux.llave){
                    aux=aux.derecha;   
                }else{
                    aux=aux.izquierda;
                }
            }
            
            if(n.llave<n.padre.llave){
                n.padre.izquierda=n; 
            }else{
                n.padre.derecha=n;
            }
        }
        
    }
    
    public void recorrerinorden(Nodo n){
        if(n!=null){
            recorrerinorden(n.izquierda);
            System.out.println("Indice "+n.llave+"\n Nombre: "+n.contenido+"\n Genero: "+n.nombre+"\n");
            recorrerinorden(n.derecha);
        }
    }
    
    
    
    public class Nodo{
        public Nodo padre;
        public Nodo derecha;
        public Nodo izquierda;
        public int llave;
        public String contenido;
        public String nombre;
        
        
        public Nodo(int indice){
            llave=indice;
            derecha=null;
            izquierda=null;
            padre=null;
            contenido=null;
            
        }
    }
    
}
