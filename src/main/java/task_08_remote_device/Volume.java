package task_08_remote_device;
/**
 *  * The ""Volume"" interface should have methods ""upVolume(), downVolume() and mute();
 */
public interface Volume {
    public void upVolume();
    public void upVolume(int delta);
    public void downVolume();
    public void downVolume(int delta);
    public void mute();
}
