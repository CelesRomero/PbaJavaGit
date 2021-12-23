package ProbandoParaGit.principal;

import ProbandoParaGit.entidades.Auto1;
import ProbandoParaGit.servicios.Auto1Servicio;

public class PruebaGit1 {

    public static void main(String[] args) {

        Auto1Servicio auto1Servicio = new Auto1Servicio();

        Auto1 a = auto1Servicio.crearAuto1();

        auto1Servicio.agregarAuto(a);

        auto1Servicio.mostrarAutos();

    }

}
