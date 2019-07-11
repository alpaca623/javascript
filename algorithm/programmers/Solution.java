/**
 * 프로그래머스 레벨 테스트 - 1level
 * 
 * 제공되는 문자열 s는 한 개 이상의 단어로 구성되어 있다. 각 단어는 공백으로 구분되어 있으며,
 * 각 단어의 짝수번째 알파벳은 대문자로,
 * 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수를 완성하라.
 * 
 * 0번째 인덱스는 짝수로 한다.
 * 
 * 입력 예제 : try hello world
 * 출력 예제 : TrY HeLlO WoRlD
 * 
 */

package algorithm.programmers;

public class Solution {
  public static void main(String[] args) {
      solution("try hello world");
  }
  public static String solution(String s) {
      String[] answer = s.split(" ");
      StringBuffer temp = new StringBuffer();
      for(int i = 0; i<answer.length; ++i){
          for(int j = 0; j<answer[i].length(); ++j) {
              String word = String.valueOf(answer[i].charAt(j));
              if (j % 2 == 0) {
                  temp.append(word.toUpperCase());
              }
              if (j % 2 != 0) {
                  temp.append(word.toLowerCase());
              }
          }
          if(i != answer.length-1){
              temp.append(" ");
          }
      }
      System.out.println(temp.toString());
      return temp.toString();
  }
}