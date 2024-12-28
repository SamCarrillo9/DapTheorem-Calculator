import java.util.Scanner;

public class PerfectDapFormula {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("\n/------------------------------Intro------------------------------\\");
        System.out.println("|     This is a Java program that finds the perfect distance      |");
        System.out.println("|     for two people to stand apart when performing a dap.        |");
        System.out.println("|                                                                 |");
        System.out.println("|     The program utilizes the dap distance formula,              |");
        System.out.println("|     a formula both produced and theorized by Sam Carrillo,      |");
        System.out.println("|     Matty Doherty, Jordan Kraut, and many other contributors.   |");
        System.out.println("\\-----------------------------------------------------------------/\n\n");
        System.out.println("|============================Instructions=========================|");
        System.out.println("            <Please enter all following values in meters>          ");
        System.out.println(" * First, measure the length from your elbow to your fingertips");
        System.out.print("     and enter here: ");
        double forearm1 = input.nextDouble();
        System.out.print(" * Then, do the same for your partner: ");
        double forearm2 = input.nextDouble();
        System.out.println(" * Next, measure the length from your shoulder to your elbow");
        System.out.print("     and enter here: ");
        double bicep1 = input.nextDouble();
        System.out.print(" * Then, do the same for your partner: ");
        double bicep2 = input.nextDouble();
        System.out.print(" * Then, enter your height: ");
        double height1 = input.nextDouble();
        System.out.print(" * And your partner's height: ");
        double height2 = input.nextDouble();
        System.out.println("\n|==============================Distance============================|\n");
        double shoulderLength = 0.0;
        if (forearm1 >= forearm2) {
            shoulderLength = forearm1 + bicep1 + bicep2;
        }
        if (forearm1 < forearm2) {
            shoulderLength = forearm2 + bicep1 + bicep2;
        }
        double hRatio = 0.0;

        if (height2 > height1) {
            hRatio = 1 - height1 / height2;
        }
        if (height2 < height1) {
            hRatio = 1 - height2 / height1;
        }
        double meters = formula(shoulderLength, hRatio);
        double feet = meters * 3.28084;
        feet = Math.round(feet*1000.0)/1000.0;
        System.out.println("           ___________________________________________");
        System.out.println("          {  You must stand " + meters + " meters (" + feet + " feet) }");
        System.out.println("          {        away from your dapping partner     }");
        System.out.println("          {       in order to achieve an ideal dap.   }" );
        System.out.println("          {___________________________________________}" );
    }
    public static double formula(double shoulderLength, double hRatio) {
        double distance = shoulderLength * ( Math.cos(Math.asin(-hRatio)) );
        distance = Math.round(distance*1000.0)/1000.0;
        return distance;
    }
}
// 19