package com.tsoft.bot.frontend.pages.pages.login;

import com.tsoft.bot.frontend.base.BaseClass;
import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.pages.objects.ExcelDataObjects;
import com.tsoft.bot.frontend.pages.objects.ExcelDataObjectsMyStore;
import com.tsoft.bot.frontend.pages.objects.MyStoreObjects;
import com.tsoft.bot.frontend.utility.ExcelReader;
import com.tsoft.bot.frontend.utility.GenerateWord;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.List;

public class MyStorePage extends BaseClass {

    private WebDriver driver;
    private static GenerateWord generateWord = new GenerateWord();
    String mensaje;
    public MyStorePage(WebDriver driver){
        super(driver);
        this.driver = Hook.getDriver();
    }

    private List<HashMap<String, String>> getData() throws Throwable {
        return ExcelReader.data(ExcelDataObjectsMyStore.EXCEL_DOC, ExcelDataObjectsMyStore.PAGE_NAME);
    }

    public void enterUrl(String urlTestCase) throws Throwable {
        mensaje = "Se ingresa a la Web My Store";
        try {
            int countPage = Integer.parseInt(urlTestCase) - 1;
            String url = getData().get(countPage).get(ExcelDataObjectsMyStore.COLUMN_URL);
            driver.get(url);
            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
            System.out.println("SE INGRESO A LA URL");
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjectsMyStore.EXCEL_DOC, ExcelDataObjectsMyStore.PAGE_NAME, 1, 30, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }
    }

    public void clickbotonSI() throws Throwable {
        mensaje = "Se da click en el botón Sign In";
        try {
            click(driver, MyStoreObjects.BTN_SIGNIN);
            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
            System.out.println("SE DIO CLICK EN EL BOTON SIGN IN");
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjectsMyStore.EXCEL_DOC, ExcelDataObjectsMyStore.PAGE_NAME, 1, 30, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }
    }

    public void ingresarCorreo(String correo) throws Throwable {
        mensaje = "Se ingresa el correo";
        try {
            int countPage = Integer.parseInt(correo) - 1;
            String email = getData().get(countPage).get(ExcelDataObjectsMyStore.COLUMN_CORREO);
            typeText(driver, MyStoreObjects.TXT_EMAIL, email);
            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
            System.out.println("SE INGRESA EL CORREO");
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjectsMyStore.EXCEL_DOC, ExcelDataObjectsMyStore.PAGE_NAME, 1, 30, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }
    }

    public void clickbotonRegistrar() throws Throwable {
        mensaje = "Se da click en el botón Registrar";
        try {
            click(driver, MyStoreObjects.BTN_CREAR);
            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
            System.out.println("SE DIO CLICK EN EL BOTON REGISTRAR");
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjectsMyStore.EXCEL_DOC, ExcelDataObjectsMyStore.PAGE_NAME, 1, 30, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }
    }

    public void valFormulario() throws Throwable {
        mensaje = "Se verifica el ingreso al formulario";
        try {
            driver.findElement(MyStoreObjects.RAD_MR);
            stepPass(driver, mensaje);
            generateWord.sendText(mensaje);
            generateWord.addImageToWord(driver);
            System.out.println("SE VERIFICA EL INGRESO AL FORMULARIO");
        }
        catch (Exception we)
        {
            ExcelReader.writeCellValue(ExcelDataObjectsMyStore.EXCEL_DOC, ExcelDataObjectsMyStore.PAGE_NAME, 1, 30, "FAIL");
            stepFail(driver,"Fallo en tiempo de respuesta : " + we.getMessage());
            generateWord.sendText("Fallo en tiempo de respuesta");
            generateWord.addImageToWord(driver);
        }
    }
}
