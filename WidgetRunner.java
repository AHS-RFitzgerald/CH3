/**
 * Richard Fitzgerald
 * CH3PC6 - Widget
 * Programming III - AP
 * 10/2/18
 */
public class WidgetRunner {

   
    public static void main(String[] args) {
        Widget quota = new Widget(400);
        quota.CalcWid();
        System.out.print("You need a total of " + quota.getDays() + " day(s), ");
        System.out.print("and " + quota.getShifts() + " shift(s). ");
    }

}
