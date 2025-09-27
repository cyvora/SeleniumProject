package MyStepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class HomePageSteps {

    public static WebDriver driver;

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        EdgeOptions options = new EdgeOptions();
        System.setProperty("webdriver.edge.driver","C:\\Users\\SIMLA M\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
        driver = new EdgeDriver(options);
        driver.get("https://demo.automationtesting.in/Index.html");

    }
    @When("user clicks on skip sign in")
    public void user_clicks_on_skip_sign_in() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Skip Sign In']")).click();

    }


    @Then("user types firstname and lastname")
    public void userTypesFirstnameAndLastname() {
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
       firstname.click();
       firstname.sendKeys("Vijay");
       WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
       lastname.click();
       lastname.sendKeys("Kumar");

    }

    @Then("user types address")
    public void userTypesAddress() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement address = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
        address.click();
        address.sendKeys("123,RK Nagar");

    }

    @Then("user types email address")
    public void userTypesEmailAddress() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement email = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']"));
        email.click();
        email.sendKeys("vijaykumar@gmail.com");
    }

    @Then("user types phone number")
    public void userTypesPhoneNumber() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement cellnumber = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']"));
        cellnumber.click();
        cellnumber.sendKeys("1234567890");
    }

    @Then("user clicks on gender")
    public void userClicksOnGender() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement gender = driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]"));
        gender.click();
    }

    @And("user clicks on hobbies")
    public void userClicksOnHobbies() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement hobbies = driver.findElement(By.xpath("//input[@value='Movies']"));
        hobbies.click();
    }

    @And("user types languages")
    public void userTypesLanguages() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']")).click();
        driver.findElement(By.xpath("//a[text()='Arabic']")).click();

    }

    @And("user selects skills and countries")
    public void userSelectsSkillsAndCountries() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
        Select dropdownskills = new Select(skills);
        dropdownskills.selectByVisibleText("Adobe InDesign");
    }

    @And("user selects select country")
    public void userSelectsSelectCountry() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
        WebElement country = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
        country.click();
        country.sendKeys("Australia");
        driver.findElement(By.xpath("//li[text()='Australia']")).click();

    }

    @And("user selects date of birth")
    public void userSelectsDateOfBirth() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
        Select yeardropdown = new Select(year);
        yeardropdown.selectByVisibleText("1996");
        WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
        Select monthdropdown = new Select(month);
        monthdropdown.selectByVisibleText("February");
        WebElement day = driver.findElement(By.xpath("//select[@id='daybox']"));
        Select daydropdown = new Select(day);
        daydropdown.selectByVisibleText("26");

    }

    @Then("user types password and confirm password")
    public void userTypesPasswordAndConfirmPassword() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement password = driver.findElement(By.xpath("//input[@id='firstpassword']"));
        password.click();
        password.sendKeys("February@261996");
        WebElement confirmpassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
        confirmpassword.click();
        confirmpassword.sendKeys("February@261996");
    }

    @Then("user clicks on refresh")
    public void userClicksOnRefresh() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//button[text()='Refresh']")).click();
    }

    @When("web agent maximize the browser")
    public void webAgentMaximizeTheBrowser() {
        driver.manage().window().maximize();
    }

    @Then("web agent scrolls to top of the page")
    public void webAgentScrollsToTopOfThePage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");

    }

    @When("web agent scrolls to bottom of the page")
    public void webAgentScrollsToBottomOfThePage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @When("^web agent scrolls down by (\\d+) pixels$")
    public void scrollDownByPixels(int pixels)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")");
    }


    @When("web agent waits for {int} seconds")
    public void webAgentWaitsForSometime(int seconds) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(seconds));
    }

    @When("web agent quits the browser")
    public void webAgentQuitsTheBrowser() {
        driver.quit();
    }

    @Then("web agent moves to switchTo and clicks alerts")
    public void webAgentMovesToSwitchTo() {
        WebElement switchto = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        WebElement alert = driver.findElement(By.xpath("//a[text()='Alerts']"));
        Actions act = new Actions(driver);
        act.moveToElement(switchto).moveToElement(alert).click().build().perform();
    }

    @Then("web agent clicks on display alert box")
    public void webAgentClicksOnDisplayAlertBox() {
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        Alert alertOk = driver.switchTo().alert();
        System.out.println(alertOk.getText());
        alertOk.accept();

    }

    @Then("web agent clicks on alert with ok and cancel")
    public void webAgentClicksOnAlertWithOkAndCancel() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
        driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
        Alert alertWithOk = driver.switchTo().alert();
        System.out.println(alertWithOk.getText());
        Thread.sleep(5000);
        alertWithOk.accept();
        driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
        Alert alertWithCancel = driver.switchTo().alert();
        System.out.println(alertWithCancel.getText());
        Thread.sleep(5000);
        alertWithCancel.dismiss();

    }

    @Then("web agent clicks on alert with text box")
    public void webAgentClicksOnAlertWithTextBox() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
        driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
        Alert alertTextBox = driver.switchTo().alert();
        alertTextBox.sendKeys("Automation");
        Thread.sleep(5000);
        alertTextBox.accept();
    }

    @Then("web agent moves to switchTo and clicks windows")
    public void webAgentMovesToSwitchToAndClicksWindows() {
        WebElement switchto = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        WebElement windows = driver.findElement(By.xpath("//a[text()='Windows']"));
        Actions act = new Actions(driver);
        act.moveToElement(switchto).moveToElement(windows).click().build().perform();
        driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
        Set<String> windowid = driver.getWindowHandles();
        List<String> windowids = new ArrayList(windowid);
        String parentWindowId = windowids.get(0);
        String childWindowId = windowids.get(1);
        driver.switchTo().window(parentWindowId);
        driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
        driver.findElement(By.xpath("//button[text()='click']")).click();
        driver.switchTo().window(parentWindowId);
        driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();
        driver.findElement(By.xpath("//button[text()='click ']")).click();

    }

    @When("web agent moves to widgets and clicks accordion")
    public void webAgentMovesToWidgetsAndClicksAccordion() {
        WebElement widgets = driver.findElement(By.xpath("//a[text()='Widgets']"));
        WebElement accordion = driver.findElement(By.xpath("//a[text()=' Accordion ']"));
        Actions act = new Actions(driver);
        act.moveToElement(widgets).moveToElement(accordion).click().build().perform();
        driver.findElement(By.xpath("//b[text()='Collapsible Group 2 - Single Line Coding']")).click();
        driver.findElement(By.xpath("//b[text()='Collapsible Group 3 - Methhod Chaining']")).click();
        driver.findElement(By.xpath("//b[text()='Collapsible Group 4 - Cross Browser Testing']")).click();

    }

    @Then("web agent moves to widgets and clicks autocomplete")
    public void webAgentMovesToWidgetsAndClicksAutocomplete() {
        WebElement widgets = driver.findElement(By.xpath("//a[text()='Widgets']"));
        WebElement autocomplete = driver.findElement(By.xpath("//a[text()=' AutoComplete ']"));
        Actions act = new Actions(driver);
        act.moveToElement(widgets).moveToElement(autocomplete).click().build().perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement enterautocomplete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']")));
        enterautocomplete.click();
        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement australia = Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Australia']")));
        australia.click();
    }

    @Then("web agent moves to widgets and clicks datepicker")
    public void webAgentMovesToWidgetsAndClicksDatepicker() {
        WebElement widgets = driver.findElement(By.xpath("//a[text()='Widgets']"));
        WebElement datepicker = driver.findElement(By.xpath("//a[text()=' Datepicker ']"));
        Actions act = new Actions(driver);
        act.moveToElement(widgets).moveToElement(datepicker).click().build().perform();
        driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
        driver.findElement(By.xpath("//a[text()='24']")).click();
        WebElement datepicker2 = driver.findElement(By.xpath("//input[@id='datepicker2']"));
        datepicker2.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement date = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='24'])[2]")));
        date.click();
    }

    @Then("web agent hovers to interactions, clicks dragdrop and static")
    public void webAgentHoversToInteractionsAndClicksDragdrop() {
        WebElement interactions = driver.findElement(By.xpath("//a[text()='Interactions ']"));
        WebElement dragdrop = driver.findElement(By.xpath("//a[text()='Drag and Drop ']"));
        WebElement staticdragdrop = driver.findElement(By.xpath("//a[text()='Static ']"));
        Actions act = new Actions(driver);
        act.moveToElement(interactions).moveToElement(dragdrop).moveToElement(staticdragdrop).click().build().perform();
        Actions drag = new Actions(driver);
        WebElement angular = driver.findElement(By.xpath("//img[@id='angular']"));
        WebElement mongo = driver.findElement(By.xpath("//img[@id='mongo']"));
        WebElement node = driver.findElement(By.xpath("//img[@id='node']"));
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement droparea = waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='droparea']")));
        drag.dragAndDrop(angular,droparea).perform();
        drag.dragAndDrop(mongo,droparea).perform();
        drag.dragAndDrop(node,droparea).perform();
    }

    @Then("web agent hovers to interactions, clicks dragdrop and dynamic")
    public void webAgentHoversToInteractionsClicksDragdropAndDynamic() {
        WebElement interactions = driver.findElement(By.xpath("//a[text()='Interactions ']"));
        WebElement dragdrop = driver.findElement(By.xpath("//a[text()='Drag and Drop ']"));
        WebElement dynamicdragdrop = driver.findElement(By.xpath("//a[text()='Dynamic ']"));
        Actions act = new Actions(driver);
        act.moveToElement(interactions).moveToElement(dragdrop).moveToElement(dynamicdragdrop).click().build().perform();
        Actions drag = new Actions(driver);
        WebElement angular = driver.findElement(By.xpath("//img[@id='angular']"));
        WebElement mongo = driver.findElement(By.xpath("//img[@id='mongo']"));
        WebElement node = driver.findElement(By.xpath("//img[@id='node']"));
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement droparea = waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='droparea']")));
        drag.dragAndDrop(angular,droparea).perform();
        drag.dragAndDrop(mongo,droparea).perform();
        drag.dragAndDrop(node,droparea).perform();
    }

    @Then("web agent hovers to interactions and clicks selectable")
    public void webAgentHoversToInteractionsAndClicksSelectable() {
        WebElement interactions = driver.findElement(By.xpath("//a[text()='Interactions ']"));
        WebElement selectable = driver.findElement(By.xpath("//a[text()='Selectable ']"));
        Actions act = new Actions(driver);
        act.moveToElement(interactions).moveToElement(selectable).click().build().perform();
        driver.findElement(By.xpath("(//li[@class='ui-widget-content'])[1]")).click();
        driver.findElement(By.xpath("(//li[@class='ui-widget-content'])[2]")).click();
        driver.findElement(By.xpath("//a[text()='Serialize ']")).click();
        driver.findElement(By.xpath("(//b[text()='Sakinalium - Cross Browser Testing'])[2]")).click();

            }

    @Then("web agent hovers to interactions and clicks resizeable")
    public void webAgentHoversToInteractionsAndClicksResizeable() {
        WebElement interactions = driver.findElement(By.xpath("//a[text()='Interactions ']"));
        WebElement resizeable = driver.findElement(By.xpath("//a[text()='Resizable']"));
        Actions act = new Actions(driver);
        act.moveToElement(interactions).moveToElement(resizeable).click().build().perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement resizablebox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='resizable']")));
        WebElement handle = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
        Actions action = new Actions(driver);
        action.clickAndHold(handle).moveByOffset(150,100).release().perform();
        int newWidth = resizablebox.getSize().getWidth();
        int newHeight = resizablebox.getSize().getHeight();
        System.out.println("New size: width=" + newWidth + " height=" + newHeight);

    }

    @Then("web agent hovers to video and clicks on youtube")
    public void webAgentClicksOnYoutube() {
        WebElement video = driver.findElement(By.xpath("//a[text()='Video']"));
        WebElement youtube = driver.findElement(By.xpath("//a[text()='Youtube']"));
        Actions act = new Actions(driver);
        act.moveToElement(video).moveToElement(youtube).click().build().perform();

    }

    @Then("web agent hovers to video and clicks on vimeo")
    public void webAgentHoversToVideoAndClicksOnVimeo() {
        WebElement video = driver.findElement(By.xpath("//a[text()='Video']"));
        WebElement vimeo = driver.findElement(By.xpath("//a[text()='Vimeo']"));
        Actions act = new Actions(driver);
        act.moveToElement(video).moveToElement(vimeo).click().build().perform();
    }

    @Then("web agent hovers to WYSIWYG and clicks on tinyMCE")
    public void webAgentHoversToWYSIWYGAndClicksOnTinyMCE() {
        WebElement WYSIWYG = driver.findElement(By.xpath("//a[text()='WYSIWYG']"));
        WebElement tinymce = driver.findElement(By.xpath("//a[text()='TinyMCE']"));
        Actions act = new Actions(driver);
        act.moveToElement(WYSIWYG).moveToElement(tinymce).click().build().perform();
    }

    @Then("web agent hovers to WYSIWYG and clicks on CKeditor")
    public void webAgentHoversToWYSIWYGAndClicksOnCKeditor() {
        WebElement WYSIWYG = driver.findElement(By.xpath("//a[text()='WYSIWYG']"));
        WebElement ckeditor = driver.findElement(By.xpath("//a[text()='CKEditor']"));
        Actions act = new Actions(driver);
        act.moveToElement(WYSIWYG).moveToElement(ckeditor).click().build().perform();

    }

    @Then("web agent hovers to WYSIWYG and clicks on SummerNote")
    public void webAgentHoversToWYSIWYGAndClicksOnSummerNote() {
        WebElement WYSIWYG = driver.findElement(By.xpath("//a[text()='WYSIWYG']"));
        WebElement summernote = driver.findElement(By.xpath("//a[text()='SummerNote']"));
        Actions act = new Actions(driver);
        act.moveToElement(WYSIWYG).moveToElement(summernote).click().build().perform();
        WebElement note = driver.findElement(By.xpath("//div[@class='note-editable panel-body']"));
        note.clear();
        note.sendKeys("Hello Automation");
    }

    @Then("web agent hovers to WYSIWYG and clicks on codemirror")
    public void webAgentHoversToWYSIWYGAndClicksOnCodemirror() {
        WebElement WYSIWYG = driver.findElement(By.xpath("//a[text()='WYSIWYG']"));
        WebElement codemirror = driver.findElement(By.xpath("//a[text()='CodeMirror']"));
        Actions act = new Actions(driver);
        act.moveToElement(WYSIWYG).moveToElement(codemirror).click().build().perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement code = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".CodeMirror")));
        code.click();
        WebElement editable = code.findElement(By.cssSelector(".CodeMirror textarea"));
        editable.sendKeys("Hello Automation");
    }

    @Then("web agent hovers to more and clicks on charts")
    public void webAgentHoversToMoreAndClicksOnCharts() {
        WebElement more = driver.findElement(By.xpath("//a[text()='More']"));
        WebElement charts = driver.findElement(By.xpath("//a[text()='Charts']"));
        Actions act = new Actions(driver);
        act.moveToElement(more).moveToElement(charts).click().build().perform();
    }

    @Then("web agent hovers to more and clicks on dynamicdata")
    public void webAgentHoversToMoreAndClicksOnDynamicdata() {
        WebElement more = driver.findElement(By.xpath("//a[text()='More']"));
        WebElement dynamicdata = driver.findElement(By.xpath("//a[text()='Dynamic Data']"));
        Actions act = new Actions(driver);
        act.moveToElement(more).moveToElement(dynamicdata).click().build().perform();
        driver.findElement(By.xpath("//button[text()='Get Dynamic Data']")).click();

    }

    @Then("web agent hovers to more and clicks on filedownload")
    public void webAgentHoversToMoreAndClicksOnFiledownload() {
        WebElement more = driver.findElement(By.xpath("//a[text()='More']"));
        WebElement filedownload = driver.findElement(By.xpath("//a[text()='File Download']"));
        Actions act = new Actions(driver);
        act.moveToElement(more).moveToElement(filedownload).click().build().perform();
        WebElement textarea = driver.findElement(By.xpath("//textarea[@id='textbox']"));
        textarea.click();
        textarea.sendKeys("Hello Automation...");
        driver.findElement(By.xpath("(//button[text()='Generate File'])[1]")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement pdfbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='pdfbox']")));
        pdfbox.click();
        pdfbox.sendKeys("Hello Automation...");
        driver.findElement(By.xpath("(//button[text()='Generate File'])[2]")).click();

    }

    @Then("web agent hovers to more and clicks on fileupload")
    public void webAgentHoversToMoreAndClicksOnFileupload() {
        WebElement more = driver.findElement(By.xpath("//a[text()='More']"));
        WebElement fileupload = driver.findElement(By.xpath("//a[text()='File Upload']"));
        Actions act = new Actions(driver);
        act.moveToElement(more).moveToElement(fileupload).click().build().perform();
    }

    @Then("web agent hovers to more and clicks on jquery progressbar")
    public void webAgentHoversToMoreAndClicksOnJqueryProgressbar() {
        WebElement more = driver.findElement(By.xpath("//a[text()='More']"));
        WebElement JQueryProgressBar = driver.findElement(By.xpath("//a[text()='JQuery ProgressBar']"));
        Actions act = new Actions(driver);
        act.moveToElement(more).moveToElement(JQueryProgressBar).click().build().perform();
        driver.findElement(By.xpath("//button[text()='Start Download']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement close = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Close']")));
        close.click();
    }

    @Then("web agent hovers to more and clicks on loader")
    public void webAgentHoversToMoreAndClicksOnLoader() {
        WebElement more = driver.findElement(By.xpath("//a[text()='More']"));
        WebElement Loader = driver.findElement(By.xpath("//a[text()='Loader']"));
        Actions act = new Actions(driver);
        act.moveToElement(more).moveToElement(Loader).click().build().perform();
        driver.findElement(By.xpath("//button[text()='Run']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        WebElement close = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Close']")));
        close.click();

    }

    @Then("web agent hovers to more and clicks on modals")
    public void webAgentHoversToMoreAndClicksOnModals() {
        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement more = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='More']")));
        WebElement Modals = driver.findElement(By.xpath("//a[text()='Modals']"));
        Actions act = new Actions(driver);
        act.moveToElement(more).moveToElement(Modals).click().build().perform();
        driver.findElement(By.xpath("(//a[text()='Launch modal'])[1]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement close = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Close']")));
        close.click();
        driver.findElement(By.xpath("(//a[text()='Launch modal'])[2]")).click();
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement Close = waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Close']")));
        Close.click();

    }

    @Then("web agent hovers to more and clicks on progressbar")
    public void webAgentHoversToMoreAndClicksOnProgressbar() {
        WebElement more = driver.findElement(By.xpath("//a[text()='More']"));
        WebElement ProgressBar = driver.findElement(By.xpath("//a[text()='ProgressBar']"));
        Actions act = new Actions(driver);
        act.moveToElement(more).moveToElement(ProgressBar).click().build().perform();
        driver.findElement(By.xpath("//button[@id='cricle-btn']")).click();

    }

    @When("web agent refresh the page")
    public void webAgentRefresh()
    {
        driver.navigate().refresh();
    }

    @Then("web agent moves to widgets and clicks slider")
    public void webAgentMovesToWidgetsAndClicksSlider() {
        WebElement widgets = driver.findElement(By.xpath("//a[text()='Widgets']"));
        WebElement slider = driver.findElement(By.xpath("//a[text()=' Slider ']"));
        Actions act = new Actions(driver);
        act.moveToElement(widgets).moveToElement(slider).click().build().perform();
        Actions drag = new Actions(driver);
        WebElement slide = driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
        drag.dragAndDropBy(slide,50,100).perform();

    }

    @Then("web agent moves to switchTo and clicks frames")
    public void webAgentMovesToSwitchToAndClicksFrames() {
        WebElement switchto = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        WebElement frames = driver.findElement(By.xpath("//a[text()='Frames']"));
        Actions act = new Actions(driver);
        act.moveToElement(switchto).moveToElement(frames).click().build().perform();
        driver.switchTo().frame("SingleFrame");
        WebElement frame1 = driver.findElement(By.xpath("(//div[@class='col-xs-6 col-xs-offset-5']/input)[1]"));
        frame1.click();
        frame1.sendKeys("Automation");
        driver.switchTo().defaultContent();

    }

    @When("web agent waits sometime")
    public void webAgentWaits() throws InterruptedException {
        Thread.sleep(3000);
    }
}
