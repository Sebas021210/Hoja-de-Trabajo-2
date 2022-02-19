/**********************************************************************
@File Node.java
@Autor: Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 19/02/2022
Programa que tendrá las propiedades y métodos de la clase Node.
**********************************************************************/

public class Node<T> 
{
    private T Value;
    Node<T> next;
    /***
     * @param numero este pareametro ayuda a poder hacer una ecuacion 
     * @return 
     * Este metodo crea un nodo 
     */
    public Node() 
    {
        next = null;
    }
	
    public Node(T Value) 
    {
        this.Value = Value;
        next = null;
    }
	
    public T getValue() 
    {
        return Value;
    }
	
    public void setValue(T value) 
    {
        Value = value;
    }
	
    public Node<T> getNext() 
    {
        return next;
    }
	
    public void setNext(Node<T> next) 
    {
	this.next = next;
    }
}
