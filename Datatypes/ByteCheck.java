public class ByteCheck{
public static void main(String[]args)
{
byte b= -128;
System.out.println(b);
byte j= 126;  //it cant accept values after 127
System.out.println(j);
byte h= 127;
System.out.println(h);

short s = -32768;
System.out.println(s);
short t= -32000;
System.out.println(t);
short u = -32767;
System.out.println(u);

float f = 1.12345679056f;
System.out.println(f);

double i = 1.12345678909;
System.out.println(i);

char c = 'A';
System.out.println(c);
char c1 = 'B';
System.out.println(c1);

boolean o = true;
System.out.println(o);

boolean l = false;
System.out.println(l);

}
} 