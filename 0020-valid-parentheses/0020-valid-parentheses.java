class Solution {
    public boolean isValid(String s) {
        Stack<Character> arr=new Stack<>();
        for(char i:s.toCharArray())
        {
            if(i=='(')
            {
                arr.push(')');
            }
            else if(i=='[')
            {
                arr.push(']');
            }
            else if(i=='{')
            {
                arr.push('}');
            }
            else if(arr.isEmpty() || arr.pop()!=i)
            {
                return false;
            }
        }
        return arr.isEmpty();
    }
}