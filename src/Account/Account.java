package Account;
import java.util.Scanner;
import java.io.*;
class Bank{
	double account=0;
	String name;
	int id;
	double time;
	void GetName(String name) {
		this.name=name;
	}
	void GetId(int id) {
		this.id=id;
	}
	void GetTime(double time) {
		this.time=time;
	}
	void save(double money) {
		account+=money;
	}
	void withdrawal(double money) {
		account-=money;
	}
	void show() {
		System.out.println("�������Ϊ��"+account);
	}
	double sum() {
		return account;
	}
	void printInfo() {
		System.out.println(name+" "+id+" ");
		System.out.println("����ʱ��:"+time+" ��� "+account);
	}	
}

public class Account {
	public static void main(String[] args) {
		Bank account;
		account=new Bank();
		System.out.print("������");
		Scanner sc = new Scanner(System.in); 
		String name=sc.nextLine();
		System.out.print("ID��");
		int id=sc.nextInt();
		System.out.print("����ʱ�䣺");
		double time=sc.nextDouble();
		account.GetName(name);
		account.GetId(id);
		account.GetTime(time);		
		int num=0;
		while (num!=5) {
		System.out.println("��ѡ��Ҫ���еĲ�����1. ��� 2. ȡ�� 3. ��ѯ 4. ��ʾ�˻� 5. �˳� ");
		num=sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("��������Ҫ�����money��");
			double money1=sc.nextDouble();
			account.save(money1);
			System.out.println("���ɹ�!�Ѵ���"+money1+"Ԫ�����Ϊ"+account.sum()+"Ԫ");
			break;
		case 2:
			System.out.println("��������Ҫȡ�ߵ�money��");
			double money2=sc.nextDouble();
			account.withdrawal(money2);
			System.out.println("ȡ��ɹ�!�Ѵ���"+money2+"Ԫ�����Ϊ"+account.sum()+"Ԫ");
			break;
		case 3:
			account.show();
			break;
		case 4:
			account.printInfo();	
			break;
		}
		}	
	}
}
