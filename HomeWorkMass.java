package homework;

import java.util.Random;

public class HomeWorkMass {
	public static void main(String[] args) {
		/*
		 * Масиви
		 * 
		 * 1. Створіть масив з усіх парних чисел від 2 до 20 і виведіть елементи
		 * масиву на екран спочатку в рядок, відокремлюючи один елемент від
		 * іншого прогалиною, а потім в стовпчик (відокремлюючи один елемент від
		 * іншого початком нового рядка). Перед створенням масиву подумайте,
		 * якого він буде розміру.
		 */
		int a = 0;
		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 0)
				a++;
		}
		int[] Masss = new int[a];
		for (int i = 2, b = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				Masss[b] = i;
				System.out.print(Masss[b] + " ");
				b++;
			}
		}
		System.out.println(" ");
		for (int i = 0; i < Masss.length; i++) {
			System.out.println(Masss[i]);
		}

		/*
		 * 2. Створіть масив з усіх непарних чисел від 1 до 99, виведіть його на
		 * екран у рядок, а потім цей же масив виведіть на екран теж в рядок,
		 * але в зворотному порядку (99 97 95 93 ... 7 5 3 1).
		 */

		int c = 0;
		for (int i = 1; i <= 99; i++) {
			if (i % 2 != 0)
				c++;
		}
		int[] Mass = new int[c];
		for (int i = 1, d = 0; i <= 99; i++) {
			if (i % 2 != 0) {
				Mass[d] = i;
				System.out.print(Mass[d] + " ");
				d++;
			}
		}
		System.out.println(" ");
		for (int i = Mass.length - 1; i >= 0; i--) {
			System.out.println(Mass[i]);
		}
		/*
		 * 3. Створіть масив з 15 випадкових цілих чисел з відрізка [0; 9].
		 * Виведіть масив на екран. Підрахуйте скільки в масиві парних елементів
		 * і виведете цю кількість на екран на окремому рядку.
		 */
		int e = 0;
		int[] Mass1 = new int[15];
		for (int i = 0; i < Mass1.length; i++) {
			Random rnd = new Random();
			Mass1[i] = rnd.nextInt(10);
			System.out.print(Mass1[i] + " ");
			if (Mass1[i] > 0 & Mass1[i] % 2 == 0)
				e++;
		}
		System.out.println(" ");
		System.out.println("Всего в массиве " + e + " четных");
		/*
		 * 4. Створіть масив з 8 випадкових цілих чисел з відрізка [1; 10].
		 * Виведіть масив на екран у рядок. Замініть кожен елемент з непарним
		 * індексом на нуль. Знову виведете масив на екран на окремому рядку.
		 */
		int[] Mass2 = new int[8];
		for (int i = 0; i < Mass2.length; i++) {
			Mass2[i] = (int) (Math.random() * 9 + 1);
			System.out.print(Mass2[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < Mass2.length; i++) {
			if (Mass2[i] % 2 != 0)
				Mass2[i] = 0;
			System.out.print(Mass2[i] + " ");
		}
		System.out.println("");
		/*
		 * 5. Створіть 2 масиви з 5 випадкових цілих чисел з відрізка [0; 5]
		 * кожен, виведіть масиви на екран у двох окремих рядках. Порахуйте
		 * середнє арифметичне елементів кожного масиву і повідомте, для якого з
		 * масивів це значення виявилося більше (або повідомте, що їх середні
		 * арифметичні рівні).
		 */
		double sumMas1 = 0;
		double sumMas2 = 0;
		int[] Mas1 = new int[5];
		for (int i = 0; i < Mas1.length; i++) {
			Mas1[i] = (int) (Math.random() * 5);
			System.out.print(Mas1[i] + " ");

			sumMas1 += (double) Mas1[i] / Mas1.length;
		}
		System.out.println(" ");
		int[] Mas2 = new int[5];
		for (int i = 0; i < Mas2.length; i++) {
			Mas2[i] = (int) (Math.random() * 5);
			System.out.print(Mas2[i] + " ");
			sumMas2 += (double) Mas2[i] / Mas2.length;
		}
		System.out.println(" ");
		if (sumMas1 == sumMas2)
			System.out
					.println("Середнє арифметичне значення двох массивів рівне");
		else {
			if (sumMas1 > sumMas2)
				System.out
						.println("Середнє арифметичне значення першого масива більше ");
			else
				System.out
						.println("Середнє арифметичне значення другого масива більше ");
		}
		/*
		 * 6. Створіть масив з 4 випадкових цілих чисел з відрізка [10; 99],
		 * виведіть його на екран у рядок. Визначити і вивести на екран
		 * повідомлення про те, чи є масив строго зростаючої послідовністю.
		 */
		int[] Mass6 = new int[4];
		for (int i = 0; i < Mass6.length; i++) {
			Mass6[i] = (int) (Math.random() * 89 + 10);
			System.out.print(Mass6[i] + " ");
		}
		System.out.println("");
		if (Mass6[0] < Mass6[1] & Mass6[1] < Mass6[2] & Mass6[2] < Mass6[3]) {
			System.out.println("Цей масив строго зростаючої послідовності");
		}
		/*
		 * 7. Створіть масив з 20-ти перших чисел Фібоначчі і виведіть його на
		 * екран. Нагадуємо, що перший і другий члени послідовності рівні
		 * одиницям, а кожен наступний - сумою двох попередніх.
		 */
		int[] Mass7 = new int[20];
		Mass7[0] = 1;
		Mass7[1] = 1;
		System.out.print(Mass7[0] + " " + Mass7[1] + " ");
		for (int i = 0; i < Mass7.length; i++) {
			if (i >= 2) {

				Mass7[i] = Mass7[i - 2] + Mass7[i - 1];
				System.out.print(Mass7[i] + " ");
			}

		}
		System.out.println(" ");
		/*
		 * 8. Створіть масив з 12 випадкових цілих чисел з відрізка [-15; 15].
		 * Визначте який елемент є в цьому масиві максимальним і повідомте
		 * індекс його останнього входження в масив.
		 */

		/*
		 * 9. Створіть два масиви з 10 цілих випадкових чисел з відрізка [1; 9]
		 * і третій масив з 10 дійсних чисел. Кожен елемент з i-им індексом
		 * третього масиву повинен дорівнювати відношенню елементу з першого
		 * масиву з i-им індексом до елементу з другого масиву з i-им індексом.
		 * Вивести всі три масиву на екран (кожен на окремому рядку), потім
		 * вивести кількість цілих елементів в третьому масиві.
		 */
		int count = 0;
		int[] mass11 = new int[10];
		int[] mass22 = new int[10];
		double[] mass33 = new double[10];
		for (int z = 0; z < 10; z++) {
			mass11[z] = (int) (Math.random() * 8 + 1);
			System.out.print(mass11[z] + " ");
		}
		System.out.println("");
		for (int z = 0; z < 10; z++) {
			mass22[z] = (int) (Math.random() * 8 + 1);
			System.out.print(mass22[z] + " ");
		}
		System.out.println("");
		for (int z = 0; z < 10; z++) {
			mass33[z] = (double) mass11[z] / mass22[z];
			System.out.print(mass33[z] + " ");
			if (mass11[z] % mass22[z] == 0) {
				count++;
			}

		}
		System.out.println(" ");
		System.out.println("Цілих чисел в масиві №3 = " + count);
		/*
		 * 10. Створіть масив з 11 випадкових цілих чисел з відрізка [-1; 1],
		 * виведіть масив на екран у рядок. Визначте який елемент зустрічається
		 * в масиві найчастіше і виведіть про це повідомлення на екран. Якщо два
		 * якихось елемента зустрічаються однакову кількість разів, то не
		 * виводьте нічого.
		 */
		  int am=0;
		  int a0=0;
		  int a1=0;
	        int[] Mas = new int[11];
	        for(int q=0; q<Mas.length; q++){
	            Mas[q]=(int)(Math.random()*2)-1;
	            System.out.print(Mas[q]+" ");
	            if(Mas[q]< 0)am++;
	            if(Mas[q]==0)a0++;
	            if(Mas[q]>0)a1++;
	            if(q==Mas.length-1){
	                if(am>a0&am>a1)
	                    System.out.println("Чаще всего встречается -1");
	                if(a0>am&a0>a1)
	                    System.out.println("Чаще всего встречается 0");
	                if(a1>am&a1>a0)
	                    System.out.println("Чаще всего встречается 1");
	        }
	        }
	}
}
