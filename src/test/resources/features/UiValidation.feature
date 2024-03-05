#Author: lpadala63@massmutualcom
#UI Validation for workbench
Feature: UI Validation for workbench

  @headerValidation @INSWB-137 @INSWB-138
  Scenario Outline: Header Validation
    #Given Login into Workbench
    #And enter Password and launch Workbench
    Then validate workbench launch
    And validate header elements visibility
    And scroll down the page to verify header
    And navigate to All Cases and verify header
    And navigate to Workbasket and verify header
    And navigate to Pending and verify header
    And navigate to Issued & Reported Cases and verify header
    And navigate to Inactive and verify header
    And open every menu item in new tab and validate header
    And validate tooltip text for all menu items
    And perform export and validate header
    Then perform sort filter with <keyword> and complete header validation
    

    Examples: 
      | keyword |
      | smith   |

  @Functionality @INSWB-172
  Scenario Outline: Search Functionality
    #Given Login into Workbench
    #And enter Password and launch Workbench
    Then validate workbench launch
    And verify search tooltips
    And perform search using <keyword> for <menuitem>
    And validate search with <keyword3> and <keyword4> to compare for <menuitem2>
    And perform search using <keyword2> for <menuitem>
    And perform search using <keyword5> for <menuitem2>
    And validate search keyword length limit using <Keyword6> for <menuitem>
    And validate clear search feature
    And validate search bar functionality
    And validate search using <amount> from last page
    Then perform search with <specialCharacters> in <menuitem2> and complete search validation

    Examples: 
      | keyword |menuitem  |keyword2|keyword3|menuitem2|keyword4|keyword5|Keyword6                                             |amount |specialCharacters              |
      | 10001   |Workbasket|100016  |Brown   |All Cases|BrOwN   |11/11   |Hubert Blaine Wolfeschlegelsteinhausenbergerdorff Sr.|$2,573 |ㄱ ㄴ ㄷ ㄹ ㅁ ㅂ ㅅ ㅇ ㅈ ㅊ ㅋ ㅌ ㅍ ㅎ |
      
 @allCasesValidation @INSWB-144 @INSWB-151 
  Scenario Outline: All cases validation
    #Given Login into Workbench
    #And enter Password and launch Workbench
    Then validate workbench launch
    And validate header elements visibility
    And navigate to <menuitem>
    And click on Logo and verify <menuitem> page
    And verify greeting message , title and icons on the page
    And verify table columns and rows for <menuitem>
    And verify filter icon for all columns in <menuitem> page
    Then validate pagination and complete ui validation

    Examples: 
      | menuitem  |
      | All Cases |     
      
  @allCasesFunctionalityValidation @INSWB-156
  Scenario Outline: All cases validation
    #Given Login into Workbench
    #And enter Password and launch Workbench
    Then validate workbench launch
    And navigate to <menuitem>
    And check policy number data from table
    
    

    Examples: 
      | menuitem  |
      | All Cases |     
      
      
