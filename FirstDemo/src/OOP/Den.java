package OOP;

public class Den {
    private String denSang;

    public void batDen(int value){
        if (value == 1){
            denSang = "Den dang sang";
            System.out.println(denSang);
        } else {
            System.out.println("chua toi gio bat den");
        }

    }

    public void tatDen(){
        denSang = "Den da tat";
        System.out.println(denSang);

    }
}
