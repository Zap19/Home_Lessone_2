import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_homeTask_2 {
    public static void main(String[] args) {
        String OK = " - OK";
        String BAD = " - Not OK";

        //инициализация драйвера
        WebDriver driver = initChromeDriver();

        //развернуть окно браузера на весь экран
        driver.manage().window().maximize();


        //--------------- Скрипт Б. Проверка работоспособности главного меню Админ панели ---------------

        //1. Войти в Админ панель (по аналогии с предыдущим скриптом)
        // Логин: webinar.test@gmail.com
        // Пароль: Xcg7299bnSmMuRLp9ITw
        driver.navigate().to("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        sleep(500);

        WebElement loginField = driver.findElement(By.name("email"));
        loginField.sendKeys("webinar.test@gmail.com");
        sleep(500);

        WebElement passwordField = driver.findElement(By.name("passwd"));
        passwordField.sendKeys("Xcg7299bnSmMuRLp9ITw");
        sleep(500);

        WebElement loginButton = driver.findElement(By.name("submitLogin"));
        loginButton.click();

        //2. Кликнуть на каждом видимом пункте главного меню (Dashboard, Заказы,
        //Каталог, Клиенты…) для открытия соответствующего раздела и выполнить
        //следующее:
        //2.a Вывести в консоль заголовок открытого раздела.
        //2.b Выполнить обновление (рефреш) страницы и проверить, что
        //пользователь остается в том же разделе после перезагрузки
        //страницы

        //--------------- Category SELL ---------------

        //----- Dashboard -----
        sleep(4000);
        WebElement AdminDashboard = driver.findElement(By.id("tab-AdminDashboard"));
        AdminDashboard.click();

        //вывести в консоль заголовок открытого раздела
        WebElement titleDashboard = driver.findElement(By.className("page-title"));
        String testTitleDashboard = titleDashboard.getText();
        titleSubmenu(testTitleDashboard);


        //обновить страницу
        sleep(2000);
        driver.navigate().refresh();

        //проверка, что пользователь остался на той же странице после обновления
        WebElement sameTitleDashboard = driver.findElement(By.className("page-title"));
        if (sameTitleDashboard.getText().equals(testTitleDashboard) ){
            System.out.println(OK);
        } else {
            System.out.println(BAD);
        }

        //----- Orders -----
        sleep(4000);
        WebElement AdminParentOrders = driver.findElement(By.id("subtab-AdminParentOrders"));
        AdminParentOrders.click();

        //вывести в консоль заголовок открытого раздела
        WebElement titleAdminParentOrders = driver.findElement(By.className("page-title"));
        String testTitleAdminParentOrders = titleAdminParentOrders.getText();
        titleSubmenu(testTitleAdminParentOrders);

        //обновить страницу
        sleep(2000);
        driver.navigate().refresh();

        //проверка, что пользователь остался на той же странице после обновления
        WebElement sameTitleAdminParentOrders = driver.findElement(By.className("page-title"));
        if (sameTitleAdminParentOrders.getText().equals(testTitleAdminParentOrders) ){
            System.out.println(OK);
        } else {
            System.out.println(BAD);
        }

        //----- Catalog -----
        sleep(4000);
        WebElement AdminCatalog = driver.findElement(By.id("subtab-AdminCatalog"));
        AdminCatalog.click();

        //вывести в консоль заголовок открытого раздела
        WebElement titleAdminCatalog = driver.findElement(By.tagName("h2"));
        String testTitleAdminCatalog = titleAdminCatalog.getText();
        titleSubmenu(testTitleAdminCatalog);

        //обновить страницу
        sleep(2000);
        driver.navigate().refresh();

        //проверка, что пользователь остался на той же странице после обновления
        WebElement sameTitleAdminCatalog = driver.findElement(By.tagName("h2"));
        if (sameTitleAdminCatalog.getText().equals(testTitleAdminCatalog)) {
            System.out.println(OK);
        } else {
            System.out.println(BAD);
        }

        //----- Customer -----
        sleep(4000);
        WebElement AdminParentCustomer = driver.findElement(By.linkText("Клиенты"));
        AdminParentCustomer.click();

        //вывести в консоль заголовок открытого раздела
        WebElement titleAdminParentCustomer = driver.findElement(By.className("page-title"));
        String testTitleAdminParentCustomer = titleAdminParentCustomer.getText();
        titleSubmenu(testTitleAdminParentCustomer);

        //обновить страницу
        sleep(2000);
        driver.navigate().refresh();

        //проверка, что пользователь остался на той же странице после обновления
        WebElement sameTitleAdminParentCustomer = driver.findElement(By.className("page-title"));
        if (sameTitleAdminParentCustomer.getText().equals(testTitleAdminParentCustomer)) {
            System.out.println(OK);
        } else {
            System.out.println(BAD);
        }

        //----- CustomerThreads -----
        sleep(4000);
        WebElement AdminParentCustomerThreads = driver.findElement(By.id("subtab-AdminParentCustomerThreads"));
        AdminParentCustomerThreads.click();

        //вывести в консоль заголовок открытого раздела
        WebElement titleAdminParentCustomerThreads = driver.findElement(By.className("page-title"));
        String testTitleAdminParentCustomerThreads = titleAdminParentCustomerThreads.getText();
        titleSubmenu(testTitleAdminParentCustomerThreads);

        //обновить страницу
        sleep(2000);
        driver.navigate().refresh();

        //проверка, что пользователь остался на той же странице после обновления
        WebElement sameTitleAdminParentCustomerThreads = driver.findElement(By.className("page-title"));
        if (sameTitleAdminParentCustomerThreads.getText().equals(testTitleAdminParentCustomerThreads)) {
            System.out.println(OK);
        } else {
            System.out.println(BAD);
        }

        //----- Stats -----
        sleep(4000);
        WebElement AdminStats = driver.findElement(By.id("subtab-AdminStats"));
        AdminStats.click();

        //вывести в консоль заголовок открытого раздела
        WebElement titleAdminStats = driver.findElement(By.className("page-title"));
        String testTitleAdminStats = titleAdminStats.getText();
        titleSubmenu(testTitleAdminStats);

        //обновить страницу
        sleep(2000);
        driver.navigate().refresh();

        //проверка, что пользователь остался на той же странице после обновления
        WebElement sameTitleAdminStats = driver.findElement(By.className("page-title"));
        if (sameTitleAdminStats.getText().equals(testTitleAdminStats)) {
            System.out.println(OK);
        } else {
            System.out.println(BAD);
        }


        //--------------- Category IMPROVE ---------------

        //----- ModulesSf -----
        sleep(4000);
        WebElement AdminParentModulesSf = driver.findElement(By.id("subtab-AdminParentModulesSf"));
        AdminParentModulesSf.click();

        //вывести в консоль заголовок открытого раздела
        WebElement titleAdminParentModulesSf = driver.findElement(By.tagName("h2"));
        String testTitleAdminParentModulesSf = titleAdminParentModulesSf.getText();
        titleSubmenu(testTitleAdminParentModulesSf);

        //обновить страницу
        sleep(9000);
        driver.navigate().refresh();

        //проверка, что пользователь остался на той же странице после обновления
        WebElement sameTitleAdminParentModulesSf = driver.findElement(By.tagName("h2"));
        if (sameTitleAdminParentModulesSf.getText().equals(testTitleAdminParentModulesSf)) {
            System.out.println(OK);
        } else {
            System.out.println(BAD);
        }

        //----- Themes -----
        sleep(10000);
        WebElement AdminParentThemes = driver.findElement(By.linkText("Design"));
        AdminParentThemes.click();

        //вывести в консоль заголовок открытого раздела
        WebElement titleAdminParentThemes = driver.findElement(By.className("page-title"));
        String testTitleAdminParentThemes = titleAdminParentThemes.getText();
        titleSubmenu(testTitleAdminParentThemes);

        //обновить страницу
        sleep(2000);
        driver.navigate().refresh();

        //проверка, что пользователь остался на той же странице после обновления
        WebElement sameTitleAdminParentThemes = driver.findElement(By.className("page-title"));
        if (sameTitleAdminParentThemes.getText().equals(testTitleAdminParentThemes)) {
            System.out.println(OK);
        } else {
            System.out.println(BAD);
        }

        //----- Shipping -----
        sleep(4000);
        WebElement AdminParentShipping = driver.findElement(By.id("subtab-AdminParentShipping"));
        AdminParentShipping.click();

        //вывести в консоль заголовок открытого раздела
        WebElement titleAdminParentShipping = driver.findElement(By.className("page-title"));
        String testTitleAdminParentShipping = titleAdminParentShipping.getText();
        titleSubmenu(testTitleAdminParentShipping);

        //обновить страницу
        sleep(2000);
        driver.navigate().refresh();

        //проверка, что пользователь остался на той же странице после обновления
        WebElement sameTitleAdminParentShipping = driver.findElement(By.className("page-title"));
        if (sameTitleAdminParentShipping.getText().equals(testTitleAdminParentShipping)) {
            System.out.println(OK);
        } else {
            System.out.println(BAD);
        }

        //----- Payment -----
        sleep(4000);
        WebElement AdminParentPayment = driver.findElement(By.id("subtab-AdminParentPayment"));
        AdminParentPayment.click();

        //вывести в консоль заголовок открытого раздела
        WebElement titleAdminParentPayment = driver.findElement(By.className("page-title"));
        String testTitleAdminParentPayment = titleAdminParentPayment.getText();
        titleSubmenu(testTitleAdminParentPayment);

        //обновить страницу
        sleep(2000);
        driver.navigate().refresh();

        //проверка, что пользователь остался на той же странице после обновления
        WebElement sameTitleAdminParentPayment = driver.findElement(By.className("page-title"));
        if (sameTitleAdminParentPayment.getText().equals(testTitleAdminParentPayment)) {
            System.out.println(OK);
        } else {
            System.out.println(BAD);
        }

        //----- International -----
        sleep(4000);
        WebElement AdminInternational = driver.findElement(By.id("subtab-AdminInternational"));
        AdminInternational.click();

        //вывести в консоль заголовок открытого раздела
        WebElement titleAdminInternational = driver.findElement(By.className("page-title"));
        String testTitleAdminInternational = titleAdminInternational.getText();
        titleSubmenu(testTitleAdminInternational);

        //обновить страницу
        sleep(2000);
        driver.navigate().refresh();

        //проверка, что пользователь остался на той же странице после обновления
        WebElement sameTitleAdminInternational = driver.findElement(By.className("page-title"));
        if (sameTitleAdminInternational.getText().equals(testTitleAdminInternational)) {
            System.out.println(OK);
        } else {
            System.out.println(BAD);
        }


        //--------------- Category CONFIGURE ---------------

        //----- ShopParameters -----
        sleep(4000);
        WebElement ShopParameters = driver.findElement(By.id("subtab-ShopParameters"));
        ShopParameters.click();

        //вывести в консоль заголовок открытого раздела
        WebElement titleShopParameters = driver.findElement(By.className("page-title"));
        String testTitleShopParameters = titleShopParameters.getText();
        titleSubmenu(testTitleShopParameters);

        //обновить страницу
        sleep(2000);
        driver.navigate().refresh();

        //проверка, что пользователь остался на той же странице после обновления
        WebElement sameTitleShopParameters = driver.findElement(By.className("page-title"));
        if (sameTitleShopParameters.getText().equals(testTitleShopParameters)) {
            System.out.println(OK);
        } else {
            System.out.println(BAD);
        }

        //----- AdvancedParameters -----
        sleep(4000);
        WebElement AdminAdvancedParameters = driver.findElement(By.id("subtab-AdminAdvancedParameters"));
        AdminAdvancedParameters.click();

        //вывести в консоль заголовок открытого раздела
        WebElement titleAdminAdvancedParameters = driver.findElement(By.className("page-title"));
        String testTitleAdminAdvancedParameters = titleAdminAdvancedParameters.getText();
        titleSubmenu(testTitleAdminAdvancedParameters);

        //обновить страницу
        sleep(2000);
        driver.navigate().refresh();

        //проверка, что пользователь остался на той же странице после обновления
        WebElement sameTitleAdminAdvancedParameters = driver.findElement(By.className("page-title"));
        if (sameTitleAdminAdvancedParameters.getText().equals(testTitleAdminAdvancedParameters)) {
            System.out.println(OK);
        } else {
            System.out.println(BAD);
        }
    }


    //подключаем веб-драйвер для Chrome из папки "resources"
    public static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", B_homeTask_2.class.getResource("chromedriver.exe").getPath());
        return new ChromeDriver();
    }

    //ожидание загрузки контента
    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //вывод в консоль заголовка раздела
    public static void titleSubmenu(String title) {
        System.out.print(title);
    }
}
