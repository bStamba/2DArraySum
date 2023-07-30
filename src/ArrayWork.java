public class ArrayWork {
    private int total;
    private int counter;
    private int[][] ourTwoDArray;
    public void sumTwoDArray(int[][] twoDArray){
        total = 0;
        counter = 0;
        ourTwoDArray = twoDArray;
        for(int i = 0; i < ourTwoDArray.length; i++){
            for(int j = 0; j < ourTwoDArray[i].length; j++){
                total = total + ourTwoDArray[i][j];
                counter++;
            }
        }
        System.out.println("The sum of the " + counter + " elements from our arrays is: " + total);
    }

    public void subtractTwoDArray(int[][] twoDArray){
        total = 0;
        counter = 0;
        ourTwoDArray = twoDArray;
        for(int i = 0; i < ourTwoDArray.length; i++){
            for(int j = 0; j < ourTwoDArray[i].length; j++) {
                total = total - ourTwoDArray[i][j];
                counter++;
            }
        }
        System.out.println("Subtracting the " + counter + " elements of our arrays results in: " + total);
    }
}
