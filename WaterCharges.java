import javax.swing.JOptionPane;

public class WaterCharges {
    public static void main(String[] args) {
        double waterC1 = 0.40;
        double waterC2 = 0.15;
        double waterCharge;
        int input1;

        String inputString = JOptionPane.showInputDialog(null, "How much water are you using per cubic meter");
        input1 = Integer.parseInt(inputString);

        if (input1 >= 910) {
            waterCharge = (input1 * waterC1) + 0.15;
        } else {
            waterCharge = input1 * waterC1;
        }

        System.out.println("Water charge: $" + waterCharge);
        //testing gitbash feature via VSCode
    }
}
