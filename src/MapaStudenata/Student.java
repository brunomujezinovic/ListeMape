package MapaStudenata;

    public class Student {
        private int idNumber;
        private String first_name;
        private int year;


        public Student(int idNumber, String first_name, int year) {
            this.idNumber = idNumber;
            this.first_name = first_name;
            this.year = year;
        }
        public Student(){

        }

        public int getIdNumber() {
            return idNumber;
        }

        public String getFirst_name() {
            return first_name;
        }

        public int getYear() {
            return year;
        }

        public void increaseYear(){
            if (year>2){
                System.out.println("zadnja godina studija");
            }
            else year++;

        }

        public void setIdNumber(int idNumber) {
            this.idNumber = idNumber;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "idNumber=" + idNumber +
                    ", first_name='" + first_name + '\'' +
                    ", year=" + year +
                    '}';
        }
    }
