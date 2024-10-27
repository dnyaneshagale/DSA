class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();

        int[] answer = new int[temperatures.length];

        for(int i = temperatures.length - 1; i >= 0; i--){
            while(!s.isEmpty() && temperatures[s.peek()] <= temperatures[i]){
                s.pop();
            }

            if(s.isEmpty()){
                answer[i] = 0;
            }else{
                answer[i] = s.peek() - i - 0;
            }
            s.push(i);
        }
        return answer;
    }
}