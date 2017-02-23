/**
 * Created by Anthony on 23/02/2017.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class readFile {
    BufferedReader in = new BufferedReader(new FileReader("kittens.in"));

    private void input() {
        try {
            int[] firstLine = new int[5];
            String line = in.readLine();
            String[] strs = line.split(" ");
            for (int i = 0; i < 5; i++) {
                firstLine[i] = Integer.parseInt(strs[i]);
            }
            //HashMap <Integer, Integer> hm = new HashMap<Integer,Integer>();
            int[] video = new int[firstLine[0]];
            String sline = in.readLine();
            String[] videos = sline.split(" ");
            for (int i = 0; i < firstLine[0]; i++){
                //Get videos
                video[i] = Integer.parseInt(videos[i]);
            }

            for(int i = 0; i < firstLine[1]; i++){
                //Get Endpoints
                String eline = in.readLine();
                String[] endpointInput = eline.split(" ");
                int[] endpointIn = new int[2];
            }
        } catch (Exception e) {
            System.out.println("File Not Found. Please Try again.");
        }
    }
}
