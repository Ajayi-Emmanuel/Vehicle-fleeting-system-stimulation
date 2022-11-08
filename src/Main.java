
class path1 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " running");
        int longitude = 19, latitude = 81;
        while(longitude <= 60 && latitude >=40){
            Main.check(longitude, latitude);
            longitude++;
            latitude--;

        }
    }
}

class path2 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " running");
        int longitude = 61, latitude = 39;
        while(longitude >= 20 && latitude <= 80){

            Main.check(longitude, latitude);
            longitude--;
            latitude++;

        }
    }


}

public class Main{

    final int gateLongitude = 60;
    final int gateLatitude = 40;

    final int sportLongitude = 50;
    final int sportLatitude = 50;

    final int newHallLongitude = 40;
    final int newHallLatitude = 60;

    final int citsLongitude = 30;
    final int citsLatitude = 70;

    final int campusLongitude = 20;
    final int campusLatitude = 80;
    public static void check(int longitude, int latitude) {
        if (longitude == 20 && latitude == 80) {
            System.out.println(Thread.currentThread().getName() + " is at campus Car park => " + " map(" + longitude + ", " + latitude + ")");
        } else if (longitude == 30 && latitude == 70) {
            System.out.println(Thread.currentThread().getName() + " is at CITS =>" + " map(" + longitude + ", " + latitude + ")");
        } else if (longitude == 40 && latitude == 60) {
            System.out.println(Thread.currentThread().getName() + " is at New Hall =>" + " map(" + longitude + ", " + latitude + ")");
        } else if (longitude == 50 && latitude == 50) {
            System.out.println(Thread.currentThread().getName() + " is at Sport Center =>" + " map(" + longitude + ", " + latitude + ")");
        } else if (longitude == 60 && latitude == 40) {
            System.out.println(Thread.currentThread().getName() + " is at the gate car pack =>" + " map(" + longitude + ", " + latitude + ")");
        } else {
            System.out.println(Thread.currentThread().getName() + " map(" + longitude + ", " + latitude + ")");
        }
    }

    public static void main(String[] args) {
        path1 t1 = new path1();
        path2 t2 = new path2();

        Thread cab1 = new Thread(t1, "cab 1");
        Thread cab2 = new Thread(t2, "cab 2");

        cab1.start();
        cab2.start();


    }

}

