package adaptor_pattern;

public class IEWebDriver implements OldWebDriver 
{

    public void findElement() 
    {
        System.out.println("finding  elements.......");
    }

    public void clickElement() 
    {
        System.out.println("clicking  elements.......");
    }

    public void printBrowser() 
    {
        System.out.println("IE");
    }
}
