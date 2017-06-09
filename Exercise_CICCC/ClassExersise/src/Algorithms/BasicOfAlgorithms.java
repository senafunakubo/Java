package Algorithms;

/**
 * Created by senafunakubo on 2017-06-08.
 */

//What are Algorithms?
// Steps you take to manipulate data
// Data structures: The way data is arranged in memory
// Main data structure operations: Inserting , Deleting , Searching

//Linear Search
// Look at every single indexed value in the entire array and
// how this would work would be if you wanted to find a number of values inside of this.
// if you wanna find one match then binary search is gonna work better.


public class BasicOfAlgorithms {

//    String[][][] arrayName = {{{"101"},{"102"},{"103"}},{{"201"},{"202"},{"203"}},{{"301"},{"302"},{"303"}}};
//    [How many down(3)] [How many across(4)] [How many of those groups(1)]]

    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void generateRandomArray(){
        for(int i =0; i< arraySize; i++){
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }

    public void printArray(){
        for (int i =0;i<arraySize; i++){
            System.out.print("|"+ i +"|");
            System.out.println(theArray[i] + "|");
        }
    }

    public int getValueAtIndex(int index){
        if(index<arraySize){
            return theArray[index];
        }
        return 0;
    }

    public boolean doesArrayContainThisValue(int searchValue){

        boolean valueInArray = false;

        for(int i=0; i<arraySize; i++){
            if(theArray[i] == searchValue){
                valueInArray = true;
            }
        }
        return valueInArray;
    }

    public void deleteIndex(int index){

        if(index < arraySize){
            for(int i = index; i< (arraySize -1); i++){
                theArray[i] = theArray[i+1];
            }
        }
        arraySize--;
    }

    public void insertValue(int value){
        if(arraySize<50){

            theArray[arraySize] = value;

            arraySize++;
        }
    }

    public String linearSearchforValue(int value){

        boolean valueInArray = false;

        String indexWithValue = "";

        System.out.print("17 was found in the following index: ");

        for (int i =0; i<arraySize; i++){

            if(theArray[i] == value){

                valueInArray = true;

                System.out.print(i + " ");

                indexWithValue = i + " ";

            }
        }

        if(!valueInArray){
            indexWithValue = "None";
            System.out.println(indexWithValue);
        }
        System.out.println();

        return  indexWithValue;
    }

 public static void main(String[] args){
     BasicOfAlgorithms newArray = new BasicOfAlgorithms();

     newArray.generateRandomArray();
     newArray.printArray();
     System.out.println("\nIndex 3 is " + newArray.getValueAtIndex(3) + ".\n");
     System.out.println("Number 18 is contained? : " + newArray.doesArrayContainThisValue(18));

     System.out.println("\n\nI deleted index 4.\n");
     newArray.deleteIndex(4);
     newArray.printArray();

     System.out.println("\n\nI inserted 55 to the array.\n");
     newArray.insertValue(55);
     newArray.printArray();

     System.out.println("\n");
     newArray.linearSearchforValue(17);
 }

}
