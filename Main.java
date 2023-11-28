/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//nos basamos en sus diapositivas, emi y erick me ayudaron. Soy sincera. lo tqm
public class Main
{
     public static void main(String[] args)
    {
       ListasDobles lista = new ListasDobles();
       lista.InsertarPrimerNodo("A");
       lista.InsertarAntesPrimerNodo("B");
       lista.InsertaFinal("C");  
       lista.BuscarN("B");
       lista.BuscarYAgregarNodo("B","U");
       lista.IntercambiarNodo("C", "F");
       lista.Imprimir();
       lista.BorrarPrimerNodo();
       lista.BorrarUltimo();
      
       
       
       System.out.println(lista);

}
}