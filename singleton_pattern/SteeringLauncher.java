package singleton_pattern;

class Steering 
{
    private String type;
    private static Steering uniqueSteering;

    private Steering() 
    {
        type = "";
    }
    public void setType(String type) 
    {
        this.type = type;
    }
    public String getType()
    {
        return type;
    }

    //double check lock to be threadsafe
    public static Steering getUniqueSteering() 
    {
        if (uniqueSteering == null) 
        {
            synchronized (Steering.class) 
            {
                if (uniqueSteering == null) 
                {
                    uniqueSteering = new Steering();
                }
            }
        }
        return uniqueSteering;
    }
}

public class SteeringLauncher 
{
    public static void main(String[] args) 
    {
        //each variable aceess the same object
        //hence they  display same object hashcode
        Steering steering_1 = Steering.getUniqueSteering();
        Steering steering_2 = Steering.getUniqueSteering();
        Steering steering_3 = Steering.getUniqueSteering();
        System.out.println("steering_1 is " + steering_1);
        System.out.println("steering_2 is " + steering_2);
        System.out.println("steering_3 is " + steering_3);
        steering_1.setType("power-steering");
        System.out.println(steering_2.getType());
    }
}
