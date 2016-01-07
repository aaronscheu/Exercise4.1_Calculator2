/**
 * The main class of a simple calculator. Create one of these and you'll
 * get the calculator on screen.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class Calculator {

    private CalcEngine engine;
    private UserInterface gui;

    /**
     * Create a new calculator and show it.
     */
    public Calculator() {
        engine = new CalcEngine();
        gui = new UserInterface(engine);
    }

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.test();

    }

    /**
     * In case the window was closed, show it again.
     */
    public void show() {
        gui.setVisible(true);

    }

    private void test () {
        /******************* Testcase_1 *******************/
        engine.input("AC");

        engine.input("1");
        engine.input("+");
        engine.input("1");

        System.out.printf("Testcase 1: \nRead Displayvalue: %s \n", engine.getDisplayValue());

        engine.input("=");

        System.out.printf("Read Result:     %s \n", engine.getDisplayValue());
        System.out.printf("Expected Result: 2\n");
        System.out.printf("################################\n\n");

        /******************* Testcase_2 *******************/
        engine.input("AC");

        engine.input("1");
        engine.input("+");
        engine.input("2");

        System.out.printf("Testcase 2: \nRead Displayvalue: %s \n", engine.getDisplayValue());

        engine.input("=");

        System.out.printf("Read Result:     %s \n", engine.getDisplayValue());
        System.out.printf("Expected Result: 3\n");
        System.out.printf("################################\n\n");

        /******************* Testcase_3 *******************/
        engine.input("AC");

        engine.input("3");
        engine.input("-");
        engine.input("2");

        System.out.printf("Testcase 3: \nRead Displayvalue: %s \n", engine.getDisplayValue());

        engine.input("=");

        System.out.printf("Read Result:     %s \n", engine.getDisplayValue());
        System.out.printf("Expected Result: 1\n");
        System.out.printf("################################\n\n");

        /******************* Testcase_4 *******************/
        engine.input("AC");

        engine.input("4");
        engine.input("*");
        engine.input("5");

        System.out.printf("Testcase 4: \nRead Displayvalue: %s \n", engine.getDisplayValue());

        engine.input("=");

        System.out.printf("Read Result:     %s \n", engine.getDisplayValue());
        System.out.printf("Expected Result: 20\n");
        System.out.printf("################################\n\n");

        /******************* Testcase_5 *******************/
        engine.input("AC");

        engine.input("2");
        engine.input("0");
        engine.input("/");
        engine.input("4");

        System.out.printf("Testcase 5: \nRead Displayvalue: %s \n", engine.getDisplayValue());

        engine.input("=");

        System.out.printf("Read Result:     %s \n", engine.getDisplayValue());
        System.out.printf("Expected Result: 5\n");
        System.out.printf("################################\n\n");

        /******************* Testcase_6 *******************/
        engine.input("AC");

        engine.input("2");
        engine.input("^");
        engine.input("3");

        System.out.printf("Testcase 6: \nRead Displayvalue: %s \n", engine.getDisplayValue());

        engine.input("=");

        System.out.printf("Read Result:     %s \n", engine.getDisplayValue());
        System.out.printf("Expected Result: 8\n");
        System.out.printf("################################\n\n");

        /******************* Testcase_7 *******************/
        engine.input("AC");

        engine.input("2");
        engine.input("*");
        engine.input("(");
        engine.input("3");
        engine.input("+");
        engine.input("3");
        engine.input(")");

        System.out.printf("Testcase 7: \nRead Displayvalue: %s \n", engine.getDisplayValue());

        engine.input("=");

        System.out.printf("Read Result:     %s \n", engine.getDisplayValue());
        System.out.printf("Expected Result: 12\n");
        System.out.printf("################################\n\n");

        /******************* Testcase_8 *******************/
        engine.input("AC");

        engine.input("3");
        engine.input("-");
        engine.input("(");
        engine.input("1");
        engine.input("+");
        engine.input("1");
        engine.input(")");

        System.out.printf("Testcase 8: \nRead Displayvalue: %s \n", engine.getDisplayValue());

        engine.input("=");

        System.out.printf("Read Result:     %s \n", engine.getDisplayValue());
        System.out.printf("Expected Result: 1\n");
        System.out.printf("################################\n\n");

        /******************* Testcase_9 *******************/
        engine.input("AC");

        engine.input("7");
        engine.input("+");
        engine.input("(");
        engine.input("3");
        engine.input("*");
        engine.input("(");
        engine.input("4");
        engine.input("-");
        engine.input("2");
        engine.input(")");
        engine.input(")");

        System.out.printf("Testcase 9: \nRead Displayvalue: %s \n", engine.getDisplayValue());

        engine.input("=");

        System.out.printf("Read Result:     %s \n", engine.getDisplayValue());
        System.out.printf("Expected Result: 13\n");
        System.out.printf("################################\n\n");

        /******************* Testcase_10 *******************/
        engine.input("AC");

        engine.input("2");
        engine.input("*");
        engine.input("(");
        engine.input("1");
        engine.input("+");
        engine.input("3");
        engine.input("*");
        engine.input("(");
        engine.input("4");
        engine.input("-");
        engine.input("3");
        engine.input(")");
        engine.input(")");

        System.out.printf("Testcase 10: \nRead Displayvalue: %s \n", engine.getDisplayValue());

        engine.input("=");

        System.out.printf("Read Result:     %s \n", engine.getDisplayValue());
        System.out.printf("Expected Result: 8\n");
        System.out.printf("################################\n\n");

        /******************* Testcase_11 *******************/
        engine.input("AC");

        engine.input("1");
        engine.input("+");
        engine.input("2");
        engine.input("*");
        engine.input("3");

        System.out.printf("Testcase 11: \nRead Displayvalue: %s \n", engine.getDisplayValue());

        engine.input("=");

        System.out.printf("Read Result:     %s \n", engine.getDisplayValue());
        System.out.printf("Expected Result: 7\n");
        System.out.printf("################################\n\n");

        /******************* Testcase_12 *******************/
        engine.input("AC");

        engine.input("6");
        engine.input("+");
        engine.input("2");
        engine.input("*");
        engine.input("3");
        engine.input("+");
        engine.input("(");
        engine.input("3");
        engine.input("0");
        engine.input("/");
        engine.input("5");
        engine.input(")");
        engine.input("^");
        engine.input("2");
        engine.input("+");
        engine.input("7");
        engine.input("-");
        engine.input("(");
        engine.input("8");
        engine.input("+");
        engine.input("2");
        engine.input(")");
        engine.input("*");
        engine.input("9");
        engine.input("/");
        engine.input("1");
        engine.input("0");
        engine.input("+");
        engine.input("1");
        engine.input("*");
        engine.input("1");
        engine.input("0");
        engine.input("/");
        engine.input("4");

        System.out.printf("Testcase 12: \nRead Displayvalue: %s \n", engine.getDisplayValue());

        engine.input("=");

        System.out.printf("Read Result:     %s \n", engine.getDisplayValue());
        System.out.printf("Expected Result: 48\n");
        System.out.printf("################################\n\n");

        /******************* Testcase_13 *******************/
        engine.input("AC");

        engine.input("3");
        engine.input("*");
        engine.input("3");
        engine.input("^");
        engine.input("2");

        System.out.printf("Testcase 13: \nRead Displayvalue: %s \n", engine.getDisplayValue());

        engine.input("=");

        System.out.printf("Read Result:     %s \n", engine.getDisplayValue());
        System.out.printf("Expected Result: 27\n");
        System.out.printf("################################\n\n");

        /******************* Testcase_14 *******************/
        engine.input("AC");

        engine.input("7");
        engine.input("*");
        engine.input("7");
        engine.input("+");
        engine.input("(");
        engine.input("3");
        engine.input("*");
        engine.input("4");
        engine.input(")");

        System.out.printf("Testcase 14: \nRead Displayvalue: %s \n", engine.getDisplayValue());

        engine.input("=");

        System.out.printf("Read Result:     %s \n", engine.getDisplayValue());
        System.out.printf("Expected Result: 61\n");
        System.out.printf("################################\n\n");

        /******************* Testcase_15 *******************/
        engine.input("AC");

        engine.input("5");
        engine.input("-");
        engine.input("3");
        engine.input("*");
        engine.input("2");
        engine.input("+");
        engine.input("7");

        System.out.printf("Testcase 15: \nRead Displayvalue: %s \n", engine.getDisplayValue());

        engine.input("=");

        System.out.printf("Read Result:     %s \n", engine.getDisplayValue());
        System.out.printf("Expected Result: 6\n");
        System.out.printf("################################\n\n");
    }

}
