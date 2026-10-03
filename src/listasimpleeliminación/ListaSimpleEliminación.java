/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasimpleeliminación;

import listasimpleeliminación.entidad.ListaUniEnlazada;

public class ListaSimpleEliminación {

    public static void main(String[] args) {
        ListaUniEnlazada lista = new ListaUniEnlazada();
        lista.insertarFinal(1);
        lista.insertarFinal(6);
        lista.insertarFinal(3);
        lista.insertarFinal(4);
        lista.insertarFinal(9);
        
        System.out.println("Lista antes de la eliminación: ");
        lista.imprimirLista();
        
        lista.eliminarNodo(3);
        
        System.out.println("Lista despues de eliminar el nodo con x=3: ");
        lista.imprimirLista();
    }
    
}
