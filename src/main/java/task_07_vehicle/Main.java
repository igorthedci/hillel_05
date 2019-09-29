package task_07_vehicle;

public class Main {
    public static void main(String[] args) {
        Car suzuki = new Car("suzuki", "white");
        Transmission suzukiTrs = new Transmission("manual", 4, 0, 20, 50, 90, 160);
        suzuki.setTransmission(suzukiTrs);
    }
}
