package greedy;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;public class B1541 {    public static void main(String[] args) throws IOException {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        String expression = br.readLine();        String[] nums = expression.split("-");        int answer = Integer.MAX_VALUE;        for (int i = 0; i < nums.length; i++) {            int temp = 0;            String[] subNums = nums[i].split("\\+");            for (String subNum : subNums) {                temp += Integer.parseInt(subNum);            }            if (answer == Integer.MAX_VALUE) {                answer = temp;            } else {                answer -= temp;            }           }        System.out.println(answer);    }}