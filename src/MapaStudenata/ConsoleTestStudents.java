package MapaStudenata;

import java.util.*;

public class ConsoleTestStudents {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner s = new Scanner(System.in);

        //List<Student> listaStudenta = new ArrayList<>();
        Student ana = new Student(2, "ana", 3);
        Student petar = new Student(3, "petar", 2);
        Student igor = new Student(1, "igor", 1);

        Map<Integer, Student> mapaStudenata = new HashMap<>();

        mapaStudenata.put(001, ana);
        mapaStudenata.put(002, petar);
        mapaStudenata.put(003, igor);

       // listaStudenta.add(ana);
       // listaStudenta.add(petar);
       // listaStudenta.add(igor);


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
                System.out.println("unesi novi key;");
                int nkey(s.nextInt());
                student =addNewStudent();
                mapaStudenata.put(student.getIdNumber(), student);
                return;
            }
            case "b": {
                System.out.println("unesi key broj:");
                int id = s.nextInt();

                for (int a : mapaStudenata.keySet()) {
                    if (a == id) {
                        System.out.println(a.getFirst_name());
                    }
                }
                System.out.println(mapaStudenata);
                return;
            }
            case "c": {
                System.out.println("unesi key broj studenta kojeg želiš obrisat:");
                int id = s.nextInt();
                for (Student b : mapaStudenata.values()) {
                    if (b.getIdNumber() == id) {
                        mapaStudenata.remove(b);
                    }

                }
                System.out.println(mapaStudenata);
                return;
            }
            case "d": {
                System.out.println("unesi id broj studenta kojem želiš promjenit godinu:");
                int id = s.nextInt();
                for (Student d : mapaStudenata.keySet()) {
                    if (d.getIdNumber() == id) {
                        d.increaseYear();
                    }
                }
                System.out.println(mapaStudenata);
                return;
            }
            case "e": {
                System.out.println(mapaStudenata);
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
