package algorithm.backjun;

import java.io.*;
import java.util.*;

public class PersonInCompany {
    static List list = new LinkedList<>();
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int N = Integer.parseInt(br.readLine());
            for(int i = 0; i<N; i++){
                String person = br.readLine();

                if(person.indexOf("enter") != -1){
                    list.add(person.replace(" enter",""));
                }
                if(person.indexOf("leave") != -1){
                    list.remove(person.replace(" leave", ""));
                }
//                list.sort(Comparator.comparingInt(o -> o));
            }
            System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
