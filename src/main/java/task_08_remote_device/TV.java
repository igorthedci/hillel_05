package task_08_remote_device;

public class TV extends TVDevice {

    private int currentChannel;
    private int volumeLevel;

    // CONSTRUCTOR
    public TV(String name) {
        super(name);
    }

    //
    // POWER
    //
    public void powerOn() {
        this.setOn(true);
        System.out.println("TV is ON");
    }

    public void powerOff() {
        this.setOn(false);
        System.out.println("TV is OFF");
    }

    //
    // CHANNEL
    //
    public void setChannel(int channel) {
        if (isOn()) this.currentChannel = channel;
        System.out.println("TV: switch to channel " + channel);
    }

    public void currentChannel() {
        System.out.println("TV: current channel is " + currentChannel);
    }

    //
    // VOLUME
    //
    public void upVolume() {
        if (isOn()) this.volumeLevel = Math.min(100, this.volumeLevel + 1);
        System.out.println("TV: volume up to " + this.volumeLevel);
    }

    public void upVolume(int delta) {
        if (isOn()) this.volumeLevel = Math.min(100, this.volumeLevel + delta);
        System.out.println("TV: volume up to " + this.volumeLevel);
    }

    public void downVolume() {
        if (isOn()) this.volumeLevel = Math.max(0, this.volumeLevel - 1);
        System.out.println("TV: volume down to " + this.volumeLevel);
    }

    public void downVolume(int delta) {
        if (isOn()) this.volumeLevel = Math.max(0, this.volumeLevel - delta);
        System.out.println("TV: volume down to " + this.volumeLevel);
    }

    public void mute() {
        if (isOn()) this.volumeLevel = 0;
        System.out.println("TV: volume is mute");
    }

    //
    // INFO
    //
    public void info() {
        System.out.println(
                "TV INFO: name: " + this.getModelName()
                        + "; device is " + (this.isOn() ? "ON" : "OFF")
                        + "; channel:" + this.currentChannel
                        + "; volume: " + this.volumeLevel);
    }
}
