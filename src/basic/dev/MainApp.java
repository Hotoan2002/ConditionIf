package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// bai 9.1
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap m");
		 int m = sc.nextInt();
		 if (m>0) { 
			 System.out.println("m la so nguyen duong");
		 }
		 else {
			 System.out.println("m la so nguyen am"); 
		 }
		 //Bai9.2
		 	System.out.println("Nhap n");
		 int n = sc.nextInt();
		 if (n % 3 == 0){
		 System.out.println("n chia het cho 3");
		 if (n % 5 == 0) {
			 System.out.println("n chia het cho 5");
		 }
		 }
		 // bai 9.3
		 System.out.println("nhap thang trong nam");
		 int k = sc.nextInt();		 
		if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10 || k == 12 )
			System.out.println("thang co 31 ngay");
		if (k == 4 || k == 6 || k == 9 || k == 11 )
			System.out.println("thang co 30 ngay");
		if (k == 2 )
			System.out.println("thang co 28 ngay");			
		// bai 9.4 giai phuong trinh bac 2
		
		System.out.println("Nhap he so bac 2, a = ");
		 float a = sc.nextFloat();
		 System.out.println("Nhap he so bac 1, b = ");
		 float b = sc.nextFloat();
		 System.out.println("Nhap he so tu do, c = ");
		 float c = sc.nextFloat();
		 
		 if (a == 0) 
		 	{
			 if (b == 0)
			 {
				 if (c == 0)
					 System.out.println("Phuong trinh co vo so nghiem");
				 else 
					 System.out.println("Phuong trinh vo nghiem");			 
			 }
			 else 
				 System.out.println("Phuong trinh co 1 nghiem: " + "x = " + (-c / b));
		 }
		 else
		 {
		 //tinh delta
		 float delta = b*b - 4*a*c;
		 float x1;
		 float x2;
		 //tinh nghiem phuong trinh
		 if (delta <0) System.out.println("Phuong trinh vo nghiem ");
		 else if (delta == 0) {
		 x1 = (-b / (2 * a));
		 System.out.println("Phuong trinh co nghiem kep : " + "x1 = x2 = " +x1);
		 }
		 else 
		 	{
			 x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
			 x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
			 System.out.println("Phuong trinh co 2 nghiem la: " + "x1 = " + x1 + " va x2= " + x2);
		 	}
		 }
		 
		// bai 9.5
	   System.out.println("nhap q");
		int q = sc.nextInt();
	   System.out.println("nhap w");
		int w = sc.nextInt();
	   System.out.println("nhap e");
	 	int e = sc.nextInt();
		if ((q + w> e && (w + e) > q && (e + q) >w))
		{
			System.out.println(" q, w, e la ba canh cua mot tam giac ");	
		}	
		    System.out.println(" q, w, e khong phai la  ba canh cua mot tam giac ");  
	}	 		
}
