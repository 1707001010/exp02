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
		System.out.println("您的余额为："+account);
	}
	double sum() {
		return account;
	}
	void printInfo() {
		System.out.println(name+" "+id+" ");
		System.out.println("开户时间:"+time+" 余额 "+account);
	}	
}

public class Account {
	public static void main(String[] args) {
		Bank account;
		account=new Bank();
		System.out.print("姓名：");
		Scanner sc = new Scanner(System.in); 
		String name=sc.nextLine();
		System.out.print("ID：");
		int id=sc.nextInt();
		System.out.print("开户时间：");
		double time=sc.nextDouble();
		account.GetName(name);
		account.GetId(id);
		account.GetTime(time);		
		int num=0;
		while (num!=5) {
		System.out.println("请选择要进行的操作：1. 存款 2. 取款 3. 查询 4. 显示账户 5. 退出 ");
		num=sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("请输入您要存入的money：");
			double money1=sc.nextDouble();
			account.save(money1);
			System.out.println("存款成功!已存入"+money1+"元，余额为"+account.sum()+"元");
			break;
		case 2:
			System.out.println("请输入您要取走的money：");
			double money2=sc.nextDouble();
			account.withdrawal(money2);
			System.out.println("取款成功!已存入"+money2+"元，余额为"+account.sum()+"元");
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
