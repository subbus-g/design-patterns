package adaptor_pattern;

public class IEWebDriverAdapter implements NewWebDriver {
    IEWebDriver ieDriver;

    public IEWebDriverAdapter(IEWebDriver ieDriver)
    {
        this.ieDriver = ieDriver;
    }

    @Override
    public void getElement() {
        ieDriver.findElement();

    }

    @Override
    public void selectElement() {
        ieDriver.clickElement();

    }

    @Override
    public void printBrowser() {
        ieDriver.printBrowser();
    }

    
}
