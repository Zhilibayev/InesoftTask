package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Publishing> pubs = new ArrayList<>();
    public static int maxid = 0;

    public static void main(String[] args) {
        boolean firstIteration = true;
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        while (true){
            if (firstIteration){
                System.out.println("Welcome to our publishing system!!!");
                firstIteration = false;
            }

            System.out.println("Enter a command by number: \n(1) View all publications\n(2) Add new publication\n(3) Publications information\n(4) Delete a publication\n(5) Quit");

            String command = scanner.next();
            if (command.equals("1")){
                for (Publishing i: pubs) {
                    System.out.println(i.toString2());
                }
            }else if (command.equals("2")) {
                boolean stop = false;
                while (!stop) {
                    System.out.println("Enter a type of a publishing: \n(1) Book\n(2) Magazine\n(3) Booklet");
                    command = scanner.next();
                    if (command.equals("1")) {
                        stop = addNewBook(scanner);
                    } else if (command.equals("2")) {
                        stop = addNewMagazine(scanner);
                    } else if (command.equals("3")) {
                        stop = addNewBooklet(scanner);
                    } else {
                        stop = checkForRepeat("Command is wrong!", scanner);
                    }
                }
            }else if(command.equals("3")){
                System.out.println("Enter ID for a publication to show information: ");
                int id = Integer.parseInt(scanner.next());

                for (Publishing i: pubs){
                    if (i.getId() == id){
                        System.out.println(i);
                        break;
                    }
                }
            }else if (command.equals("4")){
                System.out.println("Enter ID for a publication to delete from system: ");
                int id = Integer.parseInt(scanner.next());

                for (int i = 0; i < pubs.size(); i++) {
                    if (pubs.get(i).getId() == id) {
                        pubs.remove(i);
                        break;
                    }
                }
            } else if (command.equals("5")){
                System.out.println("Session is finished.");
                break;
            }else {
                System.out.println("Wrong Command!");
            }
        }
    }

    public static boolean addNewBook(Scanner sc){
        Book b = new Book();
        b.setType("Book");
        b.setMonth(-1);
        System.out.print("Enter an author: ");
        b.setAuthor(sc.next());
        System.out.print("Enter a name: ");
        b.setName(sc.next());
        System.out.print("Enter a year: ");
        b.setYear(Integer.parseInt(sc.next()));
        System.out.print("Enter a number of pages: ");
        b.setPages(Integer.parseInt(sc.next()));
        System.out.print("Enter a publisher: ");
        b.setPublisher(sc.next());
        System.out.print("Enter a genre: ");
        b.setGenre(sc.next());
        System.out.print("Enter an abstract: ");

        b.setShortContent(sc.next());


        if (pubs.contains(b)){
            System.out.println();
            return checkForRepeat("This publication already exist!!", sc);
        }else{
            b.setId(maxid);
            maxid++;
        }
        pubs.add(b);
        return true;
    }

    public static boolean addNewMagazine(Scanner sc){
        Magazine m = new Magazine();
        m.setType("Magazine");
        m.setMonth(-1);

        System.out.print("Enter a name: ");
        m.setName(sc.next());
        System.out.print("Enter a year: ");
        m.setYear(Integer.parseInt(sc.next()));
        System.out.print("Enter a month: ");
        m.setMonth(Integer.parseInt(sc.next()));
        System.out.print("Enter a number of pages: ");
        m.setPages(Integer.parseInt(sc.next()));
        System.out.print("Enter a publisher: ");
        m.setPublisher(sc.next());
        String inf = "";
        m.setArticles(new ArrayList<>());
        List<String> list = m.getArticles();
        System.out.println("Enter articles. To stop please enter 'stop'");

        while(!((inf = sc.next()).toLowerCase().equals("stop"))){
            list.add(inf);
        }

        if (pubs.contains(m)){
            System.out.println();
            return checkForRepeat("This publication already exist!!", sc);
        }else{
            m.setId(maxid);
            maxid++;
        }
        pubs.add(m);
        return true;
    }

    public static boolean addNewBooklet(Scanner sc){

        Booklet b = new Booklet();
        b.setType("Booklet");


        System.out.print("Enter a name: ");
        b.setName(sc.next());
        System.out.print("Enter a year: ");
        b.setYear(Integer.parseInt(sc.next()));
        System.out.print("Enter a month: ");
        b.setMonth(Integer.parseInt(sc.next()));
        System.out.print("Enter a publisher: ");
        b.setPublisher(sc.next());
        System.out.print("Enter an abstract: ");
        b.setShortContent(sc.next());
        if (pubs.contains(b)){
            System.out.println();
            return checkForRepeat("This publication already exist!!", sc);
        }else{
            b.setId(maxid);
            maxid++;
        }
        pubs.add(b);
        return true;

    }

    public static boolean checkForRepeat(String message, Scanner sc){
         System.out.println(message + " Would you like to repeat? (Y/N)");
         String command = sc.next();
         if (command.toLowerCase().equals("y")){
             return false;
         }
         return true;
    }


}
