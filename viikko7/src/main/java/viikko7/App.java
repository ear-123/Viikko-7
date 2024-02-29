package viikko7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println( "Tervetuloa Gifu-järjestelmään" );
        System.out.println("Mille yliopistolle haluat ottaa järjestelmän käyttöön?");
        Gifu gifu = new Gifu(scan.nextLine());

        boolean exit = false;

        while (!exit) {
            System.out.println("1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille, 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma");
            
            if (scan.hasNextLine()) {
                int option = Integer.parseInt(scan.nextLine());

                switch (option) {
                    case 1:
                        System.out.println("Anna kurssin nimi:");
                        String name = scan.nextLine();

                        System.out.println("Anna kurssin ID:");
                        String id = scan.nextLine();

                        System.out.println("Anna kurssin maksimi opiskelijamäärä:");
                        int maxNumberOfStudents = Integer.parseInt(scan.nextLine());

                        gifu.addCourse(new Course(maxNumberOfStudents, name, id));
                        break;
                    case 0:
                        exit = true;
                        break;
                
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        
        
        
        }

        System.out.println("Kiitos ohjelman käytöstä.");
        scan.close();


    }
}
