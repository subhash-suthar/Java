public class CarsAssemble {
    public double productionRatePerHour(int speed) {
        double percentage;
        if(speed <= 4){
            return (speed * 221);
        } else if (speed > 4 && speed <= 8){
            percentage = (double) ((speed * 221) * 10) / 100;
            return (speed * 221) - percentage;
        } else if (speed == 9){
            percentage = (double) ((speed * 221) * 20 )/ 100;
            return ((speed * 221) - percentage);
        } else if (speed == 10){
            percentage = (double) ((speed * 221) * 23 )/ 100;
            return (double) ((speed * 221) - percentage);
        } else
            return 0;
    }

    public int workingItemsPerMinute(int speed) {
        double amountPerHour = productionRatePerHour(speed);
        return (int) (amountPerHour/60);
    }

    public static void main (String[] args) {
        CarsAssemble c = new CarsAssemble();
        System.out.println(c.productionRatePerHour(9));
        System.out.println(c.workingItemsPerMinute(9));
    }
}
