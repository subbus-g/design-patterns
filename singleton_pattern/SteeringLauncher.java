/*-----definition---------
/The Singleton Pattern ensures that a class has one and only one instance 
/and provides global point of access to that instance
/----things-to-ensure-----
/private constructor,static object creation and a method to access it
*/
package singleton_pattern;

class Steering 
{
    private String type;
    //static object creation
    private static Steering uniqueSteering;

    //private constructor
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

    //static method creation to access the static object
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
