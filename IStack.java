/**********************************************************************
@File IStack.java
@Autor: Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 19/02/2022
Interfaz para realizar acciones en una lista.
**********************************************************************/

public interface IStack<T>
{
    void push(T value);
	
    T pull();
	
    T peek();
	
    int count();
	
    boolean isEmpty();
}
