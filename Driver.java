import java.util.*;

/**
 * The driver class used to test functionality of the Linked list.
 */
public class Driver
{
    public static void main(String[] args)
    {
        OptimizedLog<String> log = new OptimizedLog<>();
        log.add("Hello world!");
        log.add("Another entry...");
        log.add("SPAM...");
        log.add("SPAM...");
        log.add("SPAM...");
        System.out.println(log);

    }
}