import java.util.*;

public class ListIterator<E> implements Iterator<E>
{
    private ListItem<E> item;

    /**
     * This is the constructor for ListIterator which creates a new iterator starting at the start of the list provided.
     * @param log
     */
    public ListIterator(OptimizedLog<E> log)
    {
        item = log.GetFirstItem();
    }

    /**
     * Returns if the list has another item in it.
     * @return True if there is another item in the list to output, false if not.
     */
    @Override
    public boolean hasNext() {
        if (item != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * This returns the next item in the list and changes the item to the next item in the list as it will be the next one to be output.
     * @return the data in the item. 
     */
    @Override
    public E next() {
        E nextItem = item.GetData();
        item = item.GetNext();
        
        return nextItem;
    }
}
