package ValidParentheses_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        Stack stack = new Stack();

        for(Character character : s.toCharArray()){
            if(map.containsKey(character)){
                stack.push(character);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                if(character == map.get(stack.peek())){
                    stack.pop();
                }else{
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }
}
