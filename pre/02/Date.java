public class Date{
     public static void main(String []args){
        String day, month;
        int date, year;

        day = "Sunday";
        date = 22;
        month = "August";
        year = 2021;
        System.out.println("American format:");
        System.out.println(day + ", "+ month + " " + date + ", " + year);
        System.out.println("European format:");
        System.out.println(day + " " + date + " " + month + " " + year);
     }
}
