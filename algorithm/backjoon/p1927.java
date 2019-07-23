package algorithm.backjoon;
import java.io.*;
import java.util.*;

public class p1927 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<>();
        int min = 0;

        for(int i = 0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num != 0){
                al.add(num);
            }else{
                if(al.size() != 0){
                    // 리스트에 있는 가장 작은값을 찾고 출력한다.
                    result.add(Collections.min(al));
                    al.remove(Collections.min(al));
                }else{
                    result.add(0);
                }
            }
        }
        for(int i = 0; i<result.size(); i++){
            System.out.println(result.get(i));
        }

        br.close();
    }
}
