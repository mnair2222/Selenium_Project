package selenium_project;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {
	 private static List<String> testReport = new ArrayList<>();

	    public static void log(String message, boolean passed) {
	        testReport.add((passed ? "PASSED: " : "FAILED: ") + message);
	    }

	    public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        try {
	            driver.get("https://www.flipkart.com/");
	            Thread.sleep(3000); // Wait for the page to load
	            log("Opened website", true);
	            
	            WebElement loginLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[2]/div[2]/div/div/div/div")));
	            loginLink.click();
	            Thread.sleep(3000);
	            log("Clicked login link", true);
	            
	            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search for products, brands and more']")));
	            searchBox.sendKeys("s24 ultra mobile");
	            searchBox.submit();
	            Thread.sleep(3000);
	            log("Searched for 's24 ultra mobile'", true);
	            
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']//*[name()='svg']"))).click();
	            Thread.sleep(3000);
	            log("Clicked 'Search Button'", true);
	            
	            WebElement productLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='SAMSUNG Galaxy S24 Ultra 5G (Titanium Gray, 256 GB)']")));
	            productLink.click();
	            Thread.sleep(3000);
	            log("Selected product", true);
	            WebElement productLink1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='SAMSUNG Galaxy S24 Ultra 5G (Titanium Gray, 256 GB)']")));
	            productLink1.click();
	            Thread.sleep(3000);
	            log("Selected product in in grocery", true);
	            // Switch to new tab
	            String originalWindow = driver.getWindowHandle();
	            Set<String> allWindows = driver.getWindowHandles();
	            for (String windowHandle : allWindows) {
	                if (!windowHandle.equals(originalWindow)) {
	                    driver.switchTo().window(windowHandle);
	                    break;
	                }
	            }

	            WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")));
	            addToCartButton.click();
	            Thread.sleep(3000);
	            log("Clicked 'Add to Cart'", true);

	            WebElement RemoveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='Remove']")));
	            RemoveButton.click();
	            Thread.sleep(3000);
	        
	            WebElement Remove1Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("  //div[@class='sBxzFz fF30ZI A0MXnh']")));
	            Remove1Button.click();
	            Thread.sleep(3000);
	            log("Clicked 'RemoveButton'", true);
	            
	            WebElement search1Box = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search for products, brands and more']")));
	            search1Box.sendKeys("watch");
	            search1Box.submit();
	            Thread.sleep(3000);
	            log("Searched for 'watch'", true);
	            
	            // Click on the minimum price dropdown
	            WebElement PriceMinButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='suthUA']//select[@class='Gn+jFg']")));
	            PriceMinButton.click();
	            Thread.sleep(3000);
	            log("Clicked 'MinPrice'", true);
	            
	            // Set minimum price to 500
	            WebElement priceOption500 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select/option[2]"))); // Adjust the XPath if necessary
	            priceOption500.click();
	            Thread.sleep(3000);
	            log("Set minimum price to 500", true);
	            WebElement PriceMaxButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='tKgS7w']//select[@class='Gn+jFg']")));
	            PriceMaxButton.click();
	            Thread.sleep(3000);
	            log("Clicked 'MaxPrice'", true);
	            WebElement priceOption20000 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select/option[4]"))); // Adjust the XPath if necessary
	            priceOption20000.click();
	            Thread.sleep(3000);
	            log("Set minimum price to 20000", true);
	            log("Clicked 'MaxPrice'", true);
	            WebElement AssuredProduct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='_2OLUF3 _6gqfMo']//div[@class='SwtzWS']"))); // Adjust the XPath if necessary
	            AssuredProduct.click();
	            Thread.sleep(3000);
	            log("Clicked 'Assured Product", true);
	            
	            WebElement search2Box = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search Brand']")));
	            search2Box.sendKeys("SONATA");
	            Thread.sleep(3000);
	            log("Searched for 'SONATA'", true);
	            WebElement SONATAProduct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='SONATA']//div[@class='XqNaEv']"))); // Adjust the XPath if necessary
	            SONATAProduct.click();
	            Thread.sleep(3000);
	            log("Clicked 'SONATA PRODUCT", true);
	            WebElement ClearAll = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='aOfogh']//span[contains(text(),'Clear all')]"))); // Adjust the XPath if necessary
	            ClearAll.click();
	            Thread.sleep(3000);
	            log("Clicked 'Clear All", true);
	            WebElement PricelowtoHigh = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='Price -- Low to High']"))); // Adjust the XPath if necessary
	            PricelowtoHigh.click();
	            Thread.sleep(3000);
	            log("Clicked 'Price low to High", true);
	            WebElement PriceHightoLow = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='Price -- High to Low']"))); // Adjust the XPath if necessary
	            PriceHightoLow.click();
	            Thread.sleep(3000);
	            log("Clicked 'Price high to low", true);
	            WebElement Home1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title='Flipkart']"))); // Adjust the XPath if necessary
	            Home1.click();
	            Thread.sleep(3000);
	            log("Clicked 'Home", true);
	           

//	            



	            // Switch back to original tab
	          
	            
	        } catch (Exception e) {
	            log("Test failed: " + e.getMessage(), false);
	            e.printStackTrace();
	        } finally {
	            try {
	                // Attempt to quit the driver
	                driver.quit();
	            } catch (Exception e) {
	                log("Failed to quit driver: " + e.getMessage(), false);
	                e.printStackTrace();
	            }
	            generateReport();
	        }
	    }

	    private static void generateReport() {
	        try (FileWriter writer = new FileWriter("test_report.txt")) {
	            for (String entry : testReport) {
	                writer.write(entry + "\n");
	            }
	            System.out.println("Test report generated successfully.");
	            // Print the test report to the console
	            for (String entry : testReport) {
	                System.out.println(entry);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
