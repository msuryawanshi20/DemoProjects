package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.SalesforcePage;

@SalesforcePage( title="Rstk__reqstopos"                                
               , summary=""
               , page="ReqsToPOs"
               , namespacePrefix="rstk"
               , object="rstk__poitemvend__c"
               , connection="QARSF_Admin"
     )             
public class rstk__reqstopos {

	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/input")
	public WebElement convertRequisitionSToPO;
	
}
