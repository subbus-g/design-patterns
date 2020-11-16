package facade_pattern;

public class OnePlus implements Phone 
{
    @Override
    public String build() 
    {
        return "Built using Android 4.0";
    }
}