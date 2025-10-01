package n2;

public class N2 {
    public static void main(String[] args) {
        Balance balance1 = new Balance();
        Balance balance2 = new Balance();
        Balance balance3 = new Balance();

        balance1.addLeft(42);
        balance1.addRight(42);
        balance1.showScales();
        balance1.result();

        balance2.addLeft(228);
        balance2.addRight(322);
        balance2.showScales();
        balance2.result();

        balance3.addLeft(999);
        balance3.addRight(001);
        balance3.showScales();
        balance3.result();
    }
}