/**
 * Created by teren_000 on 29.03.14.
 */
public class RecursiveDescentParser implements Parser {


    //attached type
    private enum Lexem {Number, Open, Close, Plus, Mult, End};

    //keep current lexem value
    private Lexem lexem;


    //current number value
    private int value;

    //current text position
    private int position;


    //expression to be calculated
    private char[] expression;

    @Override
    public int parseAndCalculate (String expression){

        this.expression=expression.toCharArray();
        int res;
        nextLexem();
        res=expressionCalc();
        this.position=-1;
        return res;
   }

    private void nextLexem(){
        if (position<expression.length-1){
            position++;
            if (expression[position] == '('){
                this.lexem=Lexem.Open;
            }
            else if (expression[position]==')'){
                this.lexem = Lexem.Close;
            }
            else if (expression[position]=='+'){
                this.lexem=Lexem.Plus;
            }
            else if (expression[position]=='*'){
                this.lexem=Lexem.Mult;
            }
            else {
                this.lexem=Lexem.Number;
                this.value=this.expression[position]-'0';
            }
        }
        else{
            this.lexem=Lexem.End;
        }


    }


    private int expressionCalc(){
        int result=0;
        result= sumand();
        while (this.lexem==Lexem.Plus){
            nextLexem();
            result+= sumand();
        }

        return result;
    }


    private int sumand(){
        int sum;
        sum=mult();
        while(this.lexem==Lexem.Mult){
            nextLexem();
            sum=sum*mult();
        }
        return sum;
    }


    private int mult (){
        switch (lexem){
            case Number:{
                int buf=this.value;
                nextLexem();
                return buf;
            }
            case Open:{
                nextLexem();
                int buf=expressionCalc();
                nextLexem();
                return buf;
            }
        }
        return 0;
    }
}
