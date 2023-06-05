package pynegocio;

import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.openqa.selenium.By;
import static org.openqa.selenium.By.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.Wait;
import java.io.File;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class PymeSol {
    private static WebDriver driver;
    public static void click(WebElement element) {

        element.click();
    }

    private static void getTex(WebElement firstSelectedOption) {}

    public static void main(String[] args) throws InterruptedException, IOException{
        String pyMe = "https://creditonegocio2.azurewebsites.net/Registro?op=2";
        System.setProperty("web-driver.chrome.driver", "C:\\Driver\\chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new EdgeDriver();
        Wait<WebDriver> esp = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(2));
        
        driver.get(pyMe);

        {
            //Comencemos con tu registro Etapa Error
            driver.findElement(id("CrearReg")).click();
            Thread.sleep(300);
            driver.findElement(xpath("/html/body/div[2]/div/div[2]"));
            driver.findElement(xpath("/html/body/div[2]/div/div[3]/button[1]")).click();//Modal
            Thread.sleep(300);
            driver.findElement(xpath("/html/body/div/div[1]/div[3]/div/div[2]/div[1]/label[2]"));//Nombre error
            driver.findElement(xpath("/html/body/div/div[1]/div[3]/div/div[2]/div[2]/label[2]"));//Nombrre empresa error
            driver.findElement(xpath("/html/body/div/div[1]/div[3]/div/div[3]/div[1]/label[2]"));//Cantidad que necesitas error
            driver.findElement(xpath("/html/body/div/div[1]/div[3]/div/div[3]/div[2]/label[2]"));//RFC Empresa error           
            driver.findElement(xpath("/html/body/div/div[1]/div[3]/div/div[4]/div[1]/label[2]"));//Telefono celular error
            driver.findElement(xpath("/html/body/div/div[1]/div[3]/div/div[4]/div[2]/label[2]"));//Correo error
            driver.findElement(xpath("/html/body/div/div[1]/div[3]/div/div[5]/div[1]/div/label[2]"));//Pass error
            driver.findElement(xpath("/html/body/div/div[1]/div[3]/div/div[5]/div[2]/div/label[1]"));//Pass conf error            
        }
        {
            //Comencemos Registro Etapa llenado 
            driver.findElement(id("nombre")).sendKeys("Braulio Garza");
            driver.findElement(id("nombrecomercial")).sendKeys("Totis");
            driver.findElement(id("montocredito")).sendKeys("30000");            
        }
    }

    
}
