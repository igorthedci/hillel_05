package task_08_remote_device;

/**
 * 8*. Write a project named ""Remote Device"".
 * Create a class ""RemoteController" which will be simulation the real one to control the TV.
 * Create interfaces Device and Volume.
 * The ""Device"" interface should have methods powerOn(), powerOff(), setChannel(int channel),
 * and currentChannel();
 * The ""Volume"" interface should have methods ""upVolume(), downVolume() and mute();
 * Write an abstract class TVDevice which will be implementing interfaces Volume and Device and
 * has the fields String modelName and boolean isOn (Tip: You don't need to implement methods from the interface
 * if you class is abstract).
 * Write a class ""TV"" which extends the class TVDevice. Implements all the methods.
 * Write a class RemoteController to control your TV.
 * Example of the structure in the requirements.
 */
public class RemoteController {
    String name; // name of remote controller
    TVDevice tvDevice; // 'link' to a TV

    // CONSTRUCTOR
    public RemoteController(String name) {
        this.name = name;
    }

    // SETTER
    public void connectDevice(TVDevice tv) {
        this.tvDevice = tv;
    }

    public void disconnectDevice() {
        this.tvDevice = null;
    }

    public boolean checkIfDeviceConnected() {
        return this.tvDevice != null;
    }

    // POWER METHODS
    public void powerOn() {
        if (this.tvDevice != null)
            this.tvDevice.powerOn();
    }

    public void powerOff() {
        this.tvDevice.powerOff();
    }

    // VOLUME METHODS
    public void upVolume() {
        if (this.tvDevice != null) {
            this.tvDevice.upVolume();
        }
    }
    public void upVolume(int delta) {
        if (this.tvDevice != null) {
            this.tvDevice.upVolume(delta);
        }
    }

    public void downVolume() {
        if (this.tvDevice != null) {
            this.tvDevice.downVolume();
        }
    }
    public void downVolume(int delta) {
        if (this.tvDevice != null) {
            this.tvDevice.downVolume(delta);
        }
    }

    public void mute() {
        if (this.tvDevice != null) {
            this.tvDevice.mute();
        }
    }

    // CHANNEL METHODS
    public void switchTheChannel(int channel) {
        if (this.tvDevice != null) {
            this.tvDevice.setChannel(channel);
        }
    }
    public void setChannel(int channel) {
        if (this.tvDevice != null) {
            this.tvDevice.setChannel(channel);
        }
    }
    public void currentChannel(int channel) {
        if (this.tvDevice != null) {
            this.tvDevice.setChannel(channel);
        }
    }
}