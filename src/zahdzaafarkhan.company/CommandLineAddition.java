package FahdZaafarKhan.Company;

public class CommandLineAddition {
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Usage : Java CommandLineAddition <num1><num2>");
            System.exit(1);
            Double num1=Double.parseDouble(args[0]);
            Double num2=Double.parseDouble(args[1]);
            Double result = num1 + num2;
            System.out.println("Addition" +result);

        }
    }
}
