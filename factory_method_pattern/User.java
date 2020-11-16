package factory_method_pattern;

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
