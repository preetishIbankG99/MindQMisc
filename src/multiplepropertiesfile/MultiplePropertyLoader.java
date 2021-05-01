package multiplepropertiesfile;

import java.io.FileInputStream;
import java.util.Properties;

public class MultiplePropertyLoader {
	public static Properties prop;
	public static void main(String[] args) {
	 try {
   prop = new Properties();
   //prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("H:\\photonwp\\MindQ\\src\\multiplepropertiesfile\\m1.properties"));
  // prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("H:\\photonwp\\MindQ\\src\\multiplepropertiesfile\\m2.properties"));
   //prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("H:\\photonwp\\MindQ\\src\\multiplepropertiesfile\\m3.properties"));
         prop.load(new FileInputStream("H:\\photonwp\\MindQ\\src\\multiplepropertiesfile\\m1.properties"));
         System.out.println("::: Property File 1 Data :::");
         System.out.println(prop.getProperty("ENCRYPTION_KEY"));
         System.out.println(prop.getProperty("USERNAME"));
         System.out.println(prop.getProperty("PASSWORD"));
         System.out.println();
         
         prop.load(new FileInputStream("H:\\photonwp\\MindQ\\src\\multiplepropertiesfile\\m2.properties"));
         System.out.println("::: Property File 2 Data :::");
         System.out.println(prop.getProperty("ENCRYPTION_KEY1"));
         System.out.println(prop.getProperty("USERNAME1"));
         System.out.println(prop.getProperty("PASSWORD1"));
         System.out.println();
         prop.load(new FileInputStream("H:\\photonwp\\MindQ\\src\\multiplepropertiesfile\\m3.properties"));
         System.out.println("::: Property File 3 Data :::");
         System.out.println(prop.getProperty("ENCRYPTION_KEY2"));
         System.out.println(prop.getProperty("USERNAME2"));
         System.out.println(prop.getProperty("PASSWORD2"));
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}
