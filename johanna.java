import java.io.*;
class list12
{
public static void main(String args[])
{
RandomAccessFile newfile;
try
{
newfile = new RandomAccessFile("new.txt","rw");
newfile.seek(newfile.length());
DataInputStream in= new DataInputStream(System.in);
System.out.println("enter text to be updated");
String s=in.readLine();
newfile.writeBytes(s);
newfile.close();
}
catch(IOException e)
{
System.out.println(e);
}
}
}
