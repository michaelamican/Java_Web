public class ProjectsTest{
    public static void main(String[] args){

        Projects b = new Projects("Building","A mixed-use high-rise",35000000);
        b.getName();
        System.out.println(b.getName());
        b.getDesc();
        b.getCost();
        b.elevatorPitch();
    }
}