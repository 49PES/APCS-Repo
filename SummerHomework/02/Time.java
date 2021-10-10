public class Time{
     public static void main(String []args){
        int hourInitial, minuteInitial, secondInitial, hourFinal, minuteFinal, secondFinal;
        double time_in_seconds_1, time_in_seconds_2;
        hourInitial = 14;
        minuteInitial = 17;
        secondInitial = 7;

        time_in_seconds_1 = 3600 * hourInitial + 60 * minuteInitial + secondInitial;

        System.out.println(time_in_seconds_1 + " seconds since midnight.");
        System.out.println(86400.0 - time_in_seconds_1 + " seconds left in the day.");
        System.out.println(time_in_seconds_1 / 86400.0 * 100 + "% of the day has elapsed.");

        hourFinal = 14;
        minuteFinal = 28;
        secondFinal = 49;

        time_in_seconds_2 = 3600 * hourFinal + 60 * minuteFinal + secondFinal;
        System.out.println(time_in_seconds_2 - time_in_seconds_1 + " seconds have passed since you have started programming this.");

     }
}
