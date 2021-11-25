package com.tsoft.bot.frontend.pages.objects;

import org.openqa.selenium.By;

public class MyStoreObjects {
    private MyStoreObjects() {
    }

    //PAGE1
    public static final By BTN_SIGNIN         = By.className("login");
    //PAGE2
    public static final By TXT_EMAIL          = By.id("email_create");
    public static final By BTN_CREAR          = By.id("SubmitCreate");
    //PAGE3
    public static final By RAD_MR             = By.id("id_gender1");
    public static final By RAD_MRS            = By.id("id_gender2");
    public static final By TXT_NOMBRE         = By.id("customer_firstname");
    public static final By TXT_APELLIDO       = By.id("customer_lastname");
    public static final By TXT_CLAVE          = By.id("passwd");
    public static final By LIST_DIA           = By.id("days");
    public static final By LIST_MES           = By.id("months");
    public static final By LIST_ANIO          = By.id("years");
    public static final By TXT_CIA            = By.id("company");
    public static final By TXT_DIRECCION      = By.id("address1");
    public static final By TXT_CIUDAD         = By.id("city");
    public static final By LIST_ESTADO        = By.id("id_state");
    public static final By TXT_CODPOS         = By.id("postcode");
    public static final By TXT_CELULAR        = By.id("phone_mobile");
    public static final By TXT_REF            = By.id("alias");
    public static final By BTN_REGISTRAR      = By.id("submitAccount");
    //PAGE4
    public static final By VAL_LINK           = By.className("info-account");
}