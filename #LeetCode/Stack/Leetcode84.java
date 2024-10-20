class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int[] nsr = new int[heights.length]; //Next Smaller Right
        int[] nsl = new int[heights.length]; //Next Smaller Left

        //Next Smaller Right
        Stack<Integer> s = new Stack<>();
        for(int i = heights.length - 1; i >= 0; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsr[i] = heights.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //Next Smaller Left
        s = new Stack<>();
        for(int i = 0; i < heights.length; i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Max Area 
        for(int i = 0; i < heights.length; i++){
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1; //  (j - i - 1)
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }

        return maxArea;
    }
}