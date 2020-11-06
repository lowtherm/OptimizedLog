import java.util.*;

public class ListItem<E>
{
    private E data;
    private ListItem<E> next;
    private Date dateAdded;
    private int noOfEntries = 1;
    
    /**
     * Constructor of the class ListItem, creating a single list item with data and pointer to next element
     * @param data the data, that is stored in this list item
     * @param next a pointer to the next item in the list
     */
    public ListItem(E data , ListItem<E> next)
    {
        this.data = data;
        this.next = next;
        dateAdded = Calendar.getInstance().getTime();
    }
    

    /**
     * get method for data
     * @return the data
     */
    public E getData()
    {
        return data;
    }

    /**
     * A get method for the next ListItem
     * @return the next ListItem in the list
     */
    public ListItem<E> getNext()
    {
        return next;
    }

    /**
     * a get Method for Date
     * @return the date of the ListItem
     */
    public Date getDateAdded()
    {
        return dateAdded;
    }

    /**
     * Get method for noOfEntries
     * @return noOfEntries
     */
    public int getnoOfEntries()
    {
        return noOfEntries;
    }

    /**
     * set method for data
     * @param data set it with the daa of the ListItem
     */
    public void setData(E newData)
    {
        data = newData;
    }

    /**
    * A set method for the next ListItem
    * @param next set the param with the next ListItem
    */
    public void setNext(ListItem<E> newNext)
    {
        next = newNext;
    }

    /**
     * set method for the noOfEntries, incrementing it by 1
     */
    public void changenoOfEntries(int numToChangeBy)
    {
        noOfEntries = noOfEntries + numToChangeBy;
    }
}