package pageclass;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class TrustedContact extends GlobalCap{
	
	By AllAcountListed = By.xpath("//input[@alt_id='TrustedContact_AllAccounts']");
	
	By AccountNumber_NFS1 = By.xpath("//input[@alt_id='TrustedContact_AccountNumberType1_1']");
	By AccountNumber_NonNFS1 = By.xpath("//input[@alt_id='TrustedContact_AccountNumberType1_2']");
	By AccountNumber1 = By.xpath("//input[@alt_id='TrustedContact_AccountNumber1']");
	
	By AccountNumber_NFS2 = By.xpath("//input[@alt_id='TrustedContact_AccountNumberType2_1']");
	By AccountNumber_NonNFS2 = By.xpath("//input[@alt_id='TrustedContact_AccountNumberType2_2']");
	By AccountNumber2 = By.xpath("//input[@alt_id='TrustedContact_AccountNumber2']");
	
	By AccountNumber_NFS3 = By.xpath("//input[@alt_id='TrustedContact_AccountNumberType3_1']");
	By AccountNumber_NonNFS3 = By.xpath("//input[@alt_id='TrustedContact_AccountNumberType3_2']");
	By AccountNumber3 = By.xpath("//input[@alt_id='TrustedContact_AccountNumber3']");
	
	By AccountNumber_NFS4 = By.xpath("//input[@alt_id='TrustedContact_AccountNumberType4_1']");
	By AccountNumber_NonNFS4 = By.xpath("//input[@alt_id='TrustedContact_AccountNumberType4_2']");
	By AccountNumber4 = By.xpath("//input[@alt_id='TrustedContact_AccountNumber4']");
	
	By AccountNumber_NFS5 = By.xpath("//input[@alt_id='TrustedContact_AccountNumberType5_1']");
	By AccountNumber_NonNFS5 = By.xpath("//input[@alt_id='TrustedContact_AccountNumberType5_2']");
	By AccountNumber5 = By.xpath("//input[@alt_id='TrustedContact_AccountNumber5']");
	
	By AccountNumber_NFS6 = By.xpath("//input[@alt_id='TrustedContact_AccountNumberType6_1']");
	By AccountNumber_NonNFS6 = By.xpath("//input[@alt_id='TrustedContact_AccountNumberType6_2']");
	By AccountNumber6 = By.xpath("//input[@alt_id='TrustedContact_AccountNumber6']");
	
	By TrustedContact_fulllegalName = By.xpath("//input[@id='flda_63']");
	By TrustedContact_RelationshiptoAccountOwner = By.xpath("//input[@id='flda_86']");
	By TrustedContact_Telephone = By.xpath("//input[@id='flda_88']");
	By TrustedContact_Streetone = By.xpath("//input[@id='flda_160']");
	By TrustedContact_Streettwo = By.xpath("//input[@id='flda_161']");
	By TrustedContact_StreetThree = By.xpath("//input[@id='flda_162']");
	By TrustedContact_City = By.xpath("//input[@id='flda_159']");
	By TrustedContact_State = By.xpath("//select[@id='lb_163']");
	By TrustedContact_ZipCode = By.xpath("//input[@id='flda_164']");
	
	
	By JointTenant_AllAcountListed = By.xpath("//input[@alt_id='TrustedContact_Joint_AllAccounts']");
	By JointTenant_FullLegalname = By.xpath("//input[@alt_id='TrustedContact_Joint_FullName']");
	By JointTenant_SSN = By.xpath("//input[@alt_id='TrustedContact_Joint_SSN']");
	
	
	By JointTenant_AccountNumber_NFS1 = By.xpath("//input[@alt_id='TrustedContact_Joint_AccountNumberType1_1']");
	By JointTenant_AccountNumber_NonNFS1 = By.xpath("//input[@alt_id='TrustedContact_Joint_AccountNumberType1_2']");
	By JointTenant_AccountNumber1 = By.xpath("//input[@alt_id='TrustedContact_Joint_AccountNumber1']");
	
	By JointTenant_AccountNumber_NFS2 = By.xpath("//input[@alt_id='TrustedContact_Joint_AccountNumberType2_1']");
	By JointTenant_AccountNumber_NonNFS2 = By.xpath("//input[@alt_id='TrustedContact_Joint_AccountNumberType2_2']");
	By JointTenant_AccountNumber2 = By.xpath("//input[@alt_id='TrustedContact_Joint_AccountNumber2']");
	
	By JointTenant_AccountNumber_NFS3 = By.xpath("//input[@alt_id='TrustedContact_Joint_AccountNumberType3_1']");
	By JointTenant_AccountNumber_NonNFS3 = By.xpath("//input[@alt_id='TrustedContact_Joint_AccountNumberType3_2']");
	By JointTenant_AccountNumber3 = By.xpath("//input[@alt_id='TrustedContact_Joint_AccountNumber3']");
	
	By JointTenant_AccountNumber_NFS4 = By.xpath("//input[@alt_id='TrustedContact_Joint_AccountNumberType4_1']");
	By JointTenant_AccountNumber_NonNFS4 = By.xpath("//input[@alt_id='TrustedContact_Joint_AccountNumberType4_2']");
	By JointTenant_AccountNumber4 = By.xpath("//input[@alt_id='TrustedContact_Joint_AccountNumber4']");
	
	By JointTenant_AccountNumber_NFS5 = By.xpath("//input[@alt_id='TrustedContact_Joint_AccountNumberType5_1']");
	By JointTenant_AccountNumber_NonNFS5 = By.xpath("//input[@alt_id='TrustedContact_Joint_AccountNumberType5_2']");
	By JointTenant_AccountNumber5 = By.xpath("//input[@alt_id='TrustedContact_Joint_AccountNumber5']");
	
	By JointTenant_AccountNumber_NFS6 = By.xpath("//input[@alt_id='TrustedContact_Joint_AccountNumberType6_1']");
	By JointTenant_AccountNumber_NonNFS6 = By.xpath("//input[@alt_id='TrustedContact_Joint_AccountNumberType6_2']");
	By JointTenant_AccountNumber6 = By.xpath("//input[@alt_id='TrustedContact_Joint_AccountNumber6']");
	
	By JointTenant_TrustedContact_Yes = By.xpath("//input[@id='rdo_138_1']");
	By JointTenant_TrustedContact_No = By.xpath("//input[@id='rdo_138_2']");
	
	By JointTenant_TrustedContact_fulllegalName = By.xpath("//input[@id='flda_190']");
	By JointTenant_TrustedContact_RelationshiptoAccountOwner = By.xpath("//input[@id='flda_191']");
	By JointTenant_TrustedContact_Telephone = By.xpath("//input[@id='flda_177']");
	By JointTenant_TrustedContact_Streetone = By.xpath("//input[@id='flda_185']");
	By JointTenant_TrustedContact_Streettwo = By.xpath("//input[@id='flda_186']");
	By JointTenant_TrustedContact_StreetThree = By.xpath("//input[@id='flda_187']");
	By JointTenant_TrustedContact_City = By.xpath("//input[@id='flda_184']");
	By JointTenant_TrustedContact_State = By.xpath("//select[@id='lb_188']");
	By JointTenant_TrustedContact_ZipCode = By.xpath("//input[@id='flda_174']");
	By Next = By.xpath("//button[contains(text(),'Next')]");
	By TrustedContact_Heading = By.xpath("//h1[text()='Trusted Contact']");
	By WouldliketoaddJointTenantOne_Yes = By.xpath("//input[@alt_id='TrustedContact_HasJointContact_1']");
	By WouldliketoaddJointTenantOne_No = By.xpath("//input[@alt_id='TrustedContact_HasJointContact_2']");
	By JointTenantOneHeading = By.xpath("//p[@alt_id='lblJointInfo']");
	By JointTenantFullName = By.xpath("//input[@alt_id='TrustedContact_Joint_FullName']");
	By JointTenantSSN_TIN = By.xpath("//input[@alt_id='TrustedContact_Joint_SSN']");
	By JointTenant_AllAcountListedtwo = By.xpath("//input[@alt_id='TrustedContact_Joint_AllAccounts']");
	
	
	public void test(String AllaccountListed, String AccountNumbr1, String AccountNo1, String AccountNumbr2,
			String AccountNo2, String AccountNumbr3, String AccountNo3, String AccountNumbr4, String AccountNo4,
			String AccountNumbr5, String AccountNo5, String AccountNumbr6, String AccountNo6,
			String Indiv_fulllegalname, String Indiv_relationshipaccountowner, String trustedContact_telephone,
			String Indiv_streetone, String Indiv_streettwo, String Indiv_streetThree, String Indiv_city,
			String Indiv_state, String Indiv_zipCode, String wouldliketoaddJointTenantOne,String JointTenantfullName,String JointTenantSSN_tIN,
			String JointTenant_allAcountListed, String JointTeanent_AccountNumbr1, String JointTeanent_AccountNo1, String JointTeanent_AccountNumbr2,
			String JointTeanent_AccountNo2, String JointTeanent_AccountNumbr3, String JointTeanent_AccountNo3,
			String JointTeanent_AccountNumbr4, String JointTeanent_AccountNo4, String JointTeanent_AccountNumbr5,
			String JointTeanent_AccountNo5, String JointTeanent_AccountNumbr6, String JointTeanent_AccountNo6,
			String jointTenant_TrustedContact_fulllegalName,
			String jointTenant_TrustedContact_RelationshiptoAccountOwner, String jointTenant_TrustedContact_Streetone,
			String jointTenant_TrustedContact_Streettwo, String jointTenant_TrustedContact_StreetThree,
			String jointTenant_TrustedContact_City, String jointTenant_TrustedContact_State,
			String jointTenant_TrustedContact_ZipCode) {

		if ($(TrustedContact_Heading).isDisplayed()) {
			if(AllaccountListed.equalsIgnoreCase("Yes")){
				$(AllAcountListed).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
			if(AccountNumbr1.equalsIgnoreCase("NFS")){
				$(AccountNumber_NFS1).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}else if(AccountNumbr1.equalsIgnoreCase("Non-NFS")){
				$(AccountNumber_NonNFS1).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
		    $(AccountNumber1).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AccountNo1);
		    
		    
		    
		    if(AccountNumbr2.equalsIgnoreCase("NFS")){
				$(AccountNumber_NFS2).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}else if(AccountNumbr2.equalsIgnoreCase("Non-NFS")){
				$(AccountNumber_NonNFS2).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
		    $(AccountNumber2).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AccountNo2);
		    
		    
		    if(AccountNumbr3.equalsIgnoreCase("NFS")){
				$(AccountNumber_NFS3).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}else if(AccountNumbr3.equalsIgnoreCase("Non-NFS")){
				$(AccountNumber_NonNFS3).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
		    $(AccountNumber3).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AccountNo3);
		    
		    
		    if(AccountNumbr4.equalsIgnoreCase("NFS")){
				$(AccountNumber_NFS4).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}else if(AccountNumbr4.equalsIgnoreCase("Non-NFS")){
				$(AccountNumber_NonNFS4).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
		    $(AccountNumber4).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AccountNo4);
		    
		    
		    if(AccountNumbr5.equalsIgnoreCase("NFS")){
				$(AccountNumber_NFS5).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}else if(AccountNumbr5.equalsIgnoreCase("Non-NFS")){
				$(AccountNumber_NonNFS5).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
		    $(AccountNumber5).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AccountNo5);
		    
		    if(AccountNumbr6.equalsIgnoreCase("NFS")){
				$(AccountNumber_NFS6).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}else if(AccountNumbr6.equalsIgnoreCase("Non-NFS")){
				$(AccountNumber_NonNFS6).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
			}
		    $(AccountNumber6).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(AccountNo6);
		    	    
		    $(TrustedContact_fulllegalName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Indiv_fulllegalname);
			$(TrustedContact_RelationshiptoAccountOwner).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Indiv_relationshipaccountowner);
			$(TrustedContact_Telephone).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(trustedContact_telephone);
		    $(TrustedContact_Streetone).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Indiv_streetone);
			$(TrustedContact_Streettwo).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Indiv_streettwo);
			$(TrustedContact_StreetThree).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Indiv_streetThree);
			$(TrustedContact_City).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Indiv_city);
			$(TrustedContact_State).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(Indiv_state);
			$(TrustedContact_ZipCode).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + Indiv_zipCode);
		    
		    //JointTenantHeading---One -------------
	
			GlobalCap.selectRadioYesorNo(WouldliketoaddJointTenantOne_Yes, WouldliketoaddJointTenantOne_No, wouldliketoaddJointTenantOne);
			if($(JointTenantOneHeading).isDisplayed()){
				$(JointTenantFullName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(JointTenantfullName);
				$(JointTenantSSN_TIN).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(JointTenantSSN_tIN);
				if(JointTenant_allAcountListed.equalsIgnoreCase("Yes")){
					$(JointTenant_AllAcountListedtwo).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
				}
				if(wouldliketoaddJointTenantOne.equalsIgnoreCase("Yes")){
			    	if(JointTeanent_AccountNumbr1.equalsIgnoreCase("NFS")){
						$(JointTenant_AccountNumber_NFS1).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					}else if(JointTeanent_AccountNumbr1.equalsIgnoreCase("Non-NFS")){
						$(JointTenant_AccountNumber_NonNFS1).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					}
				    $(JointTenant_AccountNumber1).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(JointTeanent_AccountNo1);
				    
				    if(JointTeanent_AccountNumbr2.equalsIgnoreCase("NFS")){
						$(JointTenant_AccountNumber_NFS2).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					}else if(JointTeanent_AccountNumbr2.equalsIgnoreCase("Non-NFS")){
						$(JointTenant_AccountNumber_NonNFS2).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					}
				    $(JointTenant_AccountNumber2).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(JointTeanent_AccountNo2);
				    
				    
				    if(JointTeanent_AccountNumbr3.equalsIgnoreCase("NFS")){
						$(JointTenant_AccountNumber_NFS3).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					}else if(JointTeanent_AccountNumbr3.equalsIgnoreCase("Non-NFS")){
						$(JointTenant_AccountNumber_NonNFS3).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					}
				    $(JointTenant_AccountNumber3).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(JointTeanent_AccountNo3);
				    if(JointTeanent_AccountNumbr4.equalsIgnoreCase("NFS")){
						$(JointTenant_AccountNumber_NFS4).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					}else if(JointTeanent_AccountNumbr4.equalsIgnoreCase("Non-NFS")){
						$(JointTenant_AccountNumber_NonNFS4).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					}
				    $(JointTenant_AccountNumber4).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(JointTeanent_AccountNo4);
				    if(JointTeanent_AccountNumbr5.equalsIgnoreCase("NFS")){
						$(JointTenant_AccountNumber_NFS5).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					}else if(JointTeanent_AccountNumbr5.equalsIgnoreCase("Non-NFS")){
						$(JointTenant_AccountNumber_NonNFS5).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					}
				    $(JointTenant_AccountNumber5).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(JointTeanent_AccountNo5);
				    if(JointTeanent_AccountNumbr6.equalsIgnoreCase("NFS")){
						$(JointTenant_AccountNumber_NFS6).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					}else if(JointTeanent_AccountNumbr6.equalsIgnoreCase("Non-NFS")){
						$(JointTenant_AccountNumber_NonNFS6).shouldBe(Visible.exist, Duration.ofSeconds(15)).click();
					}
				    $(JointTenant_AccountNumber6).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(JointTeanent_AccountNo1);
				    $(JointTenant_TrustedContact_fulllegalName).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(jointTenant_TrustedContact_fulllegalName);
					$(JointTenant_TrustedContact_RelationshiptoAccountOwner).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(jointTenant_TrustedContact_RelationshiptoAccountOwner);
				    $(JointTenant_TrustedContact_Streetone).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(jointTenant_TrustedContact_Streetone);
					$(JointTenant_TrustedContact_Streettwo).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(jointTenant_TrustedContact_Streettwo);
					$(JointTenant_TrustedContact_StreetThree).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(jointTenant_TrustedContact_StreetThree);
					$(JointTenant_TrustedContact_City).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(jointTenant_TrustedContact_City);
					$(JointTenant_TrustedContact_State).shouldBe(Visible.exist, Duration.ofSeconds(15)).selectOptionContainingText(jointTenant_TrustedContact_State);
					$(JointTenant_TrustedContact_ZipCode).shouldBe(Visible.exist, Duration.ofSeconds(15)).setValue(Keys.HOME + jointTenant_TrustedContact_ZipCode);		
					$(Next).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
			    }
			}	    


		}

	}
}
