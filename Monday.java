package monday;

import java.util.Scanner;
import java.time.LocalTime;


interface Alarm {
    void setAlarm(String time);
    void showAlarm();
}


abstract class Weekday implements Alarm {
 
}


public class Monday extends Weekday {
    private String alarmTime;

    public static void main(String[] args) {
        Monday monday = new Monday();
        monday.setAlarmTime();
        monday.showAlarm();
    }

    
    public void setAlarm(String time) {
        alarmTime = time;
    }

    
    
    public void showAlarm() {
        LocalTime alarm = LocalTime.parse(alarmTime);
        LocalTime now = LocalTime.now();

        if (alarm.isAfter(now)) {
            System.out.println("Alarm is set for tomorrow!");
        } else {
            System.out.println("I'll wake you up later!");
        }
    }

    
    private void setAlarmTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time for alarm in this format (HH:MM): ");
        String time = scanner.nextLine();
        setAlarm(time);
    }
}