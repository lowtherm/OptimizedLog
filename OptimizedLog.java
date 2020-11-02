import java.util.*;

public class OptimizedLog<E> implements Collection<E>
{
    private int size;
 
    
    /**
     * Used to return the number of elements in the data structure to the user
     * @return the size variable.
     */
    @Override
    public int size()
    {
        return size;
    }

    /**
     * Used to show whether the data structure is empty or not.
     * @return True if the data structure is empty, false otherwise.
     */
    @Override
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

    /**
     * Adds an element to the data structure.
     * 
     * @param arg0 element to be added to the data structure.
     * @return true if the element was added, false if not.
     */
    @Override
    public boolean add(E arg0) 
    {
        // TODO Auto-generated method stub
        return false;
    }


    /** 
     * Adds all elements specified to the data structure.
     * 
     * @param arg0 The collection of items to be added to the data structure.
     * @return true if the items were added, false otherwise.
     */
    @Override
    public boolean addAll(Collection<? extends E> arg0) 
    {
        // TODO Auto-generated method stub
        return false;
    }


    /**
     * Empties the data structure of all elements.
     * 
     */
    @Override
    public void clear() 
    {
        // TODO Auto-generated method stub

    }


    /**
     * Checks if an object is contained within the data structure.
     * 
     * @param arg0 The object that we are looking to find.
     * @return true if the object is contained within the data structure, false otherwise.
     */
    @Override
    public boolean contains(Object arg0) 
    {
        // TODO Auto-generated method stub
        return false;
    }


    /**
     * Checks if a collection of objects are contained within the data structure.
     * 
     * @param arg0 The collection of objects we are looking for.
     * @return True if the objects are contained in the data structure, false otherwise.
     */
    @Override
    public boolean containsAll(Collection<?> arg0) 
    {
        // TODO Auto-generated method stub
        return false;
    }


    /**
     * 
     */
    @Override
    public Iterator<E> iterator() 
    {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Removes the specified object from the data structure.
     * 
     * @param arg0 The object to be removed.
     * @return True if the object is removed, false otherwise.
     */
    @Override
    public boolean remove(Object arg0)
    {
        // TODO Auto-generated method stub
        return false;
    }


    /**
     * Removes a collection of objects from the data structure.
     * 
     * @param arg0 The collection of objects to be removed.
     * @return True if they are removed from the data structure, false otherwise.
     */
    @Override
    public boolean removeAll(Collection<?> arg0) 
    {
        // TODO Auto-generated method stub
        return false;
    }


    /**
     * Removed every element from the data structure except those specified in the colleciton.
     * 
     * @param arg0 A collection of elements in the data structure that the user wishes to preserve.
     * @return True if done succesfully, false otherwise.
     */
    @Override
    public boolean retainAll(Collection<?> arg0) 
    {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * Returns an array of all elements in the data structure, in order.
     * 
     * @return An array of objects which are the same as those contained within the list.
     */
    @Override
    public Object[] toArray() 
    {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Used to store the elements of the data structure into the arg0 array if it is big enough.
     * If it is not big enough then a new array of the same type will be created using the size of the data structure.
     * 
     * @param arg0 An empty array for the method to fill.
     * @return arg0 The initial array is returned but filled with the elements of the data structure.
     */
    @Override
    public <T> T[] toArray(T[] arg0) 
    {
        // TODO Auto-generated method stub
        return null;
    }



}