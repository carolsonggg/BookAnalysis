/**
 * A word and its frequency in a book.
 * 
 * Note to students:  you need to add code as well methods to the
 *                    class to complete the project.
 * 
 * @author  Susan King
 *          Carol Song
 * @version March 4, 2016
 */
public class Word implements Comparable
{
    // instance variables 
    private String word;  
    private int frequency;  // how often word appears in a text file

    /**
     * Constructor for objects of class Word.
     * 
     * @param text the string of characters of the word
     */
    public Word(String text)
    {
        // initialise frequency to 1 because the text has
        // appeared the first time in the file
        word = text;
        frequency = 1;
    }

    /**
     * The "word" has already appeared in the file, so 1 is 
     * added to frequency since it as appeared again.
     */
    public void addOne( )
    {
        frequency++;
    }

    /**
     * Retrieve the frequency of the word.
     * 
     * @return the frequency of the current Word object
     */
    public int getFrequency( )
    {
        return frequency;
    }

    /**
     * Retrieve the text string word.
     * 
     * @return the text of the current Word object
     */
    public String getWord( )
    {
        return word;
    }

    /**
     * Compare lexicalgraphically this current Word object and 
     * the Word obj.  
     * 
     * @param obj  the object to compare the current Word object to
     * 
     * @return   0 if this current Word object's word has equal to obj's word;
     *         < 0 if this current Word object's word comes earlier
     *             in the alphabet than obj's word;
     *         > 0 if this current Word object's word comes later 
     *             in the alphabet that obj's word
     */
    public int compareTo(Object obj )
    {
        Word compare = (Word) obj;
        return word.compareTo(compare.getWord());
    }

    /**
     * Compare this current Word object's frequency and 
     * the Word obj's frequency.  
     * 
     * @param obj  the object to compare the current Word object to
     * 
     * @return   0 if this current Word object's frequency is equal to obj's frequency;
     *         < 0 if this current Word object's frequency is less than
     *             obj's frequency;
     *         > 0 if this current Word object's frequency is greater than
     *             obj's frequency;
     */             
    public int compareFrequencyTo(Object obj )
    {
        Word compare = (Word) obj;
        return frequency-compare.getFrequency();
    }

    /**
     * Return the text of the word and its frequency as a String.
     * 
     * @return text and frequency
     */
    public String toString( )
    {
        return String.format("%-15s %6d", word, frequency);
    }

}