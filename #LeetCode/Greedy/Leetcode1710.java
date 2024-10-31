class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
    Arrays.sort(boxTypes, Comparator.comparingInt((int[] box) -> box[1]).reversed());


        int maxUnits = 0;

        for (int i = 0; i < boxTypes.length; i++) {
            int boxCount = boxTypes[i][0];
            int unitsPerBox = boxTypes[i][1];

            if (truckSize >= boxCount) {
                maxUnits += boxCount * unitsPerBox;
                truckSize -= boxCount;
            } else {
                maxUnits += truckSize * unitsPerBox;
                break;
            }
        }

        return maxUnits;
    }
}
