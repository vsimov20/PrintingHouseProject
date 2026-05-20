import java.util.ArrayList;

public class PrintingMachine {
    private ArrayList<Editions> editions;
    private int maxCap;
    private int pagesPerMin;
    private boolean isLoaded;
    private boolean isColor;

    public PrintingMachine(int maxCap, int pagesPerMin, boolean isColor, boolean isLoaded){
        this.editions = new ArrayList<>();
        this.maxCap = maxCap;
        this.pagesPerMin = pagesPerMin;
        this.isColor = isColor;
        this.isLoaded = isLoaded;
    }
}
