import java.util.*;

public class OptimizedLog<E> implements Collection<E>
{
    private int size;
 

    public int size()
    {
        return size;
    }

     public boolean isEmpty()
    {
        if (size == 0)
        {
         return true;   
        }
        else
        {
         return false;   
        }
    }



}