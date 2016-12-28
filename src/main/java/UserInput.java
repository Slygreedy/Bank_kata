public class UserInput {
    private int hours;
    private int minutes;
    private int seconds;

    //Tony put in an array of booleans i.e. R or 0 - ask him?
    //Tony also created a pattern matcher for the output - ask him?

    //below negates the need to include and then nullify date
    public UserInput(String actualTimeEntered) {
        hours = Integer.parseInt(actualTimeEntered.split(":")[0]);
        minutes = Integer.parseInt(actualTimeEntered.split(":")[1]);
        seconds = Integer.parseInt(actualTimeEntered.split(":")[2]);
    }

    //don't require try and catch (it doesn't add much over standard error)
    public String returnTime() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public void validateUserInput() {
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("Not a valid hour");
        }
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Not a valid minute");
        }
        if (seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException("Not a valid second");
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    /*don't believe I need setters
    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    */

}
