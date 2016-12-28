public class CreateClock {

    //is Mahesh outputting this to an iml file?
    //why is hour, minute and second declared here again?
    //I think because these are types of second, etc and time (as opposed to String)?
    private Hour hour;
    private Minute minute;
    private Second second;

    public CreateClock (Hour hour, Minute minute, Second second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void createClock () {
        System.out.println("         "+second.getSecond());

        //same output if I use convertFiveHourRow method, therefore, why use it?
        System.out.println("      "+hour.getFiveHourRow()[0]+" "+
                hour.getFiveHourRow()[1]+" "+
                hour.getFiveHourRow()[2]+" "+
                hour.getFiveHourRow()[3]);
        System.out.println("      "+hour.getOneHourRow()[0]+" "+
                hour.getOneHourRow()[1]+" "+
                hour.getOneHourRow()[2]+" "+
                hour.getOneHourRow()[3]+" ");

        System.out.println(minute.getFiveMinuteRow()[0]+" "+
                minute.getFiveMinuteRow()[1]+" "+
                minute.getFiveMinuteRow()[2]+" "+
                minute.getFiveMinuteRow()[3]+" "+
                minute.getFiveMinuteRow()[4]+" "+
                minute.getFiveMinuteRow()[5]+" "+
                minute.getFiveMinuteRow()[6]+" "+
                minute.getFiveMinuteRow()[7]+" "+
                minute.getFiveMinuteRow()[8]+" "+
                minute.getFiveMinuteRow()[9]+" "+
                minute.getFiveMinuteRow()[10]+" ");
        System.out.println("      "+minute.getOneMinuteRow()[0]+" "+
                minute.getOneMinuteRow()[1]+" "+
                minute.getOneMinuteRow()[2]+" "+
                minute.getOneMinuteRow()[3]+" ");
    }
}
