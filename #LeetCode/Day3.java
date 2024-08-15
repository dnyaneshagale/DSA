class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five += 1;
            } else if (bills[i] == 10) {
                ten += 1;
                five -= 1;
                if (five < 0) {
                    return false;
                }
            } else { 
                if (ten > 0) {
                    ten -= 1;
                    five -= 1;
                } else {
                    five -= 3;
                }
                if (five < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
