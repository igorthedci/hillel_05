package task_08_remote_device;

public class Main {

    public static void main(String[] args) {
        TV myTV = new TV("LG tv55"); // TV device
        RemoteController myRC = new RemoteController("LG rc55"); // remote controller

        myRC.connectDevice(myTV); // link TV to RemoteController

        myTV.info();
        myTV.setModelName("LG tv55");
        myTV.info();

        myRC.setChannel(1);
        myTV.info();
        myRC.powerOn();
        myRC.setChannel(1);
        myTV.info();

        myRC.setChannel(2);
        myRC.setChannel(3);
        myTV.info();

        myRC.upVolume();
        myRC.upVolume();
        myRC.upVolume(111);
        myTV.info();

        myRC.downVolume();
        myRC.downVolume(11);
        myTV.info();
    }
}
