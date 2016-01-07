/**
 * The main part of the calculator doing the calculations.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class CalcEngine {

    public boolean hex = false;
    protected String displayValue;
    private Postfix postfix;
    private int tmp;


    /**
     * Create a CalcEngine.
     */
    public CalcEngine() {
        postfix = new Postfix();
        tmp = 0;
        clear();
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public void input(String input) {
        if (input.equals("=")) {
            int result;
            try {
                result = postfix.evaluate(postfix.in2Postfix(displayValue), hex);
                if (hex) displayValue = Integer.toHexString(result).toUpperCase();
                else displayValue = Integer.toString(result);
            } catch (Exception e) {
                displayValue = "Error: ";
                System.out.println(e);
            }
        } else if (input.equals("AC")) {
            clear();
        } else if (input.equals("?")) {
            displayValue = showInfo();
        } else if (input.matches("\\w")) {
            if (tmp != 0) {
                int last = displayValue.lastIndexOf(' ') + 1;
                displayValue = displayValue.substring(0, last);
            }
            if (!hex) {
                tmp = tmp * 10 + Integer.parseInt(input);
                displayValue += String.valueOf(tmp);
            } else {
                tmp = tmp * 16 + Integer.decode("#" + input);
                displayValue += String.valueOf(Integer.toHexString(tmp)).toUpperCase();
            }
        } else {
            tmp = 0;
            displayValue += " " + input + " ";
        }
    }

    /**
     * The 'C' (clear) button was pressed.
     * Reset everything to a starting state.
     */
    public void clear() {
        displayValue = "";
        tmp = 0;
    }

    public String getTitle() {
        return "Java Calculator";
    }

    public String showInfo() {
        return "Aaron und Till 2015";
    }

}
