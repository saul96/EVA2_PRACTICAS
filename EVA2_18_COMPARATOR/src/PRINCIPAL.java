
import java.util.Collections;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saul_
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList <String> llMiLista = new LinkedList();
        llMiLista.add("Holla");
        llMiLista.add(" ");
        llMiLista.add("MUNDO");
        llMiLista.add(" ");
        llMiLista.add("Cruel!!!!");
        llMiLista.add(" ");
        llMiLista.add("Collections");
        
        for (String llMiLista1 : llMiLista) {
            System.out.print(llMiLista1);
        }
        System.out.println("");
        Collections.sort(llMiLista);
        for (String LLmIlISTA1 : llMiLista) {
            System.out.println(LLmIlISTA1);
        }
    }
   
}
