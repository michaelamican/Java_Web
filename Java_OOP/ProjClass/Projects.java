public class Projects{

    private String name;
    private String desc;
    private double cost;

    public Projects(){
        System.out.println("Let's come up with a project!");
    }

    public Projects(String name){
        System.out.println("Give the Project a description!");
        this.name = name;
    }

    public Projects(String name, String desc){
        this.name = name;
        this.desc = desc;
        System.out.println("What does it cost?");
    }
    public Projects(String name, String desc, double cost){
        this.name = name; 
        this.desc = desc; 
        this.cost = cost;
        System.out.println("Full project!");
    }

    public String getName(){
        System.out.println(this.name);
        return name;
    }
    public void reName(String name){
        this.name = name;
    }

    public String getDesc(){
        return desc;
    }
    public void reDesc(String desc){
        this.desc = desc;
    }
    
    public double getCost(){
        return cost;
    }
    public void reCost(double cost){
        this.cost = cost;
    }


    public String elevatorPitch(){
        System.out.println("Name: "+this.name+"; Cost: "+this.cost+"; Description: "+this.desc);
        return "Name: "+this.name+"; Cost: "+this.cost+"; Description: "+this.desc;
    }


}