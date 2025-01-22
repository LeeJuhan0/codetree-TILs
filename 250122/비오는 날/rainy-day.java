import java.util.Scanner;

class forecast {
    String date, dotw, weather;

    public forecast(String date, String dotw, String weather) {
        this.date = date;
        this.dotw = dotw; 
        this.weather = weather;
    }

    public forecast() {}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        forecast[] arr = new forecast[n];

        for (int i = 0 ; i < n ; i++) {
            String date = sc.next();
            String dotw = sc.next();
            String weather = sc.next();
            arr[i] = new forecast(date, dotw, weather);
        }
        int dateIdx = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i].weather.equals("Rain") ) {
                if(arr[i].date.compareTo(arr[dateIdx].date) < 0 || !arr[dateIdx].weather.equals("Rain")) {
                    dateIdx = i;
                }
            }
        }
        forecast rainyday = arr[dateIdx];
        System.out.println(rainyday.date+" "+rainyday.dotw+" "+rainyday.weather);
    }
}