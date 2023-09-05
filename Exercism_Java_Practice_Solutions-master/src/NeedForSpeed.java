public class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distance;
    private int battery = 50;

    public NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return (battery > 0);
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if(battery > 0) {
            distance = distance + speed;
            battery = battery - batteryDrain;
            System.out.println(battery);
            System.out.println(distance);
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public static void main (String[] args) {
        int speed = 5;
        int batteryDrain = 50;
        var car = new NeedForSpeed(speed, batteryDrain);

        int distance = 10;
        var race = new RaceTrack(distance);

        System.out.println(car.distanceDriven());
        System.out.println(race.tryFinishTrack(car));
        System.out.println(car.distanceDriven());
    }
}


