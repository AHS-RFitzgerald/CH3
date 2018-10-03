/**
 * Richard Fitzgerald
 * CH3PC6 - Widget
 * 10/2/18
 */
public class Widget {
    private int widget;
    private int days;
    private int shifts;
    
    /**
     * The class constructor initializes the field widget 
     */
    public Widget(int wid){
        widget = wid;
    }
    /**
     * The method CalcWid calculates the days and shifts to make the widgets
     */
    public void CalcWid(){
        days = widget / 160;
        shifts = (widget % 160) / 80;
        
        }
    /**
     * getDays returns the value of days 
     */
    public int getDays(){
        return days;
    }
    /**
     * getShifts returns the value of shifts 
     */
    public int getShifts(){
        return shifts;
    }
}
