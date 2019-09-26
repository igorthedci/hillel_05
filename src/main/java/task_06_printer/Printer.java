package task_06_printer;
/**
 * "6. Create a class and demonstrate proper encapsulation techniques
 * the class will be called Printer
 * It will simulate a real Computer printer
 * It should have fields for toner level, number of pages printed, and also
 * whether its a duplex printer (capable of printing on both sides of the paper).
 * Add methods to fill up the toner (up to a maximum of 100%), another method to
 * simulate printing a page(which should increase the number of pages printed).
 * Decide on the scope, whether to use constructors, and anything else you think is needed."
 */
public class Printer {
    private String manufacturer;
    private String model;
    private boolean isColor;
    private String type;
    private boolean isDuplex;
    private int tonerLevelBlack = 0;
    private int tonerLevelMagenta = 0;
    private int tonerLevelYellow = 0;
    private int tonerLevelBlue = 0;
    private int printedPages = 0;

    public Printer(String manufacturer, String model, boolean isColor, boolean isDuplex) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.isColor = isColor;
        this.isDuplex = isDuplex;
    }

    // SETTER, GETTER
    public boolean isColor() { return isColor; }
    public boolean isDuplex() { return isDuplex; }

    // return the rest of toner (color)
    public int getTonerLevel(String toner) {
        int restToner = 0;
        switch (toner.toLowerCase()) {
            case "black":
                restToner = this.tonerLevelBlack;
                break;
            case "magenta":
                restToner = this.tonerLevelMagenta;
                break;
            case "yellow":
                restToner = this.tonerLevelYellow;
                break;
            case "blue":
                restToner = this.tonerLevelBlue;
                break;
        }
        return restToner;
    }

    public void fillUp(int tonerVolume, String color) {
        switch (color.toLowerCase()) {
            case "black":
                this.tonerLevelBlack = 100;
                break;
            case "magenta":
                this.tonerLevelMagenta = 100;
                break;
            case "yellow":
                this.tonerLevelYellow = 100;
                break;
            case "blue":
                this.tonerLevelBlue = 100;
                break;
        }
    }

    // print (paint out) some part of the color toner
    private void paintOut (int percent, String color) {
        if (percent <= 0) { return; }

        switch (color.toLowerCase()) {
            case "black":
                this.tonerLevelBlack -= percent;
                break;
            case "magenta":
                this.tonerLevelMagenta -= percent;
                break;
            case "yellow":
                this.tonerLevelYellow -= percent;
                break;
            case "blue":
                this.tonerLevelBlue -= percent;
                break;
        }
    }
    // print several pages in the color
    public void print (int pages, String color, boolean isDuplex) {
        if (pages <= 0) return;
        int multiplier = isDuplex ? 2 : 1;
        this.printedPages += pages * multiplier;
        this.paintOut(5 * this.printedPages, color);
    }
    // check is the toner empty
    public boolean tonerIsEmpty() {
        if (this.tonerLevelMagenta <= 0
        || this.tonerLevelBlue <= 0
        || this.tonerLevelYellow <= 0
        || this.tonerLevelBlack <= 0)
            return true;
        else
            return false;
    }

}
