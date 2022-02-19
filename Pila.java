/**********************************************************************
@File Pila.java
@Autor: Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 19/02/2022
Programa que tendrá las propiedades y métodos de la clase Pila.
**********************************************************************/

public class Pila implements IPosfixCalc
{
    StackNodes<Integer> StackN = new StackNodes<Integer>();
    public int resultado;
    
    public int Evaluate(String expresion) 
    {
        String data = expresion;
        String[] split = data.split(" ");
        for (int i=0; i<split.length; i++) 
        {
            switch(split[i]) 
            {
            case "+":
            	int a = StackN.pull();	
            	int b = StackN.pull();
            	int sum = (b + a);
            	StackN.push(sum);
            	break;
            case "-":
            	int c = StackN.pull();
            	int d = StackN.pull();
            	int res = (d - c);
            	StackN.push(res);
            	break;
            case "*": 	
            	int x = StackN.pull();
            	int y = StackN.pull();
            	int mult = (y * x);
            	StackN.push(mult);
            	i++;
            	break;
            case "/":
            	int w = StackN.pull();	
            	int z = StackN.pull();
            	int div = (z / w);
            	StackN.push(div);
            	break;         
            default: 
            	int s = Integer.valueOf((String) split[i]);
            	StackN.push(s);
            	break;
            }
        }
            if(StackN.count() == 1) 
            {
                resultado = (StackN.pull());
            }
    return resultado;
    }
}
