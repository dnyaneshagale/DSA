class MyCalendar {
    private List<int[]> calendar;

    public MyCalendar() {
        calendar = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] event : calendar) {
            // Check if there is an overlap
            if (Math.max(event[0], start) < Math.min(event[1], end)) {
                return false; // Overlapping event
            }
        }
        // If no overlap, add the new event
        calendar.add(new int[]{start, end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */