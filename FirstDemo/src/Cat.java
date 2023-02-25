public class Cat extends DongVat {

    public Cat() {
        super();
        // setActionListener(this);
    }

    @Override
    protected void onCreate() {

    }

    @Override
    protected String initType() {
        return "Tren can";
    }

    @Override
    protected String getParts() {
        return "Tay, Chan, duoi";
    }

    @Override
    protected String eat() {
        return "chuot";
    }

    @Override
    protected int sleep() {
        return 1000;
    }

    @Override
    protected void onResult(String result) {
        System.out.println("on result: " + result);
    }

}
