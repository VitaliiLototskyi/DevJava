package homework;

import java.util.Random;

public class HomeWorkMass {
	public static void main(String[] args) {
		/*
		 * ������
		 * 
		 * 1. ������� ����� � ��� ������ ����� �� 2 �� 20 � ������� ��������
		 * ������ �� ����� �������� � �����, ������������ ���� ������� ��
		 * ������ ����������, � ���� � �������� (������������ ���� ������� ��
		 * ������ �������� ������ �����). ����� ���������� ������ ���������,
		 * ����� �� ���� ������.
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
		 * 2. ������� ����� � ��� �������� ����� �� 1 �� 99, ������� ���� ��
		 * ����� � �����, � ���� ��� �� ����� ������� �� ����� ��� � �����,
		 * ��� � ���������� ������� (99 97 95 93 ... 7 5 3 1).
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
		 * 3. ������� ����� � 15 ���������� ����� ����� � ������ [0; 9].
		 * ������� ����� �� �����. ϳ�������� ������ � ����� ������ ��������
		 * � �������� �� ������� �� ����� �� �������� �����.
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
		System.out.println("����� � ������� " + e + " ������");
		/*
		 * 4. ������� ����� � 8 ���������� ����� ����� � ������ [1; 10].
		 * ������� ����� �� ����� � �����. ������ ����� ������� � ��������
		 * �������� �� ����. ����� �������� ����� �� ����� �� �������� �����.
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
		 * 5. ������� 2 ������ � 5 ���������� ����� ����� � ������ [0; 5]
		 * �����, ������� ������ �� ����� � ���� ������� ������. ���������
		 * ������ ����������� �������� ������� ������ � ��������, ��� ����� �
		 * ������ �� �������� ��������� ����� (��� ��������, �� �� ������
		 * ���������� ���).
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
					.println("������ ����������� �������� ���� ������� ����");
		else {
			if (sumMas1 > sumMas2)
				System.out
						.println("������ ����������� �������� ������� ������ ����� ");
			else
				System.out
						.println("������ ����������� �������� ������� ������ ����� ");
		}
		/*
		 * 6. ������� ����� � 4 ���������� ����� ����� � ������ [10; 99],
		 * ������� ���� �� ����� � �����. ��������� � ������� �� �����
		 * ����������� ��� ��, �� � ����� ������ ��������� �����������.
		 */
		int[] Mass6 = new int[4];
		for (int i = 0; i < Mass6.length; i++) {
			Mass6[i] = (int) (Math.random() * 89 + 10);
			System.out.print(Mass6[i] + " ");
		}
		System.out.println("");
		if (Mass6[0] < Mass6[1] & Mass6[1] < Mass6[2] & Mass6[2] < Mass6[3]) {
			System.out.println("��� ����� ������ ��������� �����������");
		}
		/*
		 * 7. ������� ����� � 20-�� ������ ����� Գ������� � ������� ���� ��
		 * �����. ��������, �� ������ � ������ ����� ����������� ���
		 * ��������, � ����� ��������� - ����� ���� ���������.
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
		 * 8. ������� ����� � 12 ���������� ����� ����� � ������ [-15; 15].
		 * �������� ���� ������� � � ����� ����� ������������ � ��������
		 * ������ ���� ���������� ��������� � �����.
		 */

		/*
		 * 9. ������� ��� ������ � 10 ����� ���������� ����� � ������ [1; 9]
		 * � ����� ����� � 10 ������ �����. ����� ������� � i-�� ��������
		 * �������� ������ ������� ���������� ��������� �������� � �������
		 * ������ � i-�� �������� �� �������� � ������� ������ � i-�� ��������.
		 * ������� �� ��� ������ �� ����� (����� �� �������� �����), ����
		 * ������� ������� ����� �������� � �������� �����.
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
		System.out.println("ֳ��� ����� � ����� �3 = " + count);
		/*
		 * 10. ������� ����� � 11 ���������� ����� ����� � ������ [-1; 1],
		 * ������� ����� �� ����� � �����. �������� ���� ������� �����������
		 * � ����� ��������� � ������� ��� �� ����������� �� �����. ���� ���
		 * ������� �������� ������������ �������� ������� ����, �� ��
		 * �������� �����.
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
	                    System.out.println("���� ����� ����������� -1");
	                if(a0>am&a0>a1)
	                    System.out.println("���� ����� ����������� 0");
	                if(a1>am&a1>a0)
	                    System.out.println("���� ����� ����������� 1");
	        }
	        }
	}
}
