package listasimpleeliminación.entidad;

public class ListaUniEnlazada {
    private Nodo ptr;
    
    public void insertarFinal(int x) {
        Nodo nuevo = new Nodo(x); //Creamos el nodo nuevo a insertar
        if (ptr == null) { //Comprobamos si la lista esta vacía (ptr = null).
            ptr = nuevo; //Si la lista esta vacía insertamos el nodo como el puntero.
        } else {
            Nodo actual = ptr; //Si no esta vacía creamos un nodo auxiliar para recorrer la lista.
            while(actual.siguiente != null) { //Recorremos hasta ubicarnos en el ultimo nodo (actual.siguiente = null).
                actual = actual.siguiente; //El nodo actual pasa a ser actual.siguiente para ir recorriendo la lista.
            }
            actual.siguiente = nuevo; //Ubicamos el nuevo nodo como el siguiente al nodo que antes era el ultimo.
        }
    }
    
    public void eliminarNodo(int x) {
        if (ptr != null) { //Evaluamos si la lista esta vacía (ptr = null), en caso de estarlo el metodo no hace nada.
            if (ptr.info == x) { //Evaluamos el caso en el que el nodo puntero obtiene la información que queremos eliminar.
                ptr = ptr.siguiente; //Se elimina el puntero remplazandolo por el nodo siguiente (sea null u otro nodo).
            } else {
                Nodo anterior = ptr; //Si no se encontro el valor en el nodo puntero iniciamos una variable auxiliar para recorrer la lista de nodo en nodo.
                while(anterior.siguiente != null) { //Empezamos el ciclo mientras que no hayan mas nodos que evaluar (no hay mas nodos que evaluar cuando anterior.siguiente == null).
                    if (anterior.siguiente.info == x) { //Si el nodo anterior.siguiente, es decir el actual siendo evaluado tiene la información que queremos entonces debemos borrarlo.
                        anterior.siguiente = anterior.siguiente.siguiente; //Se borra haciendo un enlace que lo salta, el garbage collector se encarga de eliminarlo de memoria.
                        return; //Retornamos para evitar iteraciones innecesarias (ya se borro el nodo que queriamos cancelar).
                    }
                    anterior = anterior.siguiente; //El nodo anterior pasa a ser el siguiente nodo a anterior para ir recorriendo uno a uno todos los nodos de la lista.
                }
            }
        }
    }
    
    public void imprimirLista() {
        if (ptr == null) { //Evalua si la lista esta vacia (ptr = null).
            System.out.println("La lista esta vacia."); //Si la lista esta vacia simplemente imprime un mensaje indicandolo.
        } else {
            String cadena = ""; //Si la lista tiene uno o mas nodos entonces inicializa una cadena de texto vacía.
            Nodo actual = ptr; //Creamos un nodo auxiliar para recorrer la lista de siguiente en siguiente
            while (actual != null) { //Hacemos un ciclo mientras que el nodo actual no sea null (es decir que actual este fuera de la lista).
                cadena += actual.info + " -> "; //Concatenamos la información del nodo actual + una flecha a la cadena base.
                actual = actual.siguiente; //Movemos el actual para que sea el siguiente del actual.
            }
            System.out.println(cadena + "null"); //Al acabar el ciclo ya habremos registrado la información de todos los nodos en cadena, por lo que la imprimimos y concatenamos "null" para terminar con la visualización de la lista.
        }
    }
}
