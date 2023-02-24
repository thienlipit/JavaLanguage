abstract class DongVat {

    protected String type;

    protected AnimalAction actionListener;

    public DongVat() {
        type = initType();
        onCreate();
    }

    public void actions() {

        System.out.println("CAT:" + eat());

        onResult("transfer result: before eat");

        try {
            System.out.println("sleep:" + sleep());

            if (actionListener != null) {
                // actionListener.eat(">>>> eat more");
            }

            hiddenAction();

            Thread.sleep(sleep());

            System.out.println("wakeup");

        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        onResult("transfer result: after sleep");

        System.out.println("CAT:" + getParts());
    }

    private void hiddenAction() {
        System.out.println("hidden action");
    }

    public void removeActionListener() {
        actionListener = null;
    }

    public void setActionListener(AnimalAction actionListener) {
        this.actionListener = actionListener;
    }

    public void callAnimal() {
        if (actionListener != null) {
            actionListener.hearMasterCall();
        }
    }

    protected abstract void onCreate();

    protected abstract String initType();

    protected abstract String getParts();

    protected abstract String eat();

    protected abstract int sleep();

    protected abstract void onResult(String result);
}
