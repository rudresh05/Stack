package Stack;
import java.util.*;

public class Minimum_Add_to_Make_Parentheses_Valid {
    public static int minimum_Add_to_Make_Parentheses_Valid_p(String s){
        int open=0; 
        int close=0; 
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('){
                open++;
            }
            else{
                if(open<=0){
                    close++;
                }
                else{
                    open--;
                }
            }
        }


        return (open+close);
    }
    public static int minimum_Add_to_Make_Parentheses_Valid(String s){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }
            else{
                if(stack.peek()==')' || stack.isEmpty()){
                    stack.push(ch);
                }
                else{
                    stack.pop();
                }
            }
            return stack.size();
        }
        return stack.size();
    }
    public static void main(String[] args){
        String s = "())";
        System.out.println(minimum_Add_to_Make_Parentheses_Valid_p(s));

        
    }
}
