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
                        String nameNewCourse = scan.nextLine();

                        System.out.println("Anna kurssin ID:");
                        String idNewCourse = scan.nextLine();

                        System.out.println("Anna kurssin maksimi opiskelijamäärä:");
                        int maxNumberOfStudents = Integer.parseInt(scan.nextLine());

                        gifu.addCourse(new Course(maxNumberOfStudents, nameNewCourse, idNewCourse));
                        break;

                    case 3:
                        gifu.listCourses();
                        break;

                    case 2:
                        System.out.println("Anna opiskelijan nimi:");
                        String nameNewStudent = scan.nextLine();

                        System.out.println("Anna opiskelijan opiskelijanumero:");
                        String idNewStudent = scan.nextLine();

                        gifu.addStudent(new Student(nameNewStudent, idNewStudent));
                        break;

                    case 4:
                        gifu.listStudents();
                        break;

                    case 5:
                        gifu.listCourses();
                        System.out.println("Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero:");
                        int courseToAddTo = Integer.parseInt(scan.nextLine());
                        gifu.listStudents();
                        System.out.println("Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numero:");
                        int StudentToAdd = Integer.parseInt(scan.nextLine());
                        gifu.enrollStudent(gifu.getStudent(StudentToAdd), gifu.getCourse(courseToAddTo));
                        break;

                    case 6:
                        gifu.listCourses();
                        System.out.println("Minkä kurssin haluat arvostella? Syötä kurssin numero:");
                        int courseToGrade = Integer.parseInt(scan.nextLine());
                        


                        break;
                    case 7:
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
