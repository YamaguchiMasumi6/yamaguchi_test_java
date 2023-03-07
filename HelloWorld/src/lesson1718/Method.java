package lesson1718;

public class Method {

	public static void main(String[] args) {
		// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を呼び出してください。
		System.out.println("Q1の出力");
		hello();
		// Q2：引数として整数を渡すと+1してメソッド（関数）関数を呼び出してコンソールに出力してください。
		System.out.println("Q2の出力");
		methodA(5);		
		// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
		System.out.println("Q3の出力");
		System.out.println(add(5, 10));		
		// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
		System.out.println("Q4の出力");
		System.out.println(add(3.14, 5.5));		
		// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）
		//     を呼び出して、ループ文を用いてそれぞれの数をコンソールに出力してください。
		System.out.println("Q5の出力");
		int[] nums = Num(3);
		for(int i : nums) {
			System.out.println(i);
		}		
		// Q6：Q5で作成した関数を用いて、配列の要素の平均値を返すメソッド（関数）を呼び出してコンソールに出力してください。
		System.out.println("Q6の出力");
		int[] nums2 = Num2(5);
		int sum = 0;
		for(int value : nums2) {
			System.out.println(value); // 格納された数字の確認
			sum += value;
		}
		System.out.println(sum /nums2.length);
	}
	
	// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
	public static void hello() {
		System.out.println("Hello Java");
	}
	// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
	public static void methodA(int a) {
		System.out.println(++a);
	}
	// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	public static int add(int x, int y) {
		return x * y;
	}	
	// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
	public static double add(double x, double y) {
		return x * y;
	}
	// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
	public static int[] Num(int num) {
	int[] nums = new int[num];
		for(int i = 0; i < nums.length; i++) { // 配列の数だけ繰り返す
			nums[i] = new java.util.Random().nextInt(101); // 1～100までのランダムな数字を作成
		}
	return nums;
	}
	// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
	//     配列の要素の平均値を返すメソッド（関数）を作成してください。
	public static int[] Num2(int num2) {
		int[] nums2 = Num(num2);
		return nums2;
	}
	
}
