public class RaceTrack {
    private int distance;

    public RaceTrack(int distance){
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        for (int i = 1 ; i <= distance; i++){
            car.drive();
        }
        if(!(car.batteryDrained())){
            return true;
        }
        return false;
    }
}
