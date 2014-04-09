package myjava.npp.homework.april0214;
import static junit.framework.Assert.assertEquals;


/**
 * Created by teren_000 on 09.04.2014.
 */
public class StackTest {

    Stack<Integer>myStack1, myStack2, myStack3;

    @org.junit.Before
    public void setUp() throws Exception {
        myStack1=new Stack<Integer>();
        myStack2=new Stack<Integer>(5);
        myStack3=new Stack<Integer>(myStack2);
    }

    @org.junit.Test
    public void testPush() throws Exception {
        myStack1.push(4);
        myStack2.push(4);


        assertEquals(myStack1.peek().intValue(), 4);
        assertEquals(myStack2.peek().intValue(), 4);
        assertEquals(myStack3.peek().intValue(), 5);

    }

    @org.junit.Test
    public void testPop() throws Exception {
        myStack1.push(4);
        myStack2.push(4);
        assertEquals(myStack1.pop().intValue(), 4);
        assertEquals(myStack2.pop().intValue(), 4);
        assertEquals(myStack3.pop().intValue(), 5);
    }

    @org.junit.Test
    public void testPeek() throws Exception {
        myStack1.push(4);
        myStack2.push(4);


        assertEquals(myStack1.peek().intValue(), 4);
        assertEquals(myStack2.peek().intValue(), 4);
        assertEquals(myStack3.peek().intValue(), 5);
    }

    @org.junit.Test
    public void testSize() throws Exception {
        assertEquals(myStack1.size(),0);
        myStack1.push(4);
        assertEquals(myStack1.size(),1);

    }
}
