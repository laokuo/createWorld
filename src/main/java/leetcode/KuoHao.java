package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
//if语句先执行复杂的操作，简单的操作放在else
//复杂操作是找到右边括号开始的
//把注意力都放在复杂的操作一边，容易忽略简单操作的结束标志。如：左边括号被推到栈里面，最后应该是不剩的；
//操作容器的时候要时刻注意是否为空,以及是否应当将容器的状态作为判断条件
public class KuoHao {
    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (map.containsKey(tmp)) {
                if (stack.isEmpty() || stack.pop()!=map.get(tmp))
                    return false;
            } else {
                stack.push(tmp);
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        String a0= "[";
        System.out.println(isValid(a0));
    }
}
