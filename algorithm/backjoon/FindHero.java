package algorithm.backjoon;

import java.io.*;
import java.util.*;
/**
 * 영웅중에서 좋은놈 나쁜놈 찾기
 *
 * 좋은 영웅은 영어 알파벳 'g'를 가지고 있다.
 *
 * 나쁜 영웅은 영어 알파벳 'b'를 가지고 있다.
 *
 * 'g'나 'b'를 가지고 있지 않은 영웅은 중립이다.
 *
 * 조
 */

public class FindHero {
    static List<String> heros = new ArrayList<String>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++){
            int gCount = 0;
            int bCount = 0;
            String hero = br.readLine();
            String[] temp = hero.split("");
            for(int j = 0; j<temp.length; j++){
                if(temp[j].equals("g") || temp[j].equals("G")){
                    gCount++;
                }
                if(temp[j].equals("b") || temp[j].equals("B")){
                    bCount++;
                }
            }
            if(gCount > bCount){
                heros.add(hero+" is GOOD");
            }else if(gCount < bCount){
                heros.add(hero+" is A BADDY");
            }else{
                heros.add(hero+" is NEUTRAL");
            }
        }
        for(int i = 0; i<heros.size(); i++){
            System.out.println(heros.get(i));
        }

    }
}
