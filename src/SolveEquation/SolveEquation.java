package SolveEquation;

import java.io.*;
import java.util.*;
public class SolveEquation
{
void print()throws IOException
{
	
char ch='y';
System.out.println("��⼸�η��̣�1��һ�� 2������ 3������");
Scanner sLine=new Scanner(System.in);
int pm=sLine.nextInt();
if(pm==1)
{
System.out.println("��ѡ�����һԪһ�η���:");
SolveEquation.SolveSimpleEquation fc=new SolveEquation().new SolveSimpleEquation();
fc.SolveSimpleEquation();
}
else if(pm==2)
{
System.out.println("��ѡ�����һԪ���η���:");
SolveEquation.SolveQuadraticEquation fc=new SolveEquation().new SolveQuadraticEquation();
fc.SolveQuadraticEquation();
}
else if(pm==3)
{
System.out.println("��ѡ�����һԪ���η���:");
SolveEquation.SolveCubicEquation fc=new SolveEquation().new SolveCubicEquation();
fc.SolveCubicEquation();
}
else
{
print();
}
System.out.println("���Ƿ������:(y/n)");
ch=(char)System.in.read();
System.in.skip(2);
if(ch=='y')
{
print();
}
else if(ch=='n')
{
System.out.println("Good luck!");
}
else
{
print();
}
}

public static void main (String args[]) throws IOException
{
SolveEquation se=new SolveEquation();
se.print();
}
interface I1
{
void SolveCubicEquation();
}
interface I2
{
void SolveQuadraticEquation();
}
interface I3
{
void SolveSimpleEquation();
}

class SolveCubicEquation implements I1
{
public void SolveCubicEquation()
{
System.out.println("����������һԪ���η���mx^3+nx^2+tx+s=0���ĸ�ϵ��");
Scanner sce=new Scanner(System.in);
double m=sce.nextDouble();
double n=sce.nextDouble();
double t=sce.nextDouble();
double s=sce.nextDouble();
if(m==0)
{
System.out.print("�������!");
}
else
{
double a=n/m;
double b=t/m;
double c=s/m;
double q=(a*a-3*b)/9;
double r=(2*a*a*a-9*a*b+27*c)/54;
if(r*r<q*q*q)
{
System.out.println("�˷�����������:");
t=Math.acos(r/Math.sqrt(q*q*q));
double x1=-2*Math.sqrt(q)*Math.cos(t/3)-a/3;
double x2=-2*Math.sqrt(q)*Math.cos((t+2*Math.PI)/3)-a/3;
double x3=-2*Math.sqrt(q)*Math.cos((t-2*Math.PI)/3)-a/3;
System.out.println("x1="+x1+","+"x2="+x2+","+"x3="+x3);
}
else
{
System.out.println("�˷���ֻ��һ����:");
int sgn=(r>=0)?1:-1;
double u=-sgn*Math.pow((Math.abs(r)+Math.sqrt(r*r-q*q*q)),1./3);
double v=(u!=0)?q/u:0;
double x1=u+v-a/3;
System.out.println("x="+x1);
}
}
}
}
class SolveQuadraticEquation implements I2
{
public void SolveQuadraticEquation()
{
System.out.println("����������һԪ���η���ax^2+bx+c=0������ϵ��");
Scanner sce=new Scanner(System.in);
double a=sce.nextDouble();
double b=sce.nextDouble();
double c=sce.nextDouble();
if(a==0)
{
System.out.print("�������!");
}
else
{
double d=b*b-4*a*c;
if(d>0)
{
double x1=(-b+Math.sqrt(d))/2*a;
double x2=(-b+Math.sqrt(d))/2*a; System.out.println("������ʵ��x1="+x1+","+"x2="+x2);
}
else if(d==0)
{
System.out.println("��һ��ʵ��"+(-b/2*a));
}
else if(d<0)
{
double Re=-b/(2*a);
double Im=Math.sqrt(-d)/(2*a);
System.out.println("ʵ��="+Re+" "+"�鲿="+Im);
}
}
}
}
class SolveSimpleEquation implements I3
{
public void SolveSimpleEquation()
{
System.out.println("����������һԪһ�η���ax+b=0������ϵ��");
Scanner sce=new Scanner(System.in);
double a=sce.nextDouble();
double b=sce.nextDouble();
if(a==0)
{
System.out.print("�������!");
}
else
{
System.out.println("���̵ĸ���x="+(-b/a));
}
}
}
}