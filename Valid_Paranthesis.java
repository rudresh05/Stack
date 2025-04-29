package Stack;

import java.util.*;

public class Valid_Paranthesis {
    public static boolean validParanthesis(String str){
        if(str.length()%2 !=0 ) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            
            char ch = str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if((ch==')' && top != '(') ||( ch=='}' && top != '{' )|| (ch==']' && top != '[')){
                    return false;  
                }
                else {
                    stack.pop();
                }
            }
        }
        return (stack.size()==0);
    }
    public static void main(String[] args) {
        String str = "(){}"; 
        System.out.println(validParanthesis(str));
    }
}
