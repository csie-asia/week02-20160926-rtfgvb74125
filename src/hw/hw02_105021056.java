package hw;
/*
 * Topic: 已知男生標準體重＝(身高－80 )*0.7；女生標準體重＝(身高－70)*0.6；
 * 試寫一個程式可以計算男生女生的標準體重。
 * (輸入兩個數值，依序代表為身高及性別（1代表男性；2代表女性）)
 * Date: 2016/09/26
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class hw02_105021056 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
System.out.print("1 = ");
int b = scn.nextInt();
System.out.print("2 = ");
int g = scn.nextInt();
System.out.println((b-80)*0.7);
System.out.println((g-70)*0.6);
	}

}
