/**********************************************************************
@File Vista.java
@Autor: Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 19/02/2022
Programa que mostrará a los usuarios el menú de opciones para la
calculadora.
**********************************************************************/

import java.util.*;
import java.io.*;

public class Vista 
{
    //Propiedades
    String texto;
    private Scanner scan;
    Scanner entrada = new Scanner(System.in);
	
    //Métodos 
	
    //Constructor
    public Vista()
    {
        scan = new Scanner(System.in);
        texto = "";
    }

    public void bienvenida()
    {
        System.out.println("\nBienvendi@ a la calculadora de expresiones Postfix");
    }

    public int MenuOpciones()
    {
        int op;
        String s = "\nQue desea hacer?\n" +
                   "1. Realizar operacion\n" +
                   "2. Salir\n";
        System.out.println(s);
        op = scan.nextInt();

        return op;
    }
    
    public String LeerArchivo(String direccion)
    {
        try
        {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null)
            {
                temp = temp + bfRead;
            }
            
            texto = temp;
        }
        catch(Exception e)
        {
            System.err.println("No se encontro el archivo");
        }
        return texto;
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
