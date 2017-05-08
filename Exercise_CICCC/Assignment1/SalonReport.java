package com.example.java;
import java.util.*;

import static java.util.Comparator.comparing;

/**
 * Created by senafunakubo on 2017-05-07.
 */
public class SalonReport {

    private int time;

    public static void main(String[] args)
    {
       Service cut = new Service("Cut",8.00f,15);
       Service shampoo = new Service("Shampoo",4.00f,10);
       Service manicure = new Service("Manicure",18.00f,30);
       Service style = new Service("Style",48.00f,55);
       Service permanent = new Service("Permanent",18.00f,35);
       Service trim = new Service("Trim",6.00f,5);


        ArrayList<Service> serviceList = new ArrayList<Service>();
        serviceList.add(cut);
        serviceList.add(shampoo);
        serviceList.add(manicure);
        serviceList.add(style);
        serviceList.add(permanent);
        serviceList.add(trim);

        System.out.println("");
        System.out.println("Please check our service.");
        System.out.println("");
        displayDetail(serviceList);
        chooseMenu();

        int choose;
        Scanner chooseService = new Scanner(System.in);
        choose = chooseService.nextInt();

        while(choose<7) {
            switch (choose) {
                case 1:
                    serviceList.stream().sorted(comparing(Service::getDescription)).forEach(s -> System.out.println("Descriotion:" + s.getDescription() + " Price:$" + s.getPrice() + " Time:" + s.getTime() + "m"));
                    break;
                case 2:
                    serviceList.stream().sorted(comparing(Service::getDescription).reversed()).forEach(s -> System.out.println("Descriotion:" + s.getDescription() + " Price:$" + s.getPrice() + " Time:" + s.getTime() + "m"));
                    break;
                case 3:
                    serviceList.stream().sorted(comparing(Service::getPrice)).forEach(s -> System.out.println("Descriotion:" + s.getDescription() + " Price:$" + s.getPrice() + " Time:" + s.getTime() + "m"));
                    break;
                case 4:
                    serviceList.stream().sorted(comparing(Service::getPrice).reversed()).forEach(s -> System.out.println("Descriotion:" + s.getDescription() + " Price:$" + s.getPrice() + " Time:" + s.getTime() + "m"));
                    break;
                case 5:
                    serviceList.stream().sorted(comparing(Service::getTime)).forEach(s -> System.out.println("Descriotion:" + s.getDescription() + " Price:$" + s.getPrice() + " Time:" + s.getTime() + "m"));
                    break;
                case 6:
                    serviceList.stream().sorted(comparing(Service::getTime).reversed()).forEach(s -> System.out.println("Descriotion:" + s.getDescription() + " Price:$" + s.getPrice() + " Time:" + s.getTime() + "m"));
                    break;
                case 7:
                    break;
                default:
                    System.out.println("It's invalid.");
                    break;
            }
            System.out.println("");
            System.out.println("Type here:");
            choose = chooseService.nextInt();
        }

        if(choose ==7){
            System.out.println("See you next time!");
        }
    }


    public static void displayDetail(ArrayList array){

        System.out.println("[MENU]");

        for (int i = 0; i < array.size();i++) {
            System.out.print(String.format("%s", ((Service) array.get(i)).getDescription()));
            System.out.print(String.format(" $%s", ((Service) array.get(i)).getPrice()));
            System.out.println(String.format(" %sm", ((Service) array.get(i)).getTime()));
        }
        System.out.println("");

    }

    public static void chooseMenu(){
        System.out.println("You can set the order of these services.");
        System.out.println("[1] Ascending Description");
        System.out.println("[2] Descending Description");
        System.out.println("[3] Ascending Price");
        System.out.println("[4] Descending Price");
        System.out.println("[5] Ascending Time");
        System.out.println("[6] Descending Time");
        System.out.println("[7] Finish this service");
        System.out.println("Type here:");

    }


}
