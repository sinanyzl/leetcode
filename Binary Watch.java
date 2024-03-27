import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();

        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn) {
                    result.add(String.format("%d:%02d", hour, minute));
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int turnedOn = 4;
        List<String> possibleTimes = readBinaryWatch(turnedOn);

        System.out.println("Possible times for " + turnedOn + " LEDs turned on: ");
        for (String time : possibleTimes) {
            System.out.println(time);
        }
    }
}