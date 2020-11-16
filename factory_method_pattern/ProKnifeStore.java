package factory_method_pattern;

public class ProKnifeStore extends KnifeStore
{
    @Override
    Knife createKnife(String knifeType) 
    {
        switch(knifeType)
        {
            case "chef":
                return new ChefKnife();
            case "butcher":
                return new ButcherKnife();
            default:
                return null;
        }
    }
}
