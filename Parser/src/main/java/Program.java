/**
 * Created by teren_000 on 29.03.14.
 */
public class Program {
    public static void main(String args[]){
        Parser parser=new RecursiveDescentParser();
        int res = parser.parseAndCalculate("((9*6+1)+3)*2");
        System.out.println(res);
    }
}