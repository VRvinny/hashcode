/**
 * Created by Anthony on 23/02/2017.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class readFile{
    public static BufferedReader in;
    public int[] firstLine;
    public String[] requestDesc;
    public ArrayList<HashMap<Integer, Integer>> endpoint;
    public int[] video;
    private void input() {
        try {
            firstLine = new int[5];
            String line = in.readLine();
            String[] strs = line.split(" ");
            for (int i = 0; i < 5; i++) {
                firstLine[i] = Integer.parseInt(strs[i]);
            }
            //
            video = new int[firstLine[0]];
            String sline = in.readLine();
            String[] videos = sline.split(" ");
            for (int i = 0; i < firstLine[0]; i++){
                //Get videos
                video[i] = Integer.parseInt(videos[i]);
            }
            endpoint = new ArrayList<HashMap<Integer, Integer>>();
            for(int i = 0; i < firstLine[1]; i++){
                //Get Endpoints
                String eline = in.readLine();
                String[] endpointInput = eline.split(" ");
                int latencyLimit = Integer.parseInt(endpointInput[0]);
                int cacheServer = Integer.parseInt(endpointInput[1]);
                HashMap <Integer, Integer> hm = new HashMap<Integer,Integer>();
                for(int j = 0; j < cacheServer; j++){
                    String[] lline = in.readLine().split(" ");
                    hm.put(Integer.parseInt(lline[0]), Integer.parseInt(lline[1]));
                }
                endpoint.add(hm);

            }
            requestDesc = new String[firstLine[2]];
            for(int i = 0; i < firstLine[2]; i++){
                String rline = in.readLine();
                requestDesc[i] = rline;
            }
        } catch (Exception e) {
            System.out.println("File Not Found. Please Try again.");
        }
    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new FileReader("C:\\Users\\Anthony\\workspace\\HashCode2017\\src\\kittens.in"));
        readFile file = new readFile();
        file.input();
        System.out.println(file.requestDesc);
    }
}
