//B Stamba 7-30-2023 Working with two-dimensional arrays.
public class Main {
    public static void main(String[] args) {

        //Variables for our sum, counter if we want to count our elements, and the 2d array itself.
        int[][] numArray = {{1, 3, 5, 7},
                            {2, 4, 6, 12},
                            {12, 17, 19, 22, 24}};

        int[][] numArrayTwo = {{7, 19, 2, 5},
                               {14, 3, 9, 6},
                               {15, 17, 18, 14},
                               {17, 14, 13, 12}};

        int[][]numArrayThree = {{-1, 2, 3, 4},
                                {5, 6, 7, 8, 9, 10}};


        ArrayWork work = new ArrayWork();

        //Check the sum, difference, and multiplication of our first array.
        System.out.println("First Array");
        System.out.println("-----------");
        work.sumTwoDArray(numArray);
        work.subtractTwoDArray(numArray);
        work.multiplyTwoDArray(numArray);
        System.out.println("");

        //Check the sum, difference, and multiplication of our second array.
        System.out.println("Second Array");
        System.out.println("------------");
        work.sumTwoDArray(numArrayTwo);
        work.subtractTwoDArray(numArrayTwo);
        work.multiplyTwoDArray(numArrayTwo);
        System.out.println("");

        //Check the sum, difference, and multiplication of our third array.
        System.out.println("Third Array");
        System.out.println("------------");
        work.sumTwoDArray(numArrayThree);
        work.subtractTwoDArray(numArrayThree);
        work.multiplyTwoDArray(numArrayThree);
    }
}