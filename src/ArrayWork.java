public class ArrayWork {

    private int total;
    private int counter;
    private int[][] ourTwoDArray;

    //Method that takes in an integer two-dimensional array and
    //gets the sum of the values of the elements in that array.
    public void sumTwoDArray(int[][] twoDArray){
        ourTwoDArray = twoDArray;
        total = 0;
        counter = 0;

        for(int i = 0; i < ourTwoDArray.length; i++){
            for(int j = 0; j < ourTwoDArray[i].length; j++){
                total = total + ourTwoDArray[i][j];
                counter++;
            }
        }
        System.out.println("The sum of the " + counter + " elements from our arrays is: " + total);
    }

    //Method that takes in an integer two-dimensional array and
    //subtracts the values of the elements in it.
    public void subtractTwoDArray(int[][] twoDArray){
        ourTwoDArray = twoDArray;
        total = 0;
        counter = 0;

        for(int i = 0; i < ourTwoDArray.length; i++){
            for(int j = 0; j < ourTwoDArray[i].length; j++) {
                total = total - ourTwoDArray[i][j];
                counter++;
            }
        }
        System.out.println("Subtracting the " + counter + " elements of our arrays results in: " + total);
    }

    //Method that takes in an integer two-dimensional array and
    //uses the first element [0, 0] as a starting point to multiply
    //all of the values of the elements our array.
    public void multiplyTwoDArray(int[][] twoDArray){
        ourTwoDArray = twoDArray;
        long multiplyTotal = ourTwoDArray[0][0];
        counter = 0;

        for(int i = 0; i < ourTwoDArray.length; i++){
            for(int j = 0; j < ourTwoDArray[i].length; j++){
                if(i == 0 && j == 0){
                    counter++;
                }
                else{
                    multiplyTotal = (multiplyTotal * ourTwoDArray[i][j]);
                    counter++;
                }
            }
        }
        System.out.println("Multiplying the " + counter + " elements of our array results in: " + multiplyTotal);
    }
}
