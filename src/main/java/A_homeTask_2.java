import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_homeTask_2 {
    public static void main(String[] args) {
        //инициализация драйвера
        WebDriver driver = initChromeDriver();

        //развернуть окно браузера на весь экран
        driver.manage().window().maximize();


        //--------------- Скрипт А. Логин в Админ панель ---------------

        //1. Открыть страницу Админ панели
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        sleep(500);

        //2. Ввести логин, пароль и нажать кнопку Логин
        // Логин: webinar.test@gmail.com
        // Пароль: Xcg7299bnSmMuRLp9ITw
        WebElement loginField = driver.findElement(By.name("email"));
        loginField.sendKeys("webinar.test@gmail.com");
        sleep(500);

        WebElement passwordField = driver.findElement(By.name("passwd"));
        passwordField.sendKeys("Xcg7299bnSmMuRLp9ITw");
        sleep(500);

        WebElement loginButton = driver.findElement(By.name("submitLogin"));
        loginButton.click();

        //3. После входа в систему нажать на пиктограмме пользователя в верхнем
        //правом углу и выбрать опцию «Выход.»
        sleep(800);
        WebElement headerEmployeeBox = driver.findElement(By.id("header_employee_box"));
        headerEmployeeBox.click();

        sleep(500);
        WebElement headerLogout = driver.findElement(By.id("header_logout"));
        headerLogout.click();
    }


    //подключаем веб-драйвер для Chrome из папки "resources"
    public static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", A_homeTask_2.class.getResource("chromedriver.exe").getPath());
        return new ChromeDriver();
    }

    //ожидание загрузки контента
    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
