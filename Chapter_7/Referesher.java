public class Referesher {

    public static int countPreviousAverage(int[] responseTimes) {
        if (responseTimes == null || responseTimes.length < 2) return 0;

        int count = 0;
        double sum = responseTimes[0];

        for (int i = 1; i < responseTimes.length; i++) {
            double average = sum / i;
            if (responseTimes[i] > average) {
                count++;
            }
            sum += responseTimes[i];
        }

        return count;
    }

    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        int result = countPreviousAverage(responseTimes);
        System.out.println("Count: " + result); //output 2
    }
}
