import java.util.stream.IntStream;

class Sample {    
  public static boolean isPrime(int number) {
    //if given the range of values between 2 and number,
    //no number in that range divides the numbers
    return 
      IntStream.range(2, number)
        .noneMatch(i -> number % i == 0);
  } 
  
  public static void main(String[] args) {
    for(int i = 1; i < 8; i++) {
      System.out.printf("isPrime(%d)? %b\n", i, isPrime(i));
    }
  }              
}
