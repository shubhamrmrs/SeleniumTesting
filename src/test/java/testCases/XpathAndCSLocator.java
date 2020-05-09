package testCases;

public class XpathAndCSLocator {

	public static void main(String[] args) {

//Xpath: 
		
/*
 * 1).Relative Xpath: = //tagName[@attribute='value']   // to search on console use $x(Xpath)
 * 
 * <input type="email" class="whsOnd zHQkBf" jsname="YPqjbf"
 * autocomplete="username" spellcheck="false" tabindex="0"
 * aria-label="Email or phone" name="identifier" value="" autocapitalize="none"
 * id="identifierId" dir="ltr" data-initial-dir="ltr" data-initial-value="">
 * 
 * Xpath = //input[@id='identifierId']
 *        (//input[@id='identifierId'])[1] --- in case of duplicate xpath we can specify index no.
 *        
 *        driver.get("http://www.way2automation.com/way2auto_jquery/submit_button_clicked.php");
 *        driver.findElement(By.xpath("//input[@id='submit05215']")).click(); 
 *        if id/xpath is dynamic so,
 *        xpath("//input[contains(@id,'bmit0')]")              // if only middle part is fixed
 *        xpath("//input[starts-with(@id,'submit')]")          // if only start is matching

          driver.get("http://www.gmail.com/");
          driver.findElement(By.xpath("//*[@id="identifierId"]")).click(); 
          how to navigate parent, child, siblings in html element
          
          $x("//*[@id="identifierId"]")..           ----> parent to parent
          $x("//*[@id="identifierId"]")/childName   ----> parent to child
          $x("//*[@id="identifierId"]")/childName[1]----> parent to child 1
          $x("//*[@id="identifierId"]")/..          ----> child to parent
          $x("//*[@id="identifierId"]")/preceding-sibling::childtagName         ----> child to preceding siblings
          $x("//*[@id="identifierId"]")/preceding-sibling::childtagName[1]       ----> child to 1-preceding siblings
          
          

          


                    
 * 
 * 
 
 *
 *
 *
 *
 *
 *
 */
	
	
	
	
	
	
	
	
	
	}

}
