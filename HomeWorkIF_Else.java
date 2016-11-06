package lesson2;

public class HomeWorkIF_Else {

	public static void main(String[] args) {
		/*
		 * 1. Створити програму, що перевіряє і повідомляє на екран, чи є ціле
		 * число записане в змінну n, парним або непарним.
		 */
		int o = 17;
		if (o % 2 == 0) {
			System.out.println("Число є парним");
		} else {
			System.out.println("Число є не парним");
		}
		/*
		 * 2. Створити програму, що виводить на екран найближче до 10 з двох
		 * чисел, записаних в змінні m і n. Наприклад, серед чисел 8,5 і 11,45
		 * найближче до десяти 11,45.
		 */
		int y = 10;
		int m = 7;
		int n = 15;
		int e = y - m;
		int f = y - n;
		if (Math.abs(e) > Math.abs(f)) {
			System.out.println("Число m ближче до 10");
		} else if (Math.abs(f) > Math.abs(e)) {
			System.out.println("Число n ближче до 10");
		} else {
			System.out.println("Числа однаково близькі");
		}
		/*
		 * 3. У три змінні a, b і c записані три дійсних числа. Створити
		 * програму, яка буде знаходити і виводити на екран речові коріння
		 * квадратного рівняння ax² + bx + c = 0, або повідомляти, що коріння
		 * немає.
		 */
		double a=4;
		double b= 34;
		double c=5;
		double x=0;
		double x1=0;
		double x2=0;
		double desc= b*b - (4*a*c);
		double sqd= Math.sqrt(desc);
		if(desc<0){
			System.out.println("Розв'язків немає");
		}else if(desc==0){
			x=-b/2;
			System.out.println("x = "+x);
		}else{
			x1=(-b-sqd)/2;
			x2=(-b+sqd)/2;
			System.out.println("x1 = "+x1);
			System.out.println("x2 = " +x2);
		}
		
	}
}
