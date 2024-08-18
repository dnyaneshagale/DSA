class Solution {
    public int romanToInt(String s) {
        int sum = 0;

        int i = 0;
        for(i = 0; i <  s.length(); i++){
            if(s.charAt(i)=='M'){
                sum+=1000;
            }else if(s.charAt(i)=='D'){
                sum+=500;
            }else if(s.charAt(i)=='C' && i + 1 < s.length() && s.charAt(i+1) == 'M'){
                sum-=100;
            }else if(s.charAt(i)=='C' && i + 1 < s.length() && s.charAt(i+1) == 'D'){
                sum-=100;
            }else if(s.charAt(i)=='C'){
                sum+=100;
            }else if(s.charAt(i)=='L'){
                sum+=50;
            }else if(s.charAt(i)=='X' && i + 1 < s.length() && s.charAt(i+1) == 'L'){
                sum-=10;
            }else if(s.charAt(i)=='X' && i + 1 < s.length() && s.charAt(i+1) == 'C'){
                sum-=10;
            }else if(s.charAt(i)=='X'){
                sum+=10;
            }else if(s.charAt(i)=='V'){
                sum+=5;
            }else if(s.charAt(i)=='I' && i + 1 < s.length() && s.charAt(i+1) == 'V'){
                sum-=1;
            }else if(s.charAt(i)=='I' && i + 1 < s.length() && s.charAt(i+1) == 'X'){
                sum-=1;
            }else if(s.charAt(i)=='I'){
                sum+=1;
            }else{
                System.out.println("Invalid Input");
            }
        }
        return sum;
    }
}