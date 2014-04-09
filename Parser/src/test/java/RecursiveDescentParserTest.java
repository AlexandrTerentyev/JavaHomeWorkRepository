import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by teren_000 on 29.03.14.
 */
public class RecursiveDescentParserTest {

    private RecursiveDescentParser parser;

    @Before
    public void setUp() throws Exception {
        this.parser=new RecursiveDescentParser();
    }

    @Test
    public void testParseAndCalculate() throws Exception {
        int res=parser.parseAndCalculate("(2+2)*3");
        int res2=parser.parseAndCalculate("(8*8+1)*2");
        Assert.assertEquals(res, 8);
        Assert.assertEquals(res2,130);
    }
}
