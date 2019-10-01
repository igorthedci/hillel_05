package task_08_remote_device;

public class TV extends TVDevice {

    private int currentChannel;
    private int volumeLevel;

    public void powerOn() {
        this.isOn = true;
        System.out.println("TV: device is ON");
    }

    public void powerOff() {
        this.isOn = false;
        System.out.println("TV: device is OFF");
    }

    public void setChannel(int channel) {
        this.currentChannel = channel;
        System.out.println("TV: switch to channel " + channel);
    }

    public void currentChannel() {
        System.out.println("TV: current channel is " + currentChannel);
    }

    public void upVolume() {
        if (this.volumeLevel < 100) this.volumeLevel++;
        System.out.println("TV: volume up to " + this.volumeLevel);
    }

    public void downVolume() {
        if (this.volumeLevel > 0) this.volumeLevel--;
        System.out.println("TV: volume down to " + this.volumeLevel);
    }

    public void mute() {
        this.volumeLevel = 0;
    }

    public void info() {
        System.out.println(
                "TV INFO: device is " + (isOn ? "ON" : "OFF")
                        + " channel:" + this.currentChannel
                        + " volume: " + this.volumeLevel);
    }
}
