package n1;

public class N1 {
    public static void main(String[] args) {
        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");

        button1.click();
        button1.click();

        button2.click();
        button2.click();
    }
}