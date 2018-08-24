public class FibonacciIterative implements Fibonacci {
	public int fibonacci(int n) {
		if (n == 1 || n == 2) {
		    return 1;
        }
        else {
		    int result = 1;
		    int previous = 1;
		    int temp;
		    for (int i = 3; i <= n; i++) {
		        temp = result;
		        result += previous;
		        previous = temp;
            }
            return result;
        }
	}
}