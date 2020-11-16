package factory_method_pattern;
/*
//-----definition-----
//Define an interface for creating an object,
//but let subclasses decide which class to instantiate.
//Factory Method lets a class defer instantiation to subclasses.
*/
public class User 
{
    public static void main(String[] args)
    {
        KnifeStore knifeStore = new HomeKnifeStore();
        knifeStore.orderKnife("tomato");
        knifeStore.orderKnife("dinner");
        knifeStore = new ProKnifeStore();
        knifeStore.orderKnife("chef");
        knifeStore.orderKnife("butcher");
    }

}
