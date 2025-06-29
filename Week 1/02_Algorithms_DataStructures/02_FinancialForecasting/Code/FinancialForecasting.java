public class FinancialForecasting {

    public static double futureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return (1 + growthRate) * futureValue(presentValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 10000;
        double growthRate = 0.05;
        int years = 10;

        double result = futureValue(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years: %.2f", years, result);
    }
}