public class Fibonacci
{
    public static void main(String[] args)
    {
        System.out.println(fib(8));    
    }

    public static long fib(int N)
    {
        switch (N)
        {
            case 0: return 0;

            case 1: return 1;

            default:
                    long prev = 0;
                    long curr = 1;
                    long next;
                    while(N-1 > 0)
                    {
                        next = prev + curr;
                        prev = curr;
                        curr = next;
                    N --;
                    }
                    return curr;
        }
    }
}
