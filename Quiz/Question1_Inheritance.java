public class Question1 {
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
    public static class Programmer extends Employee {
        private String programmingLanguage;
        public Programmer(String name, double salary, String programmingLanguage) {
            super(name, salary);
            this.programmingLanguage = programmingLanguage;
        }
        public String getProgrammingLanguage(){
            return programmingLanguage;
        }
        void setProgrammingLanguage(String programmingLanguage){
            this.programmingLanguage = programmingLanguage;
        }
        @Override
        public void work() {
            System.out.println(getName() + " is working using " + programmingLanguage);
        }
        public void debugg() {
            System.out.println(this.getName() + " is debugging.");
        }
        @Override
        public void introduce() {
            System.out.println("Name: " + this.getName() + ", salary: " + this.getSalary());
            this.work();
            this.debugg();
        }
    }
    public static void main(String[] args) {
        System.out.println("Question 1:");
        Employee e1 = new Employee("Kim Jong Un", 2500.5);
        e1.introduce();

        Programmer p1 = new Programmer("Humblefool", 5000, "Java");
        p1.introduce();
    }
}
