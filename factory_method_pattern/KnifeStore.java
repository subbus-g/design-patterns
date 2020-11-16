package factory_method_pattern;

public abstract class KnifeStore
{
    public Knife orderKnife(String knifeType)
    {
        Knife knife;
        knife = createKnife(knifeType);
        knife.sharpen();
        knife.polish();
        knife.pack();
        return knife;
    }
    //factory method 
    abstract Knife createKnife(String knifeType);
}
