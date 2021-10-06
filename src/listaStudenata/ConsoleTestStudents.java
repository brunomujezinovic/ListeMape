package listaStudenata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleTestStudents {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner s = new Scanner(System.in);

        List<Student> listaStudenta = new ArrayList<>();
        Student ana = new Student(2, "ana", 3);
        Student petar = new Student(3, "petar", 2);
        Student igor = new Student(1, "igor", 1);

        listaStudenta.add(ana);
        listaStudenta.add(petar);
        listaStudenta.add(igor);


        Student student;

        System.out.println("IZBORNIK: \n" +
                "a) upis studenta \n" +
                "b) ispis studenta po Id broju \n" +
                "c) brisanje studenta po Id broju \n" +
                "d) promjena godine studije \n" +
                "e) ispis svih studenata \n" +
                "f) izlaz");

        String i = s.next();

        switch (i) {

            case "a": {
                student =addNewStudent();
                listaStudenta.add(student);
                return;
            }
            case "b": {
                System.out.println("unesi id broj:");
                int id = s.nextInt();

                for (Student a : listaStudenta) {
                    if (a.getIdNumber() == id) {
                        System.out.println(a.getFirst_name());
                    }
                }
                System.out.println(listaStudenta);
                return;
            }
            case "c": {
                System.out.println("unesi id broj studenta kojeg želiš obrisat:");
                int id = s.nextInt();
                for (Student b : listaStudenta) {
                    if (b.getIdNumber() == id) {
                        listaStudenta.remove(b);
                    }

                }
                System.out.println(listaStudenta);
                return;
            }
            case "d": {
                System.out.println("unesi id broj studenta kojem želiš promjenit godinu:");
                int id = s.nextInt();
                for (Student d : listaStudenta) {
                    if (d.getIdNumber() == id) {
                        d.increaseYear();
                    }
                }
                System.out.println(listaStudenta);
                return;
            }
            case "e": {
                System.out.println(listaStudenta);
                return;
            }
            case "f":{
                return;
            }
            default:
                throw new IllegalAccessException("krivi odabir");

        }


    }
    public static Student addNewStudent() {
        Scanner s = new Scanner(System.in);
        Student newStudent = new Student();
        System.out.println("Unesi id");
        newStudent.setIdNumber(s.nextInt());
        System.out.println("Unesi ime:");
        newStudent.setFirst_name(s.next());
        System.out.println("Unesi godinu studija:");
        newStudent.setYear(s.nextInt());

        return newStudent;
    }
}
