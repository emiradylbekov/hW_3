public class Main {
    public static void main(String[] args) {
        double[] numbers = {2.2, 5.4, -8.3, 4.8, -3.8, 1.1, 7.9, -6.3, 4.8, 2.1, -4.4, 6.3, -4.1, 8.4, 5.4};

        boolean firstNegative = false;

        double sum = 0;

        int count = 0;

        for (double n : numbers) {
            if (n < 0) {
                firstNegative = true;

            } else if (firstNegative && n > 0) {
                count++;
                sum += n;
            }
        }
        System.out.println(sum / count);
    }
}