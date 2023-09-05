public class ElonsToyCar {
    private int battery;
    private int metersDriven;

    public  ElonsToyCar () {
       this.battery = 100;
       this.metersDriven = 0;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return ("Driven " + metersDriven + " meters");
    }

    public String batteryDisplay() {
        if (battery ==0){
            return "Battery empty";
        }
        return ("Battery at " + battery + "%");
    }

    public void drive() {
        if (battery > 0){
            metersDriven = metersDriven + 20;
            battery = battery - 1;
        }
        batteryDisplay();
    }

    public static void main (String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());

        for (int i = 0; i < 23; i++) {
            car.drive();
        }

        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());

        car.drive();

        ElonsToyCar car1 = ElonsToyCar.buy();
        System.out.println(car1.distanceDisplay());
        System.out.println(car1.batteryDisplay());

        car1.drive();

        System.out.println(car1.distanceDisplay());
        System.out.println(car1.batteryDisplay());
    }
}
