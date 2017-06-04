package May31_Sets;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by senafunakubo on 2017-06-03.
 */
public class Domains {
    public static void main(String[] args) {
        Set<String> domains = new TreeSet<String>();
        domains.add("dontgothere.com");
        domains.add("ohno.org");
        domains.add("badstuff.com");
        domains.add("badstuff.org");
        domains.add("badstuff.net");
        domains.add("whatintheworld.com");
        domains.add("notinthislifetime.irg");
        domains.add("letsnot.com");
        domains.add("eeewwwwww.com");

        setData(domains);

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you wanna add blocked domain?");
            String domain = scan.nextLine();


             if (!domains.contains(domain))
             {
                domains.add(domain);
                 System.out.println("\n" + domain);
                setData(domains);
             }else
             {
                 System.out.println(false);
             }

        getDataFromFile();
    }

    public static void setData(Set<String> str){
        File file = new File("blockeddomains.txt");
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(file);
            if (!file.exists()) {
                file.createNewFile();
            }
            byte[] bytesArray = str.toString().getBytes();

            for(byte b:bytesArray) {
                fos.write(b);
            }

            fos.flush();
            System.out.println("File Written Successfully\n");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the Stream");
            }
        }
//        return isSaved;
    }

    public static void getDataFromFile() {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("blockeddomains.txt"));
            String str = br.readLine();

            while (str != null) {
                System.out.println(str);
                str = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error");
            }
        }
    }

}
