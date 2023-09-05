public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
        int[] lastWeekCount = new int[] {};
        if(lastWeekCount.length == 0){
            int[] emptyArray = {0};
            return emptyArray;
        }
        return lastWeekCount;
    }

    public int getToday() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
        if(birdsPerDay.length == 0){
            return 0;
        }
        return(birdsPerDay[birdsPerDay.length - 1]);
    }

    public void incrementTodaysCount() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
        int lastIndex = birdsPerDay.length - 1;
        birdsPerDay[lastIndex] = birdsPerDay[lastIndex]+ 1;
    }

    public boolean hasDayWithoutBirds() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
        for(int a : birdsPerDay){
            return(a == 0);
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
        int sum =0;
        if(numberOfDays > birdsPerDay.length){
            for(int i= 0;i<birdsPerDay.length;i++){
                sum = sum + birdsPerDay[i];
            }
        } else{
            for(int x= 0;x<numberOfDays;x++){
                sum = sum + birdsPerDay[x];
            }
        }
        return sum;
    }

    public int getBusyDays() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
        int count = 0;
        for(int a=0;a<birdsPerDay.length;a++){
            if(birdsPerDay[a] >= 5){
                //System.out.println(a +" iteration & value is " + birdsPerDay[a]);
                count = count + 1;
            }
        }
        return count;
    }

    public static void main (String[] args) {
        BirdWatcher b = new BirdWatcher(new int[]{0, 5, 5, 5, 5, 5, 5});
        /*for(int i = 0; i<b.birdsPerDay.length;i++){
            System.out.println(b.birdsPerDay[i]);
        }
        int[] lastWeek = b.getLastWeek();
        for(int j = 0; j<lastWeek.length; j++) {
            System.out.println(lastWeek[j]);
        }
        System.out.println("Today:");
        System.out.println(b.getToday());*/
        System.out.println(b.getBusyDays());
        System.out.println(b.getCountForFirstDays(10));
    }
}
