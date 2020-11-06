import java.util.*;

public class OptimizedLog<E> implements Collection<E>
{
    private int size;
    private ListItem<E> firstItem;
    private ListItem<E> lastItem;
    public boolean flag = false;

    /**
     * This is a method used to overwrite the to string method to provide an actual 
     * string of all items in the linked list instead of just an address.
     * @return It returns a string containing all elements of the list in the format required.
     */
    @Override
    public String toString() 
    {
        String dataToOutput = "";
        if(firstItem != null)
        {
            ListItem<E> toCheck = firstItem;
       
            while(toCheck != null)
            {
                if(toCheck.getnoOfEntries()>1)
                {
                    dataToOutput = dataToOutput + "\n" + "[" + toCheck.getDateAdded() + " - "
                    +toCheck.getRecentDate() +"][" +
                    toCheck.getnoOfEntries() + " TIMES]: "+ toCheck.getData();
                    toCheck = toCheck.getNext();
                }
                else
                {
                    dataToOutput = dataToOutput + "\n" + "[" + toCheck.getDateAdded()+ "]: " + toCheck.getData();
                    toCheck = toCheck.getNext();
                }
                     
            }
        }
        return (dataToOutput);
    }
 
    
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
    public boolean add(E newItem) 
    {
        if (newItem == null)
        { 
            throw new NullPointerException("Argument for this new item is null."); 
        }
        if (size() > 0) 
        {
            this.check(newItem);
            if(flag == false)
            {
                ListItem<E> prev = lastItem;
                lastItem = new ListItem<E>(newItem, null);
                prev.setNext(lastItem);
                size++;
                return true;
            }
            else
            {
             flag = false;
             return true;  
            }
            
        }
        else
        {
            lastItem = new ListItem<E>(newItem, null);
            firstItem = lastItem;
            size++;
            return true;
        }
    }

    /**
     * 
     * @param item The item that we are checking to see if it is already in the list.
     */
    public void check(E item)
        {
            ListItem<E> toCheck = firstItem;
            while(toCheck != null)
            {
                if (toCheck.getData() == item)
                {
                    toCheck.changenoOfEntries(1);
                    flag = true;
                }
                toCheck = toCheck.getNext();     
            }
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



    //**************************************************
    //***THE FOLLOWING ARE NOT REQUIRED FOR THE TASK.***
    //**************************************************



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
    * Method that is not used in this exercise
    */
    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Unable to contains");
    }



}