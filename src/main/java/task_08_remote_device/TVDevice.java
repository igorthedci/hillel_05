package task_08_remote_device;
/**
 *  * Write an abstract class TVDevice which will be implementing interfaces Volume and Device and
 *  * has the fields String modelName and boolean isOn (Tip: You don't need to implement methods from the interface
 *  * if you class is abstract).
 */
public abstract class TVDevice implements Volume, Device {
    private String modelName;
    private boolean isOn;

    public TVDevice(String name) {
        this.modelName = name;
    }

    public boolean isOn() { return isOn; }
    public void setOn(boolean on) { isOn = on; }

    public String getModelName() { return modelName; }
    public void setModelName(String modelName) { this.modelName = modelName; }
}
