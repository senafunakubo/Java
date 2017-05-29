package May11_Exceptions;

import java.util.Scanner;

/**
 * Created by senafunakubo on 2017-05-28.
 */

    public class productCodes {
        public static void main(String[] args) {
            String code;
            char zone;
            int district, valid = 0, banned = 0;

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter product code(Type STOP to quit) : ");
            code = scan.nextLine();

            while(!code.equals("STOP"))
            {
                try{
                    zone = code.charAt(9);
                    district = Integer.parseInt(code.substring(3, 7));
                    valid++;
                    if (zone == 'R' && district > 2000) {
                        banned++;
                    }
                } catch(StringIndexOutOfBoundsException exception) {
                    System.out.println("Improper code length : " + code);
                } catch (NumberFormatException exception) {
                    System.out.println("District is not numeric :" + code);
                }
                System.out.print("Enter product code(STOP to quit) : ");
                code = scan.nextLine();
            }
            System.out.println("# of valid code enterd :" + valid);
            System.out.println("# of banned codes enterd :" + banned);
        }
    }
