public class Second {

    private int second;

    //had to include a constructor because passing in second?
    public Second (int second) {
        this.second = second;
    }

    public String getSecond() {
        if (second % 2 == 0)
            return "Y";
        else {
            return "0";
        }
    }

    //I don't have the getSecond method here (nor do i appear to be using them in hour/minute)?

    //I use convertSecond method AND getMinute (rather than convertMinute) later - why?
    //I think it is because minute and hour are initialised to 0's but second is not???
}
