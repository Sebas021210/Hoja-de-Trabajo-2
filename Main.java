/********************************************************************
@File Main.java 
@Autor: Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 19/02/2022
Driver program que servira como controlador e implementa el menú 
de opciones para la calculadora. 
********************************************************************/

import java.io.File;
import java.util.Scanner;

public class Main 
{
    static String line;
    
    public static void main(String[] args) throws Exception
    {
        Vista vista = new Vista();
        Pila pila = new Pila();
        vista.bienvenida();
        int opcion = 0;

        while (opcion != 2)
        {
            opcion = vista.MenuOpciones();

            if (opcion == 1)
            {
                line = vista.LeerArchivo("");
                pila.Evaluate(line);
                System.out.println("El resultado es: " + pila.resultado);
            }

            else if (opcion == 2)
            {
                //Salir
		vista.despedida();
            }

            else
            {
                vista.opcionInvalida();
            }
        }
    }

}
