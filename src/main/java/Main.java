import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter time (in the format HH:MM:SS) : ");
        String timeEntered = scanner.next();

        UserInput userInput = new UserInput(timeEntered);
        //System.out.println(userInput.returnTime());
        userInput.returnTime();
        userInput.validateUserInput();

        Second second = new Second(userInput.getSeconds());
        second.getSecond();

        Minute minute = new Minute(userInput.getMinutes());
        minute.getFiveMinuteRow();
        minute.getOneMinuteRow();

        Hour hour = new Hour(userInput.getHours());
        hour.getFiveHourRow();
        hour.getOneHourRow();

        CreateClock newClock = new CreateClock(hour, minute, second);
        newClock.createClock();

    }
}
