package pageobjects;

import org.openqa.selenium.WebElement;

import com.provar.core.testapi.annotations.AuraBy;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rootstock__ Record Edit"                                
               , summary=""
               , connection="Devqaff"
               , auraComponent="RecordEdit"
               , namespacePrefix="rootstock"
     )             
public class rootstock__RecordEdit {

	@TextType()
	@AuraBy(componentXPath = "//input[contains(@name,'sohdr_order__c')]", qualifier = "rstk__sohdr_order__c")
	public WebElement Order_Number;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@label= '{!v.label}']")
	public WebElement Customer;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value='{!v.currentRecord.rstk__sohdr_order__c}']", qualifier = "rstk__sohdr_order__c")
	public WebElement orderNumber;
	
}
