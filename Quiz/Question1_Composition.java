public class Question1_Composition {
    public static class Employee{
        private String name;
        private double salary;

        public Employee(String name, double salary){
            this.name = name;
            this.salary = salary;
        }
        public String getName(){
            return name;
        }
        public double getSalary(){
            return salary;
        }
        void setName(String name){
            this.name = name;
        }
        void setSalary(double salary){
            this.salary = salary;
        }
        void work() {
            System.out.println(name + " is working.");
        }
        void introduce() {
            System.out.println("Name: " + name + ", salary: " + salary);
            work();
        }
    };
    public static class Programmer {
        private Employee employee1;
        private String programmingLanguage;
        public Programmer(Employee employee1, String programmingLanguage) {
            this.employee1 = employee1;
            this.programmingLanguage = programmingLanguage;
        }
        public Employee getEmployee1(){
            return employee1;
        }
        public String getProgrammingLanguage(){
            return programmingLanguage;
        }
        public void setEmployee1(Employee employee1){
            this.employee1 = employee1;
        }
        public void setProgrammingLanguage(String programmingLanguage){
            this.programmingLanguage = programmingLanguage;
        }
        public void work() {
            System.out.println(employee1.getName() + " is working using " + programmingLanguage);
        }
        public void debugg() {
            System.out.println(employee1.getName() + " is debugging.");
        }
        public void introduce() {
            System.out.println("Name: " + employee1.getName() + ", salary: " + employee1.getSalary());
            System.out.println("Programming language: " + programmingLanguage);
            work();
            debugg();
        }
    }
    public static void main(String[] args) {
        System.out.println("Question 1:");
        Employee employee1 = new Employee("Michael Brown", 1500);
        Programmer programmer1 = new Programmer(employee1, "Programming language");
        programmer1.introduce();
    }
}
