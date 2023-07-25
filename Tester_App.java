public class Tester_App {
    
    public static void main(String[] args ) {

        Project projectobj = new Project("ArcTech Business Solution", 450, 12, 100 );

        System.out.println(projectobj.toString());

        Project projectobj2 = new Project("SunMarkets POS Implementation", 600, 0.7, 50);

        System.out.println();

        System.out.println(projectobj2.toString());

        projectobj2.deactivateProject();

        System.out.println();

        System.out.println(projectobj2.toString());
    } 
}
