package phantomstyle.test.classes;


public class Factorial {

    public long factorial(int number) {
        if (number < 0)
            throw new IllegalArgumentException();

        long result = 1;
        if (number > 1) {
            for (int i = 1; i <= number; i++)
                result *= i;
        }

        if (number == 0) {
            return 1;
        }
        return result;
    }
}
