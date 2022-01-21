// 별그리기1
public class HW_0119 {

public static void main(String[] args){
	String star1 = "*";
	StringBuilder stars1 = new StringBuilder();
	for (int k=5; k>=1; k--) {
		for (int j=k; j>=1; j--) {
			stars1.append(star1);
		};
	System.out.println(stars1);
	stars1.delete(0, k);
	};
	
	String star2 = "*";
	StringBuilder stars2 = new StringBuilder();
	for (int i=5; i>=1; i--) {
		stars2.append(star2);
		System.out.println(stars2);
	};
}
}


//<repeat매소드 사용>
//String star1 = "*";
//for (int k=5; k>=1; k--) {
//	System.out.println(star1.repeat(k));
//};
//
