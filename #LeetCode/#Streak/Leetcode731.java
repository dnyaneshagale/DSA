class MyCalendarTwo {

    // List to store all the bookings
    private List<int[]> booked;
    // List to store all the overlaps (double bookings)
    private List<int[]> overlaps;

    public MyCalendarTwo() {
        booked = new ArrayList<>();
        overlaps = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        // Check if this booking causes a triple booking
        for (int[] overlap : overlaps) {
            if (start < overlap[1] && end > overlap[0]) {
                return false; // This booking would result in a triple booking
            }
        }

        // Check for new overlaps with existing bookings
        for (int[] book : booked) {
            if (start < book[1] && end > book[0]) {
                // Calculate the overlapping interval and add it to overlaps
                int overlapStart = Math.max(start, book[0]);
                int overlapEnd = Math.min(end, book[1]);
                overlaps.add(new int[]{overlapStart, overlapEnd});
            }
        }

        // No triple booking detected, add the booking
        booked.add(new int[]{start, end});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */