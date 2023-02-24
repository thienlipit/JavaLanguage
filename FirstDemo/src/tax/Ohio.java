package tax;

public class Ohio implements StateTax {
    @Override
    public double stateTax() {
        return 3000.0;
    }
}
