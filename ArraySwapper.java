import java.util.Arrays;

class Main {
  
  // This method assumes you only have 2 items in your array
  public void arraySwap(int[] inputArray) {

    // put your code here
    
    int indexOne = inputArray[1];
    int indexZero = inputArray[0];
    inputArray[0] = indexOne;
    inputArray[1] = indexZero;
  }
  
  // This method swaps any 2 items in any array
  public void arraySwapAny2(int []inputArray, int loc1, int loc2) {
    
    if ((loc1 > inputArray.length || loc2 > inputArray.length) || (loc1 < 0 || loc2 < 0)){
      System.out.println("no dice, dawg");
    }
    else {
      int indLoc1 = inputArray[loc1];
      int indLoc2 = inputArray[loc2];
      inputArray[loc2] = indLoc1;
      inputArray[loc1] = indLoc2;
    }
  }
  
  public static void main(String[] args) {

    ArraySwapper testSwapper = new ArraySwapper();
    
    // ***** Test the first swap method *******
    System.out.println("*** Trying first method ***");
    int[] exampleInput = {1, 2};
    int[] exampleOutput = {2, 1};
    System.out.println("exampleInput before: " + Arrays.toString(exampleInput));    
    System.out.println("exampleOutput: " + Arrays.toString(exampleInput));    
    
    // This calls the first swap method
    testSwapper.arraySwap(exampleInput);
    System.out.println("exampleInput after: " + Arrays.toString(exampleInput));    
    
    if (java.util.Arrays.equals(exampleInput, exampleOutput)) {
      System.out.println("arraySwap succeeded");
    } else {
      System.out.println("arraySwap failed!");
    }
    
    // ***** Test the second swap method *******
    System.out.println("\n*** Trying second method ***");
    exampleInput = new int[]{1, 22, 333, 4444};
    exampleOutput = new int[]{1, 333, 22, 4444};
    System.out.println("exampleInput before: " + Arrays.toString(exampleInput));    
    System.out.println("exampleOutput: " + Arrays.toString(exampleOutput));    
    
    // This calls the second swap method
    testSwapper.arraySwapAny2(exampleInput, 1, 2);
    System.out.println("exampleInput after: " + Arrays.toString(exampleInput));    
    
    if (java.util.Arrays.equals(exampleInput, exampleOutput)) {
      System.out.println("arraySwapAny2 succeeded");
    } else {
      System.out.println("arraySwapAny2 failed!");
    }
  }
}
