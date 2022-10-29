package hashmap;

import hashmap.service.HashMap;
import hashmap.utilties.HashMapOperations;
//import input.InputValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;

public class HashMapRunner {
    public static void main(String args[]) throws IOException {
//        BufferedReader reader = new BufferedReader();
        HashMap map = new HashMap();
        System.out.println("Hi!! Welcome to HashMaps");
        System.out.println("We provide following operations on HashMaps: ");
        System.out.println("1. Insert \n2. Delete \n3. Contains \n4. GetValueByKey \n5. Size \n6. Print");
        String str;
        try {
            do{
                System.out.println("Enter below serial numbers to perform tasks");
                System.out.println("\n1. Insert element \n2. Delete \n3" +
                        ". Contains \n4. Get value by key \n5. Size" +
                        " \n6. Print" );

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                int serialNumber = Integer.parseInt(reader.readLine());

                switch (serialNumber) {
                    case 1 :
                        HashMapOperations.insert(map);
                        break;
                    case 2 :
                        HashMapOperations.delete(map);
                        break;
                    case 3 :
                        HashMapOperations.contains(map);
                        break;
                    case 4 :
                        HashMapOperations.getValueByKey(map);
                        break;
                    case 5 :
                        HashMapOperations.size(map);
                        break;
                    case 6:
                        HashMapOperations.print(map);
                        break;

                    default:
                        System.out.println("Wrong Input!!");
                        break;
                }
                System.out.println("Do you want to perform other operation ? (y/n)");
                Scanner sc = new Scanner(System.in);
                str = sc.nextLine();
            }while(Objects.equals(str, "y"));
        }catch (Exception e)
        {
            System.out.println("Code is not executed further due to exception : " + e);
        }

    }


}
