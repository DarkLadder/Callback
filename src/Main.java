/**
 * Created by Dmitrii on 16.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Button button = new Button(new ButtonClickHandler1());
        button.click();
        Button button1 = new Button(new ButtonClickHandler2());
        button1.click();
        Edit edit = new Edit(new ReadClickHandler1());
        edit.click();
        Edit edit1 = new Edit(new ReadClickHandler2());
        edit1.click();
        Edit edit2 = new Edit(new ReadClickHandler3());
        edit2.click();
    }
}
