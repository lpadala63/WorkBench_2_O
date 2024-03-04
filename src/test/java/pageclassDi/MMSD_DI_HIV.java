
package pageclassDi;

import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.conditions.Visible;

import commonutils.GlobalCap;

public class MMSD_DI_HIV extends GlobalCap {
       // Type1:
       By personalPhysician_Yes = By.xpath("//input[@id='rdo_57_1' or @name='rdo_57_1']");
       By personalPhysician_No = By.xpath("//input[@id='rdo_57_2' or @name='rdo_57_2']");
       By HIV_FirstName = By.xpath("//input[@id='flda_14' and @name='flda_14' ]");
       By HIV_LastName = By.xpath("//input[@id='flda_30' or @name='flda_30' ]");
       By HIV_Address = By.xpath("//input[@id='flda_18' or @name='flda_18' ]");
       By HIV_City = By.xpath("//input[@id='flda_17' or @name='flda_17' ]");
       By HIV_State = By.xpath("//select[@id='lb_16' or @name='lb_16' ]");
       By HIV_Zipcode = By.xpath("//input[@id='flda_15' or @name='flda_15' ]");

       // Type2: Arrizona, California,Colorado
       By HIV_FirstNameTyp2 = By.xpath("//input[@id='flda_14' or @name='flda_14']");
       By HIV_LastNameTyp2 = By.xpath("//input[@id='flda_30' or @name='flda_30']");
       By HIV_AddressTyp2 = By.xpath("//input[@id='flda_18' or @name='flda_18' ]");
       By HIV_CityTyp2 = By.xpath("//input[@id='flda_17' or @name='flda_17' ]");
       By HIV_StateTyp2 = By.xpath("//select[@id='lb_16' or @name='lb_16' ]");
       By HIV_ZipcodeTyp2 = By.xpath("//input[@id='flda_15' or @name='flda_15']");

       // Type3: CT,
       By HIV4Phy = By.xpath("//input[@id='rdo_269_1' and @name='rdo_269_1']");
       By HIV4HC = By.xpath("//input[@id='rdo_269_2' and @name='rdo_269_2']");
       By HIV_HealthcareproviderName = By.xpath("//input[@id='flda_27' or @name='flda_27']");
       By HIV_AddressTyp3 = By.xpath("//input[@id='flda_41' or @name='flda_41' ]");
       By HIV_CityTyp3 = By.xpath("//input[@id='flda_39' or @name='flda_39' ]");
       By HIV_StateTyp3 = By.xpath("//select[@id='lb_37' or @name='lb_37' ]");
       By HIV_ZipcodeTyp3 = By.xpath("//input[@id='flda_35' or @name='flda_35' ]");

       // Type5
       By HIV5Examiner = By.xpath("//input[@id='flda_43' and @name='flda_43']");
       By HIV5Facility = By.xpath("//input[@id='flda_25' and @name='flda_25']");
       By HIV5City = By.xpath("//input[@id='flda_50' and @name='flda_50']");
       By HIV5State = By.xpath("//input[@id='lb_48' and @name='lb_48']");
       By HIV5Next = By.xpath("//button[@id='btn_4' and @name='btn_4']");

       // Type6
       By HIV6Me = By.xpath("//input[@id='rdo_281_1' and @name='rdo_281_1']");
       By HIV6Physician = By.xpath("//input[@id='rdo_281_2' and @name='rdo_281_2']");
       By HIV6PhyFname = By.xpath("//input[@id='flda_14' and @name='flda_14']");
       By HIV6PhyLname = By.xpath("//input[@id='flda_30' and @name='flda_30']");
       By HIV6PhyCity = By.xpath("//input[@id='flda_17' and @name='flda_17']");
       By HIV6PhyState = By.xpath("//select[@id='lb_16' and @name='lb_16']");
       By HIV6Next = By.xpath("//button[@id='btn_4' and @name='btn_4']");

       // Type7
       By HIV7Phy = By.xpath("//input[@id='rdo_77_1' and @name='rdo_77_1']");
       By HIV7OtherPerson = By.xpath("//input[@id='rdo_77_2' and @name='rdo_77_2']");
       By HIV7Entity = By.xpath("//input[@id='rdo_77_3' and @name='rdo_77_3']");
       By HIV7PhyFname = By.xpath("//input[@id='flda_14' and @name='flda_14']");
       By HIV7PhyLname = By.xpath("//input[@id='flda_30' and @name='flda_30']");
       By HIV7PhyCity = By.xpath("//input[@id='flda_17' and @name='flda_17']");
       By HIV7PhyState = By.xpath("//select[@id='lb_16' and @name='lb_16']");
       By HIV7OPFname = By.xpath("//input[@id='flda_14' and @name='flda_14']");
       By HIV7OPLname = By.xpath("//input[@id='flda_30' and @name='flda_30']");
       By HIV7OPCity = By.xpath("//input[@id='flda_17' and @name='flda_17']");
       By HIV7OPState = By.xpath("//select[@id='lb_16' and @name='lb_16']");
       By HIV7Entityname = By.xpath("//input[@id='flda_54' and @name='flda_54']");
       By HIV7EntityCity = By.xpath("//input[@id='flda_59' and @name='flda_59']");
       By HIV7EntityState = By.xpath("//select[@id='lb_58' and @name='lb_58']");
       By HIV7Next = By.xpath("//button[@id='btn_4' and @name='btn_4']");

       // Type8
       By HIV8Me = By.xpath("//input[@id='rdo_75_1' and @name='rdo_75_1']");
       By HIV8Physician = By.xpath("//input[@id='rdo_75_2' and @name='rdo_75_2']");
       By HIV8Designee = By.xpath("//input[@id='rdo_75_3' and @name='rdo_75_3']");
       By HIV8PhyFname = By.xpath("//input[@id='flda_14' and @name='flda_14']");
       By HIV8PhyLname = By.xpath("//input[@id='flda_30' and @name='flda_30']");
       By HIV8PhyCity = By.xpath("//input[@id='flda_17' and @name='flda_17']");
       By HIV8PhyState = By.xpath("//select[@id='lb_16' and @name='lb_16']");

       By HIV8DesigneeName = By.xpath("//input[@id='flda_54' and @name='flda_54']");
       By HIV8DCity = By.xpath("//input[@id='flda_59' and @name='flda_59']");
       By HIV8DState = By.xpath("//input[@id='lb_58' and @name='lb_58']");
       By HIV8Next = By.xpath("//button[@id='btn_4' and @name='btn_4']");

       GlobalCap GC = new GlobalCap();

       public void HivStates_Type1(String state, String personalphysician_RD, String Fname, String Lname, String Address,
                    String City, String State, String Zipcode) {

             String[] states_Type1 = new String[] { "Arizona", };
             for (int i = 0; i <= states_Type1.length - 1; i++) {
                    if (state.equalsIgnoreCase(states_Type1[i])) {

                           if ($(personalPhysician_Yes).isDisplayed()) {
                                  GC.selectRadioYesorNo(personalPhysician_Yes, personalPhysician_No, personalphysician_RD);
                           }

                           if (personalphysician_RD.equalsIgnoreCase("Yes")) {
                                 $(HIV_FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Fname);
                                 $(HIV_LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Lname);
                                 $(HIV_Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Address);
                                 $(HIV_City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(City);
                                 $(HIV_State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(State);
                                 $(HIV_Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Zipcode);

                           }
                           $(HIV8Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
                    }
             }
             
       }

       public void HivStates_Type2(String state, String personalphysician_RD, String Fname, String Lname, String Address,
                    String City, String State, String Zipcode) {

             String[] states_Type2 = new String[] { "California", "Colorado" };
             for (int i = 0; i <= states_Type2.length - 1; i++) {
                    if (state.equalsIgnoreCase(states_Type2[i])) {

                           if ($(personalPhysician_Yes).isDisplayed()) {
                                  GC.selectRadioYesorNo(personalPhysician_Yes, personalPhysician_No, personalphysician_RD);
                           }

                           $(HIV_FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Fname);
                           $(HIV_LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Lname);
                           $(HIV_Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Address);
                           $(HIV_City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(City);
                           $(HIV_State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(State);
                           $(HIV_Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Zipcode);
                           
                           $(HIV8Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
                    }
                    
             }
             
       }

       public void HivStates_Type3(String state, String physician_or_health, String Fname, String Lname, String Address,
                    String City, String State, String Zipcode, String HealthcareproviderName) {

             /*
             * String[] states=new String[] {"Washington D.C."
             * ,"Florida","Iowa","Kansas","Kentucky","Massachusetts","Maine",
             * "Michigan","Missouri","North Dakota","Nebraska","New Hampshire"
             * ,"New York","Ohio","Oregon",
             * "Pennsylvania","Rhode Island","Texas","Utah","Vermont","Virginia",
             * "Washington","West Virginia"}; for(int i=0; i<=states.length-1;i++){
             */
             String[] states_Type3 = new String[] { "Connecticut" };
             for (int i = 0; i <= states_Type3.length - 1; i++) {
                    if (state.equalsIgnoreCase(states_Type3[i])) {

                           if (physician_or_health.equalsIgnoreCase("Personal Physician")) {
                                 $(HIV4Phy).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
                                 $(HIV_FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Fname);
                                 $(HIV_LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Lname);
                                 $(HIV_Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Address);
                                 $(HIV_City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(City);
                                 $(HIV_State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(State);
                                 $(HIV_Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Zipcode);

                           } else if (physician_or_health.equalsIgnoreCase("Health Care Provider")) {
                                 $(HIV4HC).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
                                  $(HIV_HealthcareproviderName).shouldBe(Visible.exist, Duration.ofSeconds(30))
                                               .setValue(HealthcareproviderName);
                                 $(HIV_AddressTyp3).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Address);
                                 $(HIV_CityTyp3).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(City);
                                 $(HIV_StateTyp3).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(State);
                                 $(HIV_ZipcodeTyp3).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Zipcode);

                           }
                           $(HIV8Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
                    }
                    
             }
             
       }

       // Type4
       By HIV4Physcian = By.xpath("//input[@id='rdo_271_1' and @name='rdo_271_1']");
       By HIV4HCP = By.xpath("//input[@id='rdo_271_2' and @name='rdo_271_2']");
       By HIV4IDontWIsh = By.xpath("//input[@id='rdo_271_3' and @name='rdo_271_3']");
       By HIV4Next = By.xpath("//button[@id='btn_4' and @name='btn_4']");

       By HIV4HCName = By.xpath("//input[@id='flda_27' and @name='flda_27']");
       By HIV4HVCity = By.xpath("//input[@id='flda_39' and @name='flda_39']");
       By HIV4HVState = By.xpath("//select[@id='lb_37' and @name='lb_37']");

       public void HivStates_Type4(String state, String physician_or_health, String Fname, String Lname, String Address,
                    String City, String State, String Zipcode, String HealthcareproviderName) {

             /*
             * String[] states=new String[] {
             * "Iowa","Kansas","Kentucky","Massachusetts","Maine",
             * "Michigan","Missouri","North Dakota","Nebraska","New Hampshire"
             * ,"New York","Ohio","Oregon",
             * "Pennsylvania","Rhode Island","Texas","Utah","Vermont","Virginia",
             * "Washington","West Virginia"}; for(int i=0; i<=states.length-1;i++){
             */
             String[] states_Type4 = new String[] { "Washington D.C.", "Florida" };
             for (int i = 0; i <= states_Type4.length - 1; i++) {
                    if (state.equalsIgnoreCase(states_Type4[i])) {

                           if (physician_or_health.equalsIgnoreCase("Physician")) {
                                 $(HIV4Physcian).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
                                 $(HIV_FirstName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Fname);
                                 $(HIV_LastName).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Lname);
                                 $(HIV_Address).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Address);
                                 $(HIV_City).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(City);
                                 $(HIV_State).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(State);
                                 $(HIV_Zipcode).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Zipcode);

                           } else if (physician_or_health.equalsIgnoreCase("Health Care Provider")) {
                                 $(HIV4HCP).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
                                  $(HIV_HealthcareproviderName).shouldBe(Visible.exist, Duration.ofSeconds(30))
                                               .setValue(HealthcareproviderName);
                                 $(HIV_AddressTyp3).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Address);
                                 $(HIV_CityTyp3).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(City);
                                 $(HIV_StateTyp3).shouldBe(Visible.exist, Duration.ofSeconds(30)).selectOptionContainingText(State);
                                 $(HIV_ZipcodeTyp3).shouldBe(Visible.exist, Duration.ofSeconds(30)).setValue(Zipcode);

                           } else if (physician_or_health.equalsIgnoreCase("Physician or Health Care Provider")) {
                                 $(HIV4IDontWIsh).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();

                           }
                           $(HIV8Next).shouldBe(Visible.exist, Duration.ofSeconds(30)).click();
                    }
                    
             }
       
       }

}
