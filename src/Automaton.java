import javax.swing.*;
public class Automaton {
    private final String textFile;
    private short charID;
    private final JTextArea textArea;
    private boolean keepGoing;
    /**
     * 0 : Keyword
     * 1 : ID
     * 2 : Relational operator
     * 3 : Logic operator
     * 4 : Arithmetic operator
     * 5 : Assignment
     * 6 : Integer
     * 7 : Float
     * 8 : Comment
     * 9 : Parenthesis
     * 10: Bracket
     * 11: Error
     */
    private final int [] result ;
    private final String [] keyWords ;

    public Automaton(String textFile, JTextArea textArea){
        this.textFile = textFile;
        this.textArea = textArea;
        this.result = new int[] {0,0,0,0,0,0,0,0,0,0,0,0};
        this.charID = 0;
        this.keepGoing = true;
        this.keyWords = new String[]{"if","else","switch","case","default","for","while","break","int","string",
                "double","char"};
        textArea.append("Working...\n\n");
        initialState01(nextChar());
    }
    private void initialState01(char c) {
        if(keepGoing){
            if(Character.isLetter(c)){
                if (!keyWord(c))
                    id(nextChar());
                else
                    initialState01(nextChar());
            }else{
                if(Character.isDigit(c))
                    number02(c);
                else {
                    if(isParenthesis(c))
                        parenthesis();
                    if(isBracket(c))
                        bracket();
                    if(c == '/')
                        diagonal13(nextChar());
                    if(c == '&')
                        AND(nextChar());
                    if(c =='|')
                        OR(nextChar());
                    if(c == '=')
                        assignment(nextChar());
                    if(c == '!')
                        logicOperator21(nextChar());
                    if(isArithmeticOperator(c))
                        arithmeticOperator(c);
                    if(isEndingWithEqual(c))
                        relationalOperator(nextChar());
                    if (c != '`') {//Todo lo demas
                            //textArea.append("@");
                            initialState01(nextChar());
                    }else
                        keepGoing = false;
                }
            }
        }
    }

    private void assignment(char nextChar){
        if(nextChar == '=')
                relationalOperator(nextChar);
            else{
                charID--;
                addResult(5);
                initialState01(nextChar);
        }
    }

    private void logicOperator21(char nextChar){ //!
        if(nextChar=='='){
            relationalOperator(nextChar);
        }else{
            addResult(3);
            initialState01(nextChar);
        }
    }

    private void relationalOperator(char nextChar) {
        if(nextChar == '='){
            addResult(2);
            initialState01(nextChar());
        }else{
            charID--;
            addResult(2);
            initialState01(nextChar());
        }
    }



    private void number02(char c) {
        if (Character.isDigit(c))
            number02(nextChar());
        else{
            if (c == '.')
                decimalPoint03(nextChar());
            else{
                charID--;
                addResult(6);
                initialState01(nextChar());
            }
        }
    }
    private void id(char c){
        if (Character.isLetter(c)||c=='_')
            id(nextChar());
        else {
            charID--;
            addResult(1);
            initialState01(nextChar());
        }
    }
    private boolean keyWord(char c){
        String word = String.valueOf(c);
        short auxCharID = charID;
        while (Character.isLetter(c)){//cuenta el espacio como letra
            auxCharID++;
            c = textFile.charAt(auxCharID-1);
            word += c;
        }
        word =  word.substring(0,word.length()-1);
        for (String keyword: keyWords) {
            if (keyword.equals(word)){
                charID = (short) (auxCharID-1);
                addResult(0);
                return true;
            }
        }
        return false;
    }
    private char nextChar(){
        if (keepGoing){
            charID++;
            if (textFile.length()>charID-1){
                //textArea.append(String.valueOf(textFile.charAt(charID-1)));
                return textFile.charAt(charID-1);
            }else
                printResults();
        }
        return '`';
    }

    private boolean addResult(int resultCode) {
        if (resultCode == 11){
            System.out.println("Error!");
            result[11]++;
            while(!addResult(12)){
                addResult(12);
            }
            return false;
        }else{
            charID--;
            char lastChar = nextChar();
            char c = nextChar();
            System.out.println(c);
            if (c == ' ' || c == '\n' || c == '\t' || c == '`'){
                charID--;
                switch (resultCode){
                    case 0: // KEYWORD
                        result[0]++;
                        System.out.println("KeyWord "+lastChar);
                        break;
                    case 1: // ID
                        result[1]++;
                        System.out.println("ID "+lastChar);
                        break;
                    case 2:// RELATIONAL OPERATOR
                        result[2]++;
                        System.out.println("Operador relacional "+lastChar);
                        break;
                    case 3: // LOGIC OPERATOR
                        result[3]++;
                        System.out.println("Operador logico "+lastChar);
                        break;
                    case 4: // ARITHMETIC OPERATOR
                        result[4]++;
                        System.out.println("Operador aritmetico "+lastChar);
                        break;
                    case 5: // ASSIGNMENT
                        result[5]++;
                        System.out.println("Asignacion "+lastChar);
                        break;
                    case 6: // INTEGER
                        result[6]++;
                        System.out.println("Entero "+lastChar);
                        break;
                    case 7: // FLOAT
                        result[7]++;
                        System.out.println("Decimal "+lastChar);
                        break;
                    case 8 : // COMMENT
                        result[8]++;
                        System.out.println("Comentario "+lastChar);
                        break;
                    case 9: // PARENTHESIS
                        result[9]++;
                        System.out.println("Parentesis "+lastChar);
                        break;
                    case 10: // BRACKET
                        result[10]++;
                        System.out.println("LLave "+lastChar);
                        break;
                }
                return true;
            }else{
                if (resultCode == 12){
                    addResult(12);
                }else{
                    addResult(11);
                }
            }
        }
        return false;
    }
    private void decimalPoint03(char c)  {
        if (Character.isDigit(c))
            decimalPoint04(nextChar());
        else{
            addResult(11);
            initialState01(nextChar());
        }
    }
    private void decimalPoint04(char c){
        if (Character.isDigit(c))
            decimalPoint04(nextChar());
        else{
            if (c == '.'){
                addResult(11);
                initialState01(nextChar());
            }
            else{
                charID--;
                addResult(7);
                initialState01(nextChar());
            }
        }
    }
    private void diagonal13(char c) { if (c =='*') comment14(nextChar());else arithmeticOperator(c);}
    private void comment14(char c) {
            if (c == '*') {
                comment15(nextChar());
            }
            else{
                if(c == ' '|| c == '\n' || c == '\t'){
                    charID--;
                    addResult(11);
                    initialState01(nextChar());
                }else
                    comment14(nextChar());
            }
    }
    private void comment15(char c) {
        if (c == '/'){
            addResult(8);
            initialState01(nextChar());
        }else
            comment14(nextChar());
    }
    private boolean isParenthesis(char c){return c == '(' || c == ')';}
    private boolean isBracket(char c){ return c == '{' || c == '}';}
    private boolean isArithmeticOperator(char c){ return c == '*' || c == '+' || c == '-' || c == '%';}
    private boolean isEndingWithEqual(char c){ return  (c == '<' ||c == '>');}
    private void parenthesis(){
        addResult(9);
        initialState01(nextChar());
    }
    private void bracket(){
        addResult(10);
        initialState01(nextChar());
    }
    private void arithmeticOperator(char c) {
        if(c == '-'){
            char nextChar = nextChar();
            if(Character.isDigit(nextChar)){
                number02(nextChar);
            }else{
                charID--;
                addResult(4);
                initialState01(nextChar);
            }
        }else{
            addResult(4);
            initialState01(nextChar());
        }
    }
    private void OR(char c) {
        if(c == '|') {
            addResult(3);
            initialState01(nextChar());
        }else{
            addResult(11);
            initialState01(nextChar());
        }
    }
    private void AND(char c) {
        if (c == '&'){
            addResult(3);
            initialState01(nextChar());
        }else {
            addResult(11);
            initialState01(nextChar());
        }
    }
    private void printResults(){
        if(keepGoing){
            keepGoing = false;
            textArea.append("RESULTS\n\n" +
                    "     * Keyword\t\t" + result[0] + "\n" +
                    "     * ID\t\t" + result[1] + "\n" +
                    "     * Relational operator\t" + result[2] + "\n" +
                    "     * Logic operator\t" + result[3] + "\n" +
                    "     * Arithmetic operator\t" + result[4] + "\n" +
                    "     * Assignment\t" + result[5] + "\n" +
                    "     * Integer\t\t" + result[6] + "\n" +
                    "     * Float\t\t" + result[7] + "\n" +
                    "     * Comment\t\t" + result[8] + "\n" +
                    "     * Parenthesis\t" + result[9] + "\n" +
                    "     * Bracket\t\t" + result[10] + "\n" +
                    "     * Error\t\t" + result[11] + "\n");
        }
    }
}
