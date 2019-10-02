package task_08_remote_device;

public class TV extends TVDevice {

    private int currentChannel;
    private int volumeLevel;

    public TV(String name) {
        super(name);
    }
    public void powerOn() {
        this.setOn(true);
        System.out.println("TV is ON");
    }
    public void powerOff() {
        this.setOn(false);
        System.out.println("TV is OFF");
    }
    public void setChannel(int channel) {
        if (isOn()) this.currentChannel = channel;
        System.out.println("TV: switch to channel " + channel);
    }
    public void currentChannel() {
        System.out.println("TV: current channel is " + currentChannel);
    }

    public void upVolume() {
        if (isOn()) this.volumeLevel += Math.min(100, this.volumeLevel + 13);
        System.out.println("TV: volume up to " + this.volumeLevel);
    }
    public void downVolume() {
        if (isOn()) this.volumeLevel = Math.max(0, this.volumeLevel - 13);
        System.out.println("TV: volume down to " + this.volumeLevel);
    }
    public void mute() {
        if (isOn()) this.volumeLevel = 0;
        System.out.println("TV: volume is mute");
    }
    public void info() {
        System.out.println(
                "TV INFO: name: " + this.getModelName()
                        + "; device is " + (this.isOn() ? "ON" : "OFF")
                        + "; channel:" + this.currentChannel
                        + "; volume: " + this.volumeLevel);
    }
}
