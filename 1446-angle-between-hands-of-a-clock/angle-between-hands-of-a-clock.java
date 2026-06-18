class Solution {
    public double angleClock(int hour, int minutes) {
        double hourCalculation = (hour *30)+(minutes*0.5);
        double minuteCalculation = (minutes*6);
        double value = Math.abs(hourCalculation - minuteCalculation);
        return Math.min(value, 360-value);
        
    }
}