// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Variables for our sum, counter if we want to count our elements, and the 2d array itself.
        int sum = 0;
        int counter = 0;
        int[][] numArray = {{1, 3, 5, 7},
                            {2, 4, 6},
                            {12, 17, 19, 22, 24},
                            {24, 28, 30, 34, 37, 39},
                            {45, 47, 51, 72, 15}};

        System.out.println("");
        System.out.println("Sum starting value is: " + sum);
        System.out.println("------------------------");

        //Nested for loop that loops through our rows (i), and sum's each column of our array (j).
        for(int i = 0; i < numArray.length; i++){
            for(int j = 0; j < numArray[i].length; j++){
                sum = sum + numArray[i][j];
                counter++;
                System.out.println("+ " + numArray[i][j] + " results in: " + sum);
            }
        }
        System.out.println("");
        System.out.println("The sum of the values of " + counter + " elements in our 2D array is: " + sum);
    }
}