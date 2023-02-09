import java.util.*;

public class TimeConvert {

    public static void main(String[] args) {

        Map<String, String> data = new HashMap<>();


        Scanner sc=new Scanner(System.in);
        String input=sc.next();

        createData(data);

        List<String> time = Arrays.asList(input.split(":"));

        System.out.println(input);

        Integer hour = Integer.valueOf(time.get(0));
        Integer minute = Integer.valueOf(time.get(1));
        if(hour > 23 || hour <0 || minute < 0 || minute > 59 ){
            System.out.println("It's not a valid time");
        }
        else {
            if(hour> 12){
                hour = hour-12;
            }
            if(hour<10){
                time.set(0, "0"+ (hour));
            }

            if ("00".equalsIgnoreCase(time.get(1))) {
                if ("00".equalsIgnoreCase(time.get(0))) {
                    System.out.println("It's Midnight");
                } else if ("12".equalsIgnoreCase(time.get(0))) {
                    System.out.println("It's Midday");
                } else {
                    System.out.println("It's " + data.get(time.get(0)));
                }
            } else  {
                if(minute<21){
                    System.out.println("It's " + data.get(time.get(0)) +" " + data.get(time.get(1)));
                }
                else{
                    String reminder = "0" + (minute/10);
                    String tens = (minute%10)+ "0";

                    System.out.println("It's " + data.get(time.get(0)) +" " + data.get(tens) + " " + data.get(reminder));
                }
            }
        }
    }

    public static void createData(Map<String, String> data){
        data.put("01", "One");
        data.put("02", "Two");
        data.put("03", "Three");
        data.put("04", "Four");
        data.put("05", "Five");
        data.put("06", "Six");
        data.put("07", "Seven");
        data.put("08", "Eight");
        data.put("09", "Nine");
        data.put("10", "Ten");
        data.put("11", "Eleven");
        data.put("12", "Twelve");
        data.put("13", "Thirteen");
        data.put("14", "Fourteen");
        data.put("15", "Fifteen");
        data.put("16", "Sixteen");
        data.put("17", "Seventeen");
        data.put("18", "Eighteen");
        data.put("19", "Nineteen");
        data.put("20", "Twenty");
        data.put("30", "Thirty");
        data.put("40", "Forty");
        data.put("50", "Fifty");
        data.put("00", "Twelve");

    }
}