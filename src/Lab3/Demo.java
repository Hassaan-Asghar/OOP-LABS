package Lab3;
import java.util.Scanner;

import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details: ");

        System.out.println("Enter Title: ");
        String title = sc.nextLine();

        System.out.println("Enter Artist Name: ");
        String Artist_name = sc.nextLine();

        System.out.println("Enter Nationality: ");
        String nationality = sc.nextLine();

        System.out.println("Enter Rating: ");
        double rating = sc.nextDouble();

        System.out.println("Enter Duration: ");
        double duration = sc.nextDouble();

        System.out.println("Enter Genre: ");
        String genre = sc.nextLine();

        System.out.println("Enter Album Name: ");
        String album = sc.nextLine();

        System.out.println("Enter Release Date: ");

        System.out.println("Enter Day");
        int day = sc.nextInt();

        System.out.println("Enter month");
        int month = sc.nextInt();

        System.out.println("Enter Year");
        int year = sc.nextInt();

        Music M6 = new Music(title,new Artist(Artist_name,nationality,rating),duration,genre,album,new Date(day,month,year));
        System.out.println(M6);

       // System.out.println("Title: " + title +"\nArtist Name: " + Artist_name + "\nDuration: " + duration );




//        Music M1 = new Music("Pehli dafa", new Artist("Atif Aslam", "Pakistani", 4.9), 5.45, "Nature", "Songs 2023", new Date(22, 9, 2023));
//        //System.out.println(M1);
//        Music M2 = new Music("Heriye", new Artist("Arijit Singh", "Indian", 4.8), 5.0, "Sad", "Songs 2021", new Date(23, 8, 2021));
//        //System.out.println(M2);
//        Music M3 = new Music("Jhoom", new Artist("Ali Zafar", "Pakistani", 4.7), 4.50, "Enternaing", "Songs 2022", new Date(24, 7, 2022));
//        //System.out.println(M3);
//        Music M4 = new Music("Tera ghata", new Artist("Neha", "Indian", 4.6), 4.50, "Happy", "Songs 2020", new Date(25, 6, 2020));
//        //System.out.println(M4);
//        Music M5 = new Music("Tere bin", new Artist("Nusrat Fateh ALI Khan", "Pakistani", 5.0), 4.50, "Amazing", "Songs 2024", new Date(26, 5, 2024));
//       // System.out.println(M5);
//
//        if (M1.equals(M2))
//            System.out.println("equals");
//        else
//            System.out.println("Not equals");
//
//
//        Music list[] = new Music[5];
//
//        list[0] = M1;
//        list[1] = M2;
//        list[2] = M3;
//        list[3] = M4;
//        list[4] = M5;
//        for(Music  m : list){
//            System.out.println(m);
//        }
////        for (int i = 0; i <= 4; i++) {
////            System.out.println(list[i]);
////        }

    }
}



