/*---definition---
//Convert the interface of a class into another interface the clients expect.
//Adapter lets classes work together that couldn't otherwise because of incompatible interfaces
*/
package adaptor_pattern;

public class User {
    public static void main(String[] args) 
    {
        ChromeWebDriver ChromeWebDriver = new ChromeWebDriver();

        IEWebDriver ieWebDriver = new IEWebDriver();

        ieWebDriver.clickElement();
        ieWebDriver.findElement();
        ieWebDriver.printBrowser();

        NewWebDriver ieWebDriverAdapter = new IEWebDriverAdapter(ieWebDriver);
        test(ChromeWebDriver);
        test(ieWebDriverAdapter);

    }

    static void test(NewWebDriver webDriver) 
    {
        webDriver.getElement();
        webDriver.selectElement();

        webDriver.printBrowser();
    }
}
