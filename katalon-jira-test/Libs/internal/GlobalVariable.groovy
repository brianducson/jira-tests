package internal
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import groovy.transform.CompileStatic


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 * 
 */

@CompileStatic
public class GlobalVariable {
	 
    /**
     * <p></p>
     */
	public static Object URL = 'https://jira-dev.katalon.com'
	 
    /**
     * <p>Default Username</p>
     */
	public static Object username = 'tony'
	 
    /**
     * <p>Default Password</p>
     */
	public static Object password = 'Test@2017'
	 
    /**
     * <p>Welcome message at Login page</p>
     */
	public static Object welcome_message = 'Welcome to Katalon JIRA'
	 
    /**
     * <p>Logout message</p>
     */
	public static Object logout_message = 'You are now logged out. Any automatic login has also been stopped.'
	 
    /**
     * <p>System Dashboard message</p>
     */
	public static Object system_dashboard = 'System Dashboard'
	 
    /**
     * <p></p>
     */
	public static Object create_issue_title = 'Create Issue'
	 
    /**
     * <p></p>
     */
	public static Object project = 'Katalon Test Project (KTP)'
	 
    /**
     * <p></p>
     */
	public static Object issue_type = 'Bug'
	 
    /**
     * <p></p>
     */
	public static Object summary = 'Testing new issue'
	 
    /**
     * <p></p>
     */
	public static Object description = 'This is new issue description'
	 
    /**
     * <p></p>
     */
	public static Object priority = 'Low'
	 
    /**
     * <p></p>
     */
	public static Object labels = 'new_issue'
	 
    /**
     * <p></p>
     */
	public static Object login_fail_message = 'Sorry, your username and password are incorrect - please try again.'
	 
}
