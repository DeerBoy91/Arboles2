
package proyecto_3;

public class Estructuras {
    
    public static void main(String[] args){
        Arbol arbol = new Arbol();
        arbol.insertar(1,"Vik","M");
        arbol.insertar(8,"Andres","M");
        arbol.insertar(2,"Juana","F");
        arbol.insertar(6,"Karen","F");
        arbol.insertar(12,"Amelie","F");
        
        arbol.recorrerinorden(arbol.raiz);
        
    }
    
}
