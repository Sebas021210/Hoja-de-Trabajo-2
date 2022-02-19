/**********************************************************************
@File Vista.java
@Autor: Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 19/02/2022
Programa que mostrará a los usuarios el menú de opciones para la
calculadora.
**********************************************************************/

import java.util.*;

public class Vista 
{
    //Propiedades
    private Scanner scan;
    Scanner entrada = new Scanner(System.in);
	
    //Métodos 
	
    //Constructor
    public Vista()
    {
        scan = new Scanner(System.in);
    }

    public void bienvenida()
    {
        System.out.println("\nBienvendi@ a la calculadora de expresiones Postfix");
    }

    public int MenuOpciones()
    {
        int op;
        String s = "\nQue desea hacer?\n" +
                   "1. Empezar programa\n" +
                   "2. Salir\n";
        System.out.println(s);
        op = scan.nextInt();

        return op;
    }

    public void opcionInvalida()
    {
            System.out.println("\nHa elegido una opcin invalida.\n");
    }

    
    public void despedida()
    {
            System.out.println("\nAdios, que tenga feliz dia!\n");
    }
}
