import java.util.*;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
public class message
{
public static  Map<Map<String,String>,Map<String,String>> hmap=new HashMap<Map<String,String>,Map<String,String>>();
public static  Map<String,String> x=new HashMap<String,String>();
public static  Map<String,String> y=new HashMap<String,String>();
public static  Map<String,String> z=new HashMap<String,String>();
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
Calendar cal=Calendar.getInstance();
DateFormat dateformat =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
Date date=new Date();
String s=dateformat.format(date);
System.out.println("enter the number of messages");
int h=ob.nextInt();
while(h-->0)
{
go(ob,dateformat,date);
}
System.out.println("for the message you need to type the iterations for getting the message and phone numbers ");
prin(ob,dateformat,date,ob.nextInt());
}
public static void go(Scanner ob,DateFormat dateformat,Date date)
{
System.out.println("enter the number,name and the message ");
String s=ob.next();
y.put(s,dateformat.format(date));
x.put(s,ob.next());
z.put(s,ob.next());
hmap.put(y,x);
}
public static void prin(Scanner ob,DateFormat dateformat,Date date,int g)
{
  while(g-->0)
  {
    System.out.println("enter the number");
    String t=ob.next();
    System.out.print(y.get(t)+":  ");
    System.out.print(x.get(t)+":  ");
    System.out.print(z.get(t));
  }
}
}
