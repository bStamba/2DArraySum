//B Stamba 7-30-2023 Working with two-dimensional arrays.
public class Main {
    public static void main(String[] args) {

        //Variables for our sum, counter if we want to count our elements, and the 2d array itself.
        int[][] numArray = {{1, 3, 5, 7},
                            {2, 4, 6, 12},
                            {12, 17, 19, 22, 24},
                            {24, 28, 30, 34, 37, 39},
                            {45, 47, 51, 72, 15}};

        int[][] numArrayTwo = {{7, 19, 2, 5},
                               {14, 3, 9, 6},
                               {25, 17, 18, 14},
                               {29, 28, 1, 4, 7, 5},
                               {17, 14, 13, 12}};

        ArrayWork work = new ArrayWork();

        //Check the sum, and the difference of our first array.
        System.out.println("First Array");
        System.out.println("-----------");
        work.sumTwoDArray(numArray);
        work.subtractTwoDArray(numArray);
        work.multiplyTwoDArray(numArray);
        System.out.println("");

        //Check the sum, and the difference of our second array.
        System.out.println("Second Array");
        System.out.println("------------");
        work.sumTwoDArray(numArrayTwo);
        work.subtractTwoDArray(numArrayTwo);
        work.multiplyTwoDArray(numArrayTwo);
    }
}