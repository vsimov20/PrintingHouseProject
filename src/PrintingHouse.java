import java.util.ArrayList;

public class PrintingHouse {
    private ArrayList<PrintingMachine> machines;
    private Manager manager;
    private ArrayList<Operator> operators;

    public PrintingHouse(Manager manager){
        this.machines = new ArrayList<>();
        this.operators = new ArrayList<>();
        this.manager = manager;
    }

}
