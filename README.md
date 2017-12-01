Team Members: Gustavo Silvera, Noah Boursier, Uday Kalra

This assignment was a lesson in classes, subclasses, and the appropriate functions to go with them. This came along with practices in debugging and logging methods for code in Android Studio. 

Roles: Gustavo Silvera did primary class structure and method fixing, Noah focused on the debugging functions, and Uday's role was to fix most of the bugs that came with Android Studio.

Key Lessons Learned:
from part 1. class structure and subclasses
from part 2. methods in subclasses and their uses
from part 3. using android studio to check the debugger
from part 4. fixing the debugger and making the assertion work early. 

Conclusion Questions.


Document your project by placing a comment line above each line of code that represents
a step in the assignment. For instance, Step 6 would be commented in your code (Arithmetic.java) as follows:

// Step 6 implemented in lines 3-9 below

    Arithmetic a;
    private float m1 = 5;//one test value for the checks
    private float m2 = 10;//one test value for the checks
    @Override
    public void setUp()throws Exception{
        super.setUp();
        a = new Arithmetic();//creates a new arithmetic class
    }

    public void testArithmeticAdd() {
        //tests the arithmetic add function
        assertEquals(a.add(m1, m2), (float)15);
    }
    public void testArithmeticMult() {
        //tests the arithmetic multiplication function
        assertEquals(a.mult(m1, m2), (float)50);
    }
    public void testArithmeticDiff() {
        //tests the arithmetic differene function
        assertEquals(a.diff(m1, m2), (float)(-5));
    }
    public void testArithmeticDiv() {
        //tests the arithmetic division function
        assertEquals(a.div(m1, m2), (float)0.5);
    }
    TaxArithmetic taxes =  new TaxArithmetic();
    public void testArithmeticTax() {
        //tests the arithmetic tax calfulator function
        assertEquals(taxes.calculateTax((float)10.75, (float)8.5), (float)0.91375);
    }

Once the class has completed this assignment, we will discuss what parts of this assignment
need to be implemented in your semester project. At a minimum, I will have each team create
a set of unit tests for their application. If your team cannot come up with a class structure
that utilizes subclasses, I may have you write a short justification, or create a simple
stand alone (Plain Old Java) example of a java program that uses inheritance, and give a short
presentation, so that you reflect on the topic in the context of your project.
