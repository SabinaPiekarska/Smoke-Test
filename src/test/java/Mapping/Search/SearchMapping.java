package Mapping.Search;

import BrowserFunctions.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchMapping extends Driver {
    //Search
    public WebElement getSearchFromSideMenu(){
        return driver.findElement(By.xpath("//div[@id='myNodePanel_SMF']//a[text()='Search']"));
    }
    public WebElement getSearchBar(){
        return driver.findElement(By.id("ctl00_ctl00_c_c_SearchBar_FTSSearchTextBox"));
    }
    public WebElement getSearchButton(){
        return driver.findElement(By.id("ctl00_ctl00_c_c_SearchBar_SearchButton"));
    }
    public WebElement getAdvancedLink(){
        return driver.findElement(By.id("ctl00_ctl00_c_c_SearchBar_AdvancedLink"));
    }
    public WebElement getAdvancedSearchBar(){
        return driver.findElement(By.id("ctl00_ctl00_c_c_SearchBar_DataList_ctl00_ctrl_0_SAoF_cont_Text"));
    }
    public WebElement getDrpDownMenuArrow(){
        return driver.findElement(By.id("ctl00_ctl00_c_c_SearchBar_DataList_ctl00_ctrl_0_COS_eq_SDDM_Arrow"));
    }
    //Search tooltip operators
    public WebElement getContainsInFTS(){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Contains in FTS']"));
    }
    public WebElement getDoesNotContainInFTS(){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Does not contain in FTS']"));
    }
    public WebElement getContainsInDB(){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Contains in DB']"));
    }
    public WebElement getDoesNotContainInDB(){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Does not contain in DB']"));
    }
    public WebElement getEquals(){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Equals']"));
    }
    public WebElement getInTheList(){
            return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='In the List']"));
        }
    public WebElement getNotInList(){
            return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Not In List']"));
        }
    public WebElement getBetween(){
            return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Between']"));
        }
    public WebElement getGreaterThan(){
            return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='>']"));
        }
    public WebElement getLessThan(){
            return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='<']"));
        }
    public WebElement getGraterOrEqualThan(){
                return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='>=']"));
            }
    public WebElement getLessOrEqualThan(){
                return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='=<']"));
            }
    public WebElement getAtLeast(){
                    return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='At least']"));
                }
    public WebElement getNoOlderThan(){
                    return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='No older than']"));
                }
    //Search by 'Document Name
    public WebElement getDocumentName(){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Document Name']"));
    }
    //Search by 'File or Metadata'
    public WebElement getFileOrMetadata(){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='File or Metadata']"));
    }
    //Search by 'Check Out Status'
    public WebElement getCheckOutStatus(){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Checked Out Status']"));
    }
    public WebElement getCheckIn(){
        return driver.findElement(By.xpath("//ul[@class='rcbList']//child::li[2]"));
    }
    public WebElement getCheckOut (){
        return driver.findElement(By.xpath("//ul[@class='rcbList']//child::li[3]"));
    }
    public WebElement getAdvancedSearchButton(){
        return driver.findElement(By.id("ctl00_ctl00_c_c_SearchBar_SearchAdvButton"));
    }
    //Search by 'Person'
    public WebElement getPerson (){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Person']"));
    }
    public WebElement getOwnedByMe (){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:6']//a[text()='Owned by Me']"));
    }
    public WebElement getOwnedBySomeoneElse(){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:6']//a[text()='Owned by Someone Else']"));
    }
    public WebElement getCheckOutByMe(){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:6']//a[text()='Checked Out By Me']"));
    }
    public WebElement getCheckOutBySomeoneElse(){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:6']//a[text()='Checked Out By Someone Else']"));
    }
    public WebElement getSearchResults (){
        return driver.findElement(By.id("ctl00_ctl00_c_c_SearchResultsLabel"));
    }
    //Search by 'File Date'
    public WebElement getFileDate (){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='File Date']"));
    }
    public WebElement getDateLastModified (){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:12']//a[text()='Date Last Modified']"));
    }
    public WebElement getCreationDate (){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:12']//a[text()='Creation Date']"));
    }
    public WebElement getApprovalDate (){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:12']//a[text()='Approval Date']"));
    }
    public WebElement getReviewDate (){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:12']//a[text()='Review Date']"));
    }
    //Search by 'Workflow Status'
    public WebElement getWorkflowStatus (){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Workflow Status']"));
    }
    public WebElement getApprovalStatus (){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:18']//a[text()='Approval Status']"));
    }
    public WebElement getReviewstatus (){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:18']//a[text()='Review Status']"));
    }
    //Search by 'Library Location'
    public WebElement getLibraryLocation (){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Library Location']"));
    }
    //Search by 'Document Log'
    public WebElement getDocumentLog (){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Document Log']"));
    }
    //Search by 'Special Fields'
    public WebElement getSpecialFields (){
        return driver.findElement(By.xpath("//table[@id='ctl00_ctl00_c_c_SearchBar_DataList']//a[text()='Document Log']"));
    }
    public WebElement getFolderName (){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:27']//a[text()='Folder Name']"));
    }
    public WebElement getFileSize (){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:27']//a[text()='File Size']"));
    }
    public WebElement getFileType (){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:27']//a[text()='File Type']"));
    }
    public WebElement getHasMarkup (){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:27']//a[text()='Has Markup']"));
    }
    public WebElement getHasLink (){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:27']//a[text()='Has Link']"));
    }
    public WebElement getIsFavorite (){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:27']//a[text()='Is Favorite']"));
    }
    public WebElement getFileholdID (){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:27']//a[text()='FileHold ID']"));
    }
    public WebElement getDocumentControlNo (){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:27']//a[text()='Document Control No.']"));
    }
    public WebElement getVersionControlNo (){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:27']//a[text()='Version Control No.']"));
    }
    public WebElement getDocumentFormat (){
        return driver.findElement(By.xpath("//ul[@id='ctl00_ctl00_c_c_SearchBar_DataList_ctl00_FieldsMenu:submenu:27']//a[text()='Document Format']"));
    }
}
