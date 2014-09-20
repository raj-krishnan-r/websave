import java.io.*;
import java.util.Scanner;
public class strip{
    public static void main(String args[])
    {
        urlstrip();
    }
    public static void urlstrip()
    {
        int start=0;
        String content = new String();
        char container[];
        container = new char[100];
        char c;
        //Target URL
        content = "this string contains an URL like http://www.raj.com in between ";
        
        for(int i=0;i<content.length();i++)
        {
            c=content.charAt(i);
   
            if((content.length()-i)>7)
            {
            if(c=='h'&&content.charAt(i+6)=='/')
            {
                while(content.charAt(i)!=' ')
                {
                  System.out.print(content.charAt(i));
                  container[start]=content.charAt(i);
                  start++;
                  i++;
                  if(i==content.length())
                  {
                      break;
                  }
                }
            }
            }
            
            
        }
    }
}
