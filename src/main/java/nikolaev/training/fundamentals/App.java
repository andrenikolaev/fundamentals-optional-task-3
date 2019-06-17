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
        int num =0;
        System.out.print("Input a number: ");

        num = in.nextInt();

        while (num>12 || num<1){
            System.out.print("Your number is not correct! \nInput a number: ");
            num = in.nextInt();
        }

        in.close();

    }
}
