package Java_Assignment_3;

import Java_Assignment_3.Interfaces.PingAHostInterface;
import Java_Assignment_3.Models.Host;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class PingAHost implements PingAHostInterface {

    Host host;

    public PingAHost(Host host) {
        this.host = host;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    public double getMedian(int numOfPings) throws IOException, InterruptedException {
        ArrayList<Double> timeList = new ArrayList<>();
        Process process;
        process = Runtime.getRuntime().exec("ping -c"+numOfPings+" "+host.getHost());
        BufferedReader br = new BufferedReader (new InputStreamReader(process.getInputStream()));
        String inputLine;

        while ((inputLine = br.readLine()) != null) {
            int index = inputLine.indexOf("time=");
            if(index != -1) {
                String subString = inputLine.substring(index + 5);
                String time = subString.split(" ")[0];
                timeList.add(Double.parseDouble(time));
            }
        }

        process.waitFor();

        process.destroy();

        if(process.exitValue() == 0) {
            Collections.sort(timeList);

            double median;
            int midIndex = timeList.size() / 2;

            if (timeList.size() % 2 == 0) {
                median = (timeList.get(midIndex) + timeList.get(midIndex + 1)) / 2;
            } else {
                median = timeList.get(midIndex);
            }

            return median;

        }else{
            return -1;
        }
    }
}
