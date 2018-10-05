

import java.util.*;

public class HW0921_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入月份:");
		int a = scn.nextInt();
		System.out.println("請輸入日期:");
		int b = scn.nextInt();
		
		if (a == 1 && b >= 1 && b >= 21&&b<32 || a == 2 && b >= 1 && b <= 19) {
			System.out.println("你是水瓶座的，特質:受天王星控制的水瓶座簡直就是天王星的縮影。水瓶座具有令人吃驚的智慧和溝通能力。");
		}

		if (a == 2 && b >= 1 && b >= 20&&b<30 || a == 3 && b >= 1 && b <= 20) {
			System.out.println("你是雙魚座的，特質:雙魚座是水相星座。受神秘的海王星所控制。雙魚非常善於接納,富有同情心,並且很為別人著想。");
		}

		if (a == 3 && b >= 1 && b >= 21&&b<32 || a == 4 && b >= 1 && b <= 20) {
			System.out.println("你是牡羊座的，特質:火相星座的特質使白羊座具有非常自信的自我力量。");
		}

		if (a == 4 && b >= 1 && b >= 21&&b<31 || a == 5 && b >= 1 && b <= 20) {
			System.out.println("你是金牛座的，特質:土相星座的特質讓金牛座渴望並具有腳踏實地的能力。");
		}

		if (a == 5 && b >= 1 && b >= 22&&b<32 || a == 6 && b >= 1 && b <= 21) {
			System.out.println("你是雙子座的，特質:風向星座的特質讓雙子座具有溝通能力,智慧和速度。");
		}

		if (a == 6 && b >= 1 && b >= 22 &&b<31|| a == 7 && b >= 1 && b <= 22) {
			System.out.println("你是巨蠍座的，特質:巨蟹座是水相星座。水是情感的象徵,水的特質是給予和接受。");
		}

		if (a == 7 && b >= 1 && b >= 23&&b<32 || a == 8 && b >= 1 && b <= 23) {
			System.out.println("你是獅子座的，特質:獅子座是火相星座的中心。火引發了創造,革新和領導的欲望。");
		}

		if (a == 8 && b >= 1 && b >= 24 &&b<32|| a == 9 && b >= 1 && b <= 23) {
			System.out.println("你是處女座的，特質:在流動的水星控制下,處女座需要努力才能獲得穩定。");
		}

		if (a == 9 && b >= 1 && b >= 24&&b<31 || a == 10 && b >= 1 && b <= 23) {
			System.out.println("你是天坪座的，特質:天秤座是風相星座。其特性比較外向和主動。");
		}

		if (a == 10 && b >= 1 && b >= 24 &&b<32|| a == 11 && b >= 1 && b <= 22) {
			System.out.println("你是天蠍座的，特質:水相星座的特質使蠍子有些神秘。");
		}
		if (a == 11 && b >= 1 && b >= 23&&b<31 || a == 12 && b >= 1 && b <= 21) {
			System.out.println("你是射手座的，特質:射手座是火相星座。射手非常主動、外向。");
		}

		if (a == 12 && b >= 1 && b >= 22&&b<32 || a == 1 && b >= 1 && b <= 20) {
			System.out.println("你是魔羯座的，特質:魔羯座是土相星座的領頭人。是黃道12宮裏最穩定最努力工作的星座。");
		}

		

	}
}
