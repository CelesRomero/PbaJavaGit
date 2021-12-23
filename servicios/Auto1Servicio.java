package ProbandoParaGit.servicios;

import ProbandoParaGit.entidades.Auto1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author celes
 */
public class Auto1Servicio {

   
    private ArrayList auto1;

    public Auto1Servicio() {

       
        auto1 = new ArrayList();
    }

    public Auto1 crearAuto1() {

        Auto1 aut = new Auto1();

        aut.setMarca("Volskwagen");
        aut.setModelo("Golf Variant");
        aut.setAnio(2017);

        return aut;

    }

    public void agregarAuto(Auto1 at) {

        auto1.add(at);

    }

    public void mostrarAutos(){
        
        for (Object aux : auto1){
            
            System.out.println(aux);
        }
     
        
       
      
        
        
        
    }
    
}
