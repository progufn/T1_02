
/**
 * Mastery Test Week 3 Exercise 1. Thread 1.
 * - Swap two numbers.
 * 
 * @author (your name) 
 */
public class Exercise1
{
    public static int[] swap(int[] numbers)
    {
        int temp;
        
        // In the coming weeks, the lecturer will explain all of the code above. But for now here is an explanation:
        // 1. In the code above we have provided an integer array "numbers", containing two elements.
        // 2. In the code above we have also provided another integer variable called "temp".
        // In the space provided below, write code to swap the values in "numbers[0]" and "numbers[1]".
        // Do NOT initialise "numbers[0]" or "numbers[1]". Just write the three lines that swap the values.
        // Add your code BELOW this line. Do NOT change anything ABOVE this comment line.
        temp = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = temp;
        // Add your code ABOVE this line. Do NOT change anything BELOW this comment line.
        return numbers;
    }
}
