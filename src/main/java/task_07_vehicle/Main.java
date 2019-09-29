package task_07_vehicle;

public class Main {
    public static void main(String[] args) {
        Car suzuki = new Car("suzuki", "white");
        Transmission suzukiTrs = new Transmission("manual", 4, new int[]{0, 20, 50, 90, 160});
        suzuki.setTransmission(suzukiTrs);

        suzuki.info();
        suzuki.drive(0, 0);
        suzuki.drive(10, 10);
        suzuki.getTransmission().setActualLevel(1);
        suzuki.drive(20, 20);
        suzuki.getTransmission().setActualLevel(2);
        suzuki.drive(30, 30);
        suzuki.drive(40, 40);
        suzuki.drive(50, 50);
        suzuki.drive(60, 60);
        suzuki.getTransmission().setActualLevel(3);
        suzuki.drive(70, 70);
        suzuki.drive(80, 80);
        suzuki.drive(100, 100);
        suzuki.getTransmission().setActualLevel(4);
        suzuki.drive(120, 120);
        suzuki.drive(140, 140);
        suzuki.drive(160, 160);
        suzuki.drive(180, 180);
        suzuki.getTransmission().setActualLevel(5);
        suzuki.drive(200, 200);

//        for (int i = 0; i < 360; i += 10) {
//            suzuki.drive(i, i);
//        }
    }
}
