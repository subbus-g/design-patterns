package factory_method_pattern;

public class HomeKnifeStore extends KnifeStore
{
    @Override
    Knife createKnife(String knifeType) 
    {
        switch(knifeType)
        {
            case "bread":
                return new BreadKnife();
            case "dinner":
                return new DinnerKnife();
            case "tomato":
                return new TomatoKnife();
            //more types can be added here
            default:
                return null;
        }
    }
}
