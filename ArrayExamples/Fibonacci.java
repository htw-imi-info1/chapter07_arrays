
public class Fibonacci
{
    public int[] fibonacciSequence(int howMany){
        int[] fib = new int[howMany];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < howMany; i++){
            //fib[2] = fib[0]+fib[1];
            //fib[3] = fib[1]+fib[2];
            fib[i] = fib[i-2]+fib[i-1];
        }
        return fib;
    }
    public void print(int howMany){
        int[] fib = fibonacciSequence(howMany);
        for(int i = 0; i < fib.length; i++){
            System.out.print(fib[i]);
            System.out.print(", ");
        }
    }

}
