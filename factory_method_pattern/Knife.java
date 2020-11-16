package factory_method_pattern;

public abstract class Knife 
{
    void sharpen()
    {
        System.out.println("knife is sharpened");
    }
    void pack()
    {
        System.out.println("knife is packed");
    }
    void polish()
    {
        System.out.println("knife is polished");
    }
}
