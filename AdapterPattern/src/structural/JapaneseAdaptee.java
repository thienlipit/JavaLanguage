package structural;

public class JapaneseAdaptee {
    public JapaneseAdaptee(){
        System.out.println("Init JapaneseAdaptee");

    };

    public void receive(String words) {
        System.out.println("Retrieving words from Adapter ...");
        System.out.println(words);
    }
}