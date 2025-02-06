/*The SyntaxChecker class is used to compare the syntax of a given expression. There
is a Parameterized and No-argument constructor
available, each calling the setExpression() method.
The checkExpression() method is used to compare
each opening bracket in a String with every other element in order to see if there is
a balanced match
@author Kenedi Carson*/
//Import needed utilities
import java.util.Iterator;
import java.util.Stack;
import static java.lang.System.*;
public class SyntaxChecker
{
private String exp; //String variable representing the expression
private Stack<Character> symbols; //Stack variable representing each
individual character in the expression
/*No-argument constructor- calls the setExpression() method
@param none
@return none*/
public SyntaxChecker(){
    symbols = new Stack<Character>();
    setExpression("");
}
/*Parameterized constructor-Creates a new Stack and calls the setExpression()
method
@param String s
@return none*/
public SyntaxChecker(String s){
    symbols = new Stack<Character>();
    setExpression(s);
}
/*setExpression method- Clears symbols and sets the variable "exp" to equal
s.
* The list is then added to the Stack.
* @param String s
* @return none*/
public void setExpression(String s){
    symbols.clear();
    exp = s;
}
/*checkExpression method- Compares the stack of characters to see if each
opening symbol has a balanced match with a closing symbol.
Completed with for loops and if statemnts.
*@param none
*@return boolean*/
public boolean checkExpression(){
    for(int i = 0; i < exp.length(); i++){
        char temp = exp.charAt(i);
	if(temp == '[' || temp == '{' || temp == '(' || temp == '<'){
	    symbols.push(temp);
	}
    if(temp == ']' || temp == '}' || temp == ')' || temp == '>'){
        if(!symbols.isEmpty()){
            char test = symbols.pop();
            if(test == '[' && temp != ']'){
		return false;
	}
    if(test == '{' && temp != '}'){
	return false;
	}
    if(test == '(' && temp != ')'){
	return false;
	}
    if(test == '<' && temp != '>'){
	return false;
	}
    }
    else{
	return true
    }
 }
}
if(symbols.isEmpty()){
    return true;
}
else{
	return false;
  }
}
/*toString method- Outputs the symbols stack in a readable manner
@param none
@return String ans*/
public String toString(){
    String ans = "";
    if(checkExpression() == true){
        ans = exp + " is correct.";
    }
    else{
	ans = exp + " is incorrect.";
    }
     return ans;	
   }
}











