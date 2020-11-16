package adaptor_pattern;

public class ChromeWebDriver implements NewWebDriver 
{
    @Override
    public void getElement() 
    {
        System.out.println("getting elements.....");
    }

    @Override
    public void selectElement() 
    {
        System.out.println("selecting elements.......");
    }

    @Override
    public void printBrowser() 
    {
        System.out.println("Chrome");
    }
}
