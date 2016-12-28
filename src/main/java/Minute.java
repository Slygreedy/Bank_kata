public class Minute {

    private int minute;

    public Minute(int minute) {
        this.minute = minute;
    }

    //I have removed convertMethods (that get called if private)

    public String[] getFiveMinuteRow() {

        String[] fiveMinuteRow = new String[]{"O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"};

        //what is this for? - because as it sounds it is 5 minute interval!
        int counter = 5;

        for (int i = 0; i < fiveMinuteRow.length; i++) {

            if (counter <= minute) {
                //is this just going through each element of the array?
                //and array is better than list because fixed size?
                fiveMinuteRow[i] = "Y";
                //is this a nested if because it is a condition within the above? - turns Y to R?
                if (counter == 15 || counter == 30 || counter == 45) {
                    fiveMinuteRow[i] = "R";
                }
            }
            counter = counter + 5;
        }
        return fiveMinuteRow;
    }

    public String[] getOneMinuteRow() {

        String[] oneMinuteRow = new String[]{"O", "O", "O", "O"};

        int oneMinute = minute % 5;

        for (int i = 0; i < oneMinuteRow.length; i++) {

            if (oneMinute > 0) {
                oneMinuteRow[i] = "Y";
            }
            oneMinute--;
        }
        return oneMinuteRow;
    }
}






