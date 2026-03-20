public class GradeSheet {
    public static void main(String[] args) {

        String name = "Aayush Chapagain";
        String program = "BSc CSIT";
        int semester = 7;

        int java = 85;
        int networking = 80;
        int database = 78;
        int os = 82;
        int ai = 88;

        int total = java + networking + database + os + ai;
        double percentage = total / 5.0;

        System.out.println("----------- Grade Sheet -----------");
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("-----------------------------------");
        System.out.println("Java: " + java);
        System.out.println("Networking: " + networking);
        System.out.println("Database: " + database);
        System.out.println("Operating System: " + os);
        System.out.println("Artificial Intelligence: " + ai);
        System.out.println("-----------------------------------");
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}