public class Hour {

    private final int hour;

    public Hour (int hour) {
        this.hour = hour;
    }

    public String[] getFiveHourRow() {

        String[] fiveHourRow = new String[]{"O", "O", "O", "O"};

        int howManyLampsToSwitch = hour / 5;
        for (int i = 0; i < fiveHourRow.length && i < howManyLampsToSwitch; i++) {
            fiveHourRow[i] = "R";
        }
        return fiveHourRow;
    }

    public String[] getOneHourRow() {

        String[] oneHourRow = new String[]{"O", "O", "O", "O"};

        int oneHour = hour % 5;

        for (int i = 0; i < oneHourRow.length; i++) {
            if (oneHour > 0) {
                oneHourRow[i] = "R";
                oneHour--;
            }
        }
        return oneHourRow;
    }
}
