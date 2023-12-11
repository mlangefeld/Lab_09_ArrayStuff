import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int total = 0;
        int intVal = 0;
        int average = 0;
        int favNum = 0;
        int counter = 0;
        boolean finished = false;
        int[] dataPoints = new int[100];
        int git;


        for (intVal = 0; intVal < dataPoints.length; intVal++){
            dataPoints[intVal] = random.nextInt(100) + 1;

        }

        for (intVal = 0; intVal < dataPoints.length; intVal++){
            System.out.print(dataPoints[intVal] + " | ");

        }

        for (intVal = 0; intVal < dataPoints.length; intVal++){
            total = total + dataPoints[intVal] ;
            average = total / dataPoints.length;

        }

        System.out.println("\nThe total of all of the values is " + total);
        System.out.println("The average of all of the values is " + average);




        favNum = SafeInput.getRangedInt(in, "\nEnter a number within these values", 1, 100);

        for (intVal = 1; intVal < dataPoints.length; intVal++){

            if (dataPoints[intVal] == favNum){

                counter = counter + 1;

            }

        }
        System.out.println("Your number was found " + counter + " time(s)");

        counter = 0;

        favNum = SafeInput.getRangedInt(in, "\nEnter a number within these values again", 1, 100);

        for (intVal = 1; intVal < dataPoints.length; intVal++){

            if (dataPoints[intVal] == favNum){

                System.out.println("Your number was found in position " + intVal);

                finished = true;

                break;

            }

        } if (!finished){

            System.out.println("Your number, " + favNum + ", was not found within the array");

        }

        int min = dataPoints[0];
        int max = dataPoints[0];


        for (intVal = 0; intVal < dataPoints.length; intVal++){

            if (dataPoints[intVal] > max){

                max = dataPoints[intVal];

            }

            if (dataPoints[intVal] < min){

                min = dataPoints[intVal];

            }
        }

        System.out.println("\nThe minimum value in the array is " + min);
        System.out.println("The maximum value in the array is " + max);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

    }


    public static double getAverage(int dataPoints[]){
        int intVal;
        double counter = 0;
        double total = 0;
        double average = 0;

        for (intVal = 0; intVal < dataPoints.length; intVal++){

            counter = counter + 1;

            total = total + dataPoints[intVal];

        }

        average = total / counter;
        return average;

    }


}

