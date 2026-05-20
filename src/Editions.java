public class Editions {
    private String name;
    private int numPages;
    private int numCopies;
    private String expectedSize;

    public Editions(String name, int numCopies, int numPages, String expectedSize){
        this.name = name;
        this.numCopies = numCopies;
        this.numPages = numPages;
        this.expectedSize = expectedSize;
    }
}
