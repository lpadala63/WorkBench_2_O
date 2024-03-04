package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class MMSD_DI_RadiusChoice extends GlobalCap {

	By MonthlyBenefit = By.xpath("//input[@id='flda_135' or name='flda_135']");
	By BenefitPeriod = By
			.xpath("//label[text()='Benefit Period']//following-sibling::select[@id='lb_134' or @name='lb_134']");
	By WaitingPeriod = By
			.xpath("//label[text()='Waiting Period']//following-sibling::select[@id='lb_133' or @name='lb_133']");
	By UseOfPropsedInsured = By.xpath("//input[@id='cb_216' or @name='cb_216']");
	By Additional_Yes = By.xpath("//input[@id='rdo_169_1']");
	By Additional_No = By.xpath("//input[@id='rdo_169_2']");
	By RGSA = By.xpath("//input[@id='cb_114' or @name='cb_114']");
	By ProdNext = By.xpath("//button[@id='btn_11' or @name='btn_11']");
	
	By RC21Header=By.xpath("//span[contains(text(),'Radius Choice Product')]");
	//riders
	By OtherRiderHeading = By.xpath("//span[contains(text(),'Other Benefits and Riders')]");
	By MaximunBenefitPeriodEndorsement_CB = By.xpath("//input[@id='cb_248']");
	By SocialInsuranceRider_CB = By.xpath("//input[@id='cb_131']");
	By SocialInsuranceRider_MntlyBenfitAmount = By.xpath("//input[@id='flda_136']");
	By ExtendedPartialDisabilityBenefitsRider_CB = By.xpath("//input[@id='cb_130']");
	By AutomaticBenefitIncreaseRider_CB = By.xpath("//input[@id='cb_128']");
	By CatastrophicDisabilityBenefitRider_CB = By.xpath("//input[@id='cb_127']");
	By CatastrophicDisabilityMonthlyBenefit = By.xpath("//input[@id='flda_137']");
	By CatastrophicDisabilityBenefitPeriod = By.xpath("//select[@id='lb_139']");
	By CatastrophicDisabilityWaitingPeriod = By.xpath("//select[@id='lb_138']");
	By CostOfLivingRider_CB = By.xpath("//input[@id='cb_126']");
	By OwnOccupationRider_CB = By.xpath("//input[@id='cb_125']");
	By FutureInsurabilityOptionRider_CB = By.xpath("//input[@id='cb_124']");
	By FutureInsurabilityOptionRider_Amount = By.xpath("//input[@id='flda_140']");
	By BenefitIncreaseRider_CB = By.xpath("//input[@id='cb_180']");
	By ShortTermDisabilityBenefitsRiderOption1_CB = By.xpath("//input[@id='cb_123']");
	By ShortTermDisabilityBenefitRider_Option1_MonthlyBenefitAmount = By.xpath("//input[@id='flda_143']");
	By ShortTermDisabilityBenefitRider_Option1_WaitingPeriod_BenefitPeriod = By.xpath("//select[@id='lb_142']");
	By ShortTermDisabilityBenefitsRiderOption2_CB = By.xpath("//input[@id='cb_122']");
	By ShortTermDisabilityBenefitRider_Option2_MonthlyBenefitAmount = By.xpath("//input[@id='flda_144']");
	By GroupSupplementDisabilityBenefitsRider_CB = By.xpath("//input[@id='cb_121']");
	By GroupSupplementDisabilityBenefitsRider_CoverageA_CB = By.xpath("//input[@id='cb_120']");
	By GroupSupplementDisabilityBenefitsRider_CoverageA_MonthlyBenefit = By.xpath("//input[@id='flda_146']");
	By GroupSupplementDisabilityBenefitsRider_CoverageA_WaitingPeriod  = By.xpath("//select[@id='lb_145']");
	
	By GroupSupplementDisabilityBenefitsRider_CoverageB_CB = By.xpath("//input[@id='cb_119']");
	By GroupSupplementDisabilityBenefitsRider_CoverageB_MonthlyBenefit = By.xpath("//input[@id='flda_148']");
	By GroupSupplementDisabilityBenefitsRider_CoverageB_WaitingPeriod  = By.xpath("//select[@id='lb_147']");
	
	By RetireGuard_CB = By.xpath("//input[@id='cb_116']");
	By RetireGuard_MonthlyBenefit = By.xpath("//input[@id='flda_153']");
	By RetireGuard_BenefitPeriod = By.xpath("//select[@id='lb_152']");
	By RetireGuard_WaitingPeriod = By.xpath("//select[@id='lb_151']");
	By RetireGuard_AmountOfContribution = By.xpath("//input[@id='flda_154']");
	By RetireGuard_Frequency = By.xpath("//select[@id='lb_150']");
	By RetireGuard_EmployerAmount = By.xpath("//input[@id='flda_155']");
	By RetireGuard_EmployeeAmount  = By.xpath("//input[@id='flda_156']");
	
	
	By  RetireGuardFutureInsurabilityOption_CB = By.xpath("//input[@id='cb_159']");
	By RetireGuardFutureInsurabilityOption_Amount = By.xpath("//input[@id='flda_158']");
	
	By  RetireGuardCostofLivingOption_CB = By.xpath("//input[@id='cb_160']");
	By Next = By.xpath("//button[@id='btn_11' or @name='btn_11']");

	public void Radiochoiceproduct(String Product, String Monthlybenefit, String Benefitperiod, String Waitingperiod) {
		GlobalCap.pageload(60);
		if (Product.equalsIgnoreCase("Radius Choice 21")) {
			System.out.println("Executing RC21");
			GlobalCap.sleep(2000);
		$(MonthlyBenefit).shouldBe(Visible.exist, Duration.ofSeconds(60)).sendKeys(Monthlybenefit);

		$(BenefitPeriod).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(Benefitperiod);

		$(WaitingPeriod).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(Waitingperiod);
		}
	}

	public void RecipientOfBenefitsAssignment(String Product, String UseOfPI) {

		if (Product.equalsIgnoreCase("Radius Choice 21")) {
			System.out.println("Executing RC21+Recepient of Benefit");
			if (UseOfPI.equalsIgnoreCase("Yes")) {
				$(UseOfPropsedInsured).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

			} else if (UseOfPI.equalsIgnoreCase("No")) {
				// need to implement in future for No

			}
		}
	}
	
	public void RadioChoiceRiders(String DI_RC_MaximumBenefitPeriod_Rider,String DI_RC_SocialInsuranceRider,String DI_RC_SocialInsuranceRider_MntlyBenfit,String DI_RC_ExtendedPartialDiRider,String DI_RC_AutomaticBenefitIncreaseRider,
			String DI_RC_CatastrophicRider,String DI_RC_CatastrophicRider_MonthlyBenefit,String DI_RC_CatastrophicRider_BenefitPeriod,String DI_RC_CatastrophicRider_WaitingPeriod,String DI_Rc_CostOfLivingRider,String DI_RC_OwnOccupationRider,
			String DI_RC_FutureinsOptionRider_FIO,String DI_RC_FutureinsOptionRider_FIO_Amount,String DI_RC_BenefitIncreaseRider,String DI_RC_ShortTermDisabilityBenefitRider_Option1,String DI_RC_ShortTermDisabilityBenefitRider_Option1_MonthlyBenefitAmount,
			String DI_RC_ShortTermDisabilityBenefitRider_Option1_WaitingPeriod_BenefitPeriod,String DI_RC_ShortTermDisabilityBenefitRider_Option2,String DI_RC_ShortTermDisabilityBenefitRider_Option2_MonthlyBenefitAmount,String DI_RC_GroupSuppliementDisabilityRider,
			String DI_RC_GroupSuppliementDisabilityRider_CoverageA,String DI_RC_GroupSuppliementDisabilityRider_CoverageA_MonthlyBenefit,String DI_RC_GroupSuppliementDisabilityRider_CoverageA_WaitingPeriod,String DI_RC_GroupSuppliementDisabilityRider_CoverageB,
			String DI_RC_GroupSuppliementDisabilityRider_CoverageB_MonthlyBenefit,String DI_RC_GroupSuppliementDisabilityRider_CoverageB_WaitingPeriod,String DI_RC_RetireGuardRider,String DI_RC_RetireGuardRider_MonthlyBenefit,String DI_RC_RetireGuardRider_BenefitPeriod,String DI_RC_RetireGuardRider_WaitingPeriod,String DI_RC_RetireGuardRider_AmountOfContribution,String DI_RC_RetireGuardRider_Frequency,
			String DI_RC_RetireGuardRider_AmployerAmount,String DI_RC_RetireGuardRider_EmployeeAmount,String DI_RC_RetireGuardFutureInsurabilityOptionFIO,String DI_RC_RetireGuardFutureInsurabilityOptionFIO_Amount,String DI_RC_RetireGuardCostofLivingOptionCOLA) {
		
		if ($(RC21Header).isDisplayed()) {
			System.out.println("RC21 Riders");
			// *********************************Maximun Benefit Period Endorsement**************************************     retireGuard,
			if (DI_RC_MaximumBenefitPeriod_Rider.equalsIgnoreCase("Yes")) {
				if ($(MaximunBenefitPeriodEndorsement_CB).isDisplayed() && $(MaximunBenefitPeriodEndorsement_CB).isEnabled()) {
					$(MaximunBenefitPeriodEndorsement_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(500);
				} else {
					System.out.println("MaximunBenefitPeriodEndorsement Rider CheckBox is DISABLED - Please check the Condition");
				}
			}

			//  ********************************  Social Insurance Rider  ************************************************
			if (DI_RC_SocialInsuranceRider.equalsIgnoreCase("Yes")) {
				if ($(SocialInsuranceRider_CB).isDisplayed() && $(SocialInsuranceRider_CB).isEnabled()) {
					$(SocialInsuranceRider_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(500);
					$(SocialInsuranceRider_MntlyBenfitAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(DI_RC_SocialInsuranceRider_MntlyBenfit);
				} else {
					System.out.println("Social Insurance Rider CheckBox is DISABLED - Please check the Condition");
				}
			}
			
			
			//***************************************  Extended Partial Disability Benefits Rider  *****************************************
			if (DI_RC_ExtendedPartialDiRider.equalsIgnoreCase("Yes")) {
				if ($(ExtendedPartialDisabilityBenefitsRider_CB).isDisplayed() && $(ExtendedPartialDisabilityBenefitsRider_CB).isEnabled()) {
					$(ExtendedPartialDisabilityBenefitsRider_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(500);
				} else {
					System.out.println("Extended Partial Disability Benefits Rider is DISABLED - Please check the Condition");
				}
			}
			
			// ************************************  Automatic Benefit Increase Rider  ********************************************************** BOE
			if (DI_RC_AutomaticBenefitIncreaseRider.equalsIgnoreCase("Yes")) {
				if ($(AutomaticBenefitIncreaseRider_CB).isDisplayed() && $(AutomaticBenefitIncreaseRider_CB).isEnabled()) {
					$(AutomaticBenefitIncreaseRider_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(500);
				} else {
					System.out.println(" Automatic Benefit Increase Rider is DISABLED - Please check the Condition");
				}
			}
			
			
			//************************************** Catastrophic Disability Benefit Rider  *********************************************************
			if (DI_RC_CatastrophicRider.equalsIgnoreCase("Yes")) {
				if ($(CatastrophicDisabilityBenefitRider_CB).isDisplayed() && $(CatastrophicDisabilityBenefitRider_CB).isEnabled()) {
					$(CatastrophicDisabilityBenefitRider_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(500);
					$(CatastrophicDisabilityMonthlyBenefit).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(DI_RC_CatastrophicRider_MonthlyBenefit);
					$(CatastrophicDisabilityBenefitPeriod).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(DI_RC_CatastrophicRider_BenefitPeriod);
					$(CatastrophicDisabilityWaitingPeriod).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(DI_RC_CatastrophicRider_WaitingPeriod);
				} else {
					System.out.println("Catastrophic Disability Benefit Rider is DISABLED - Please check the Condition");
				}
			}
			
			//***************************************  Cost of Living Rider  *****************************************  retireGuard
			if (DI_Rc_CostOfLivingRider.equalsIgnoreCase("Yes")) {
				if ($(CostOfLivingRider_CB).isDisplayed() && $(CostOfLivingRider_CB).isEnabled()) {
					$(CostOfLivingRider_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(500);
				} else {
					System.out.println("Cost of Living Rider Rider is DISABLED - Please check the Condition");
				}
			}
			
			//*************************************** Own Occupation Rider  *****************************************
			if (DI_RC_OwnOccupationRider.equalsIgnoreCase("Yes")) {
				if ($(OwnOccupationRider_CB).isDisplayed() && $(OwnOccupationRider_CB).isEnabled()) {
					$(OwnOccupationRider_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(500);
				} else {
					System.out.println(" Own Occupation Rider is DISABLED - Please check the Condition");
				}
			}
			
			
			//***************************************Future Insurability Option Rider (FIO) Rider  *****************************************  retireGuard,BOE
			if (DI_RC_FutureinsOptionRider_FIO.equalsIgnoreCase("Yes")) {
				if ($(FutureInsurabilityOptionRider_CB).isDisplayed() && $(FutureInsurabilityOptionRider_CB).isEnabled()) {
					$(FutureInsurabilityOptionRider_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(500);
					$(FutureInsurabilityOptionRider_Amount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(DI_RC_FutureinsOptionRider_FIO_Amount);
				} else {
					System.out.println("Future Insurability Option Rider (FIO)  Rider is DISABLED - Please check the Condition");
				}
			}
			
			
			//*************************************** Benefit Increase Rider  *****************************************
			if (DI_RC_BenefitIncreaseRider.equalsIgnoreCase("Yes")) {
				if ($(BenefitIncreaseRider_CB).isDisplayed() && $(BenefitIncreaseRider_CB).isEnabled()) {
					$(BenefitIncreaseRider_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(500);
				} else {
					System.out.println(" Benefit Increase Rider DISABLED - Please check the Condition");
				}
			}
			
			
			//************************************** Short Term Disability Benefits Rider - Option 1  *********************************************************
			if (DI_RC_ShortTermDisabilityBenefitRider_Option1.equalsIgnoreCase("Yes")) {
				if ($(ShortTermDisabilityBenefitsRiderOption1_CB).isDisplayed() && $(ShortTermDisabilityBenefitsRiderOption1_CB).isEnabled()) {
					$(ShortTermDisabilityBenefitsRiderOption1_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(500);
					$(ShortTermDisabilityBenefitRider_Option1_MonthlyBenefitAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(DI_RC_ShortTermDisabilityBenefitRider_Option1_MonthlyBenefitAmount);
					$(ShortTermDisabilityBenefitRider_Option1_WaitingPeriod_BenefitPeriod).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(DI_RC_ShortTermDisabilityBenefitRider_Option1_WaitingPeriod_BenefitPeriod);
				} else {
					System.out.println("Short Term Disability Benefits Rider - Option 1 is DISABLED - Please check the Condition");
				}
			}
			
			//************************************** Short Term Disability Benefits Rider - Option 2  *********************************************************
			if (DI_RC_ShortTermDisabilityBenefitRider_Option2.equalsIgnoreCase("Yes")) {
				if ($(ShortTermDisabilityBenefitsRiderOption2_CB).isDisplayed() && $(ShortTermDisabilityBenefitsRiderOption2_CB).isEnabled()) {
					$(ShortTermDisabilityBenefitsRiderOption2_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(500);
					$(ShortTermDisabilityBenefitRider_Option2_MonthlyBenefitAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(DI_RC_ShortTermDisabilityBenefitRider_Option2_MonthlyBenefitAmount);
				} else {
					System.out.println("Short Term Disability Benefits Rider - Option 2 is DISABLED - Please check the Condition");
				}
			}
			
			
			//************************************** Group Supplement Disability Benefits Rider  *********************************************************
			if (DI_RC_GroupSuppliementDisabilityRider.equalsIgnoreCase("Yes")) {
				if ($(GroupSupplementDisabilityBenefitsRider_CB).isDisplayed() && $(GroupSupplementDisabilityBenefitsRider_CB).isEnabled()) {
					$(GroupSupplementDisabilityBenefitsRider_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(500);
					//*************************** Coverage A *************************************
					if (DI_RC_GroupSuppliementDisabilityRider_CoverageA.equalsIgnoreCase("Yes")) {
						$(GroupSupplementDisabilityBenefitsRider_CoverageA_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
						$(GroupSupplementDisabilityBenefitsRider_CoverageA_MonthlyBenefit).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(DI_RC_GroupSuppliementDisabilityRider_CoverageA_MonthlyBenefit);
						$(GroupSupplementDisabilityBenefitsRider_CoverageA_WaitingPeriod).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(DI_RC_GroupSuppliementDisabilityRider_CoverageA_WaitingPeriod);
					}
					//*************************** Coverage B *************************************
					if (DI_RC_GroupSuppliementDisabilityRider_CoverageB.equalsIgnoreCase("Yes")) {
						$(GroupSupplementDisabilityBenefitsRider_CoverageB_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
						$(GroupSupplementDisabilityBenefitsRider_CoverageB_MonthlyBenefit).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(DI_RC_GroupSuppliementDisabilityRider_CoverageB_MonthlyBenefit);
						$(GroupSupplementDisabilityBenefitsRider_CoverageB_WaitingPeriod).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(DI_RC_GroupSuppliementDisabilityRider_CoverageB_WaitingPeriod);
					}
				} else {
					System.out.println("Group Supplement Disability Benefits Rider is DISABLED - Please check the Condition");
				}
			}	
			
			//************************************** RetireGuard Rider  *********************************************************
			if (DI_RC_RetireGuardRider.equalsIgnoreCase("Yes")) {
				if ($(RetireGuard_CB).isDisplayed() && $(RetireGuard_CB).isEnabled()) {
					$(RetireGuard_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					GlobalCap.sleep(500);
					$(RetireGuard_MonthlyBenefit).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(DI_RC_RetireGuardRider_MonthlyBenefit);
					$(RetireGuard_BenefitPeriod).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(DI_RC_RetireGuardRider_BenefitPeriod);
					$(RetireGuard_WaitingPeriod).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(DI_RC_RetireGuardRider_WaitingPeriod);
				    $(RetireGuard_AmountOfContribution).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(DI_RC_RetireGuardRider_AmountOfContribution);
					$(RetireGuard_Frequency).shouldBe(Visible.exist, Duration.ofSeconds(60)).selectOptionContainingText(DI_RC_RetireGuardRider_Frequency);
					$(RetireGuard_EmployerAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(DI_RC_RetireGuardRider_AmployerAmount);
					$(RetireGuard_EmployeeAmount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(DI_RC_RetireGuardRider_EmployeeAmount);
					
					//*************************** Coverage B *************************************
					if (DI_RC_RetireGuardFutureInsurabilityOptionFIO.equalsIgnoreCase("Yes")) {
						$(RetireGuardFutureInsurabilityOption_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
						$(RetireGuardFutureInsurabilityOption_Amount).shouldBe(Visible.exist, Duration.ofSeconds(60)).setValue(DI_RC_RetireGuardFutureInsurabilityOptionFIO_Amount);
						
					}
					if (DI_RC_RetireGuardCostofLivingOptionCOLA.equalsIgnoreCase("Yes")) {
						$(RetireGuardCostofLivingOption_CB).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();
					}
				} else {
					System.out.println("RetireGuard Rider is DISABLED - Please check the Condition");
				}
			}	
		}
		
		
	}

	public void OtherBenefitsRiders(String Product1, String Additionalprod) {
		
		if (Product1.equalsIgnoreCase("Radius Choice 21")) {

			// need write the scripts for Rider Checkboxes
			GlobalCap.selectRadioYesorNo(Additional_Yes, Additional_No, Additionalprod);

			if (Additionalprod.equalsIgnoreCase("Yes")) {

				$(RGSA).shouldBe(Visible.exist, Duration.ofSeconds(60)).click();

				// need to implement more in future
			}

			$(Next).shouldBe(Visible.exist, Duration.ofSeconds(90)).click();

		}
	}
}
