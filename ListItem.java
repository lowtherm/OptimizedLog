import java.util.*;

public class ListItem<E>
{
    private E data;
    private ListItem<E> next;
    private Date dateAdded;
    private int noOfEntries = 1;
    private Date recentDate;
    
    /**
     * This is the constructor for ListItem which creates a new list item using parameters provided and the current time when it is added.
     * @param data The piece of data the user wishes for this item to contain.
     * @param next The next pointer of the item, since we are adding items to the end of the list this will almost always be null.
     */
    public ListItem(E data , ListItem<E> next)
    {
        this.data = data;
        this.next = next;
        dateAdded = Calendar.getInstance().getTime();
        recentDate = dateAdded;
    }
    

    /**
     * This gets the data stored in this specific list item.
     * @return the data stored in the list item.
     */
    public E GetData()
    {
        return data;
    }

    /**
     * This returns the next pointer for this list item.
     * @return the pointer to the next item in the list for this item.
     */
    public ListItem<E> GetNext()
    {
        return next;
    }

   
    /**
     * This returns the date this piece of data was added to the list, used for the output.
     * @return the date the item was added to the list.
     */
    public Date GetDateAdded()
    {
        return dateAdded;
    }

    /**
     * This will return the most recent date that an item with this name was added to the list. Used for if the same item is added twice. 
     * @return the most recent date at which an item with this name was entered.
     */
    public Date GetRecentDate()
    {
       return recentDate;
    }

    /**
     * This returns the number of entries for the item specified.
     * @return number of entries for this item.
     */
    public int GetnoOfEntries()
    {
        return noOfEntries;
    }

    /**
     * This sets the data for this item to be the newData.
     * @param newData the new value of the data stored in this item.
     */
    public void SetData(E newData)
    {
        data = newData;
    }

    /**
     * This just sets the recent date to be the current time.
     * Used when the user attempt to add an item with the same data. 
     */
    public void SetRecentDate()
    {
        recentDate = Calendar.getInstance().getTime();
    }

    /**
     * This sets the next pointer of the item in the list to the parameter.
     * @param newNext the new next pointer of the item.
     */
    public void SetNext(ListItem<E> newNext)
    {
        next = newNext;
    }

    /**
     * This update the number of times the user has entered a specific piece of data.
     * This also updates the recent date since we added the same item for another time.
     * @param numToChangeBy This is the number by which to increment the noOfEntries, usually just one.
     */
    public void ChangenoOfEntries(int numToChangeBy)
    {
        noOfEntries = noOfEntries + numToChangeBy;
        SetRecentDate();
    }
}