package nikolaev.training.fundamentals;

import java.util.*;


/**
 * JAVA.FUNDAMENTALS
 * Optional Task 3
 * Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
 * Осуществить проверку корректности ввода чисел.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        int num;
        boolean correctNumber = false;

        while (!correctNumber){
            System.out.print("Input a number: ");
            num = in.nextInt();
            if (num>=1 && num<=12){
                System.out.println("Your number is correct: " + num);
                correctNumber = true;
            } else {
                System.out.println("Your number is not correct: " + num);
            }
        }

        in.close();

    }
}
