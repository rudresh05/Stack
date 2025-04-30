package Stack;

import java.util.*;
public class Asteroid_Collision {
    public static int[] asteroidsCollision(int[] asteroids){
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i<asteroids.length; i++){
            if( asteroids[i] >0 || stack.isEmpty()){
                stack.push(asteroids[i]);
                
            }
            else{
                int top = stack.peek();
                if(top<0){
                    stack.push(asteroids[i]);
                    break;
                }
                int modVal = Math.abs(asteroids[i]);
                if(top== modVal){
                    stack.pop();
                    break;
                }
                else if(modVal< top){
                    break;
                }
                else{
                    stack.pop();
                    if(stack.isEmpty()){
                        stack.push(asteroids[i]);
                        break;
                    }
                }
            }
        }

        int len = stack.size();
        int ans[] = new int[len];
        for(int i=ans.length-1; i>=0; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
    public static void main(String[] args){
       int[] asteroids = {10,2,-5,3,5,-5,-10,4,56,6,33,-100};
      int arr[] = asteroidsCollision(asteroids);
      System.out.println(Arrays.toString(arr));
    }
}
