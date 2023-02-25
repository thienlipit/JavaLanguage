package tax;

public class HP implements StateTax {
    @Override
    public double stateTax() {
        return 1000.0;
    }
}
