package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class catatanUang {

    public AndroidDriver<MobileElement>driver;
    @AndroidFindBy(id = "com.chad.financialrecord:id/ivLogo")
    private MobileElement BtnLogo;

//locator
    @AndroidFindBy(id = "com.chad.financialrecord:id/fabMenu")
    private MobileElement Btnadd;
    @AndroidFindBy(id = "com.chad.financialrecord:id/btnExpense")
    private MobileElement BtnExpenses;
    @AndroidFindBy(id = "com.chad.financialrecord:id/btnIncome")
    private MobileElement BtnIncome;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"06 Maret 2023\"]")
    private MobileElement BtnDate;
    @AndroidFindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.Spinner/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
    private MobileElement BtndropdownCat;
    @AndroidFindBy(id = "com.chad.financialrecord:id/tvName")
    private MobileElement BtnCatChoose;
    @AndroidFindBy(id = "com.chad.financialrecord:id/etAmount")
    private MobileElement Btnamount;
    @AndroidFindBy(id = "com.chad.financialrecord:id/etNote")
    private MobileElement BtnNote;
    @AndroidFindBy(id = "com.chad.financialrecord:id/btSave")
    private MobileElement BtnSave;

    public catatanUang(AndroidDriver<MobileElement>Driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

//    Methods
    public void addExpense(){
        BtnLogo.click();
        Btnadd.click();
        BtnExpenses.click();
        BtnDate.click();
        BtndropdownCat.click();
        BtnCatChoose.click();
        Btnamount.click();
        BtnNote.click();
        BtnSave.click();

    }

    public void addIncome(){
        BtnLogo.click();
        Btnadd.click();
        BtnIncome.click();
        BtnDate.click();
        BtndropdownCat.click();
        BtnCatChoose.click();
        Btnamount.click();
        BtnNote.click();
        BtnSave.click();

    }





}


