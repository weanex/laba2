package n4;

import java.util.List;
import java.util.ArrayList;

public class OddEvenSeparator {
    private List<Integer> evenNumbers;
    private List<Integer> oddNumbers;
    private List<Integer> numbers;
    
    public OddEvenSeparator() {
        numbers = new ArrayList<>(); 
        evenNumbers = new ArrayList<>();
        oddNumbers = new ArrayList<>();
    }
    
    public void addNumber(int number) {
        numbers.add(number); 
        if (number % 2 == 0) {
            evenNumbers.add(number);
        } else {
            oddNumbers.add(number);
        }
    }
    
    public void even() {
        System.out.println(evenNumbers);
    }
    
    public void odd() {
        System.out.println(oddNumbers);
    }
}