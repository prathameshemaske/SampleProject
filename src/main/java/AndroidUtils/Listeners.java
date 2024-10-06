package AndroidUtils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener {

    ExtentReports extent = ExtentReport.getReporterObject();
    ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();  // ThreadLocal for thread safety

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest test = extent.createTest(result.getMethod().getMethodName());
        extentTest.set(test);  // Set the ExtentTest object in the ThreadLocal
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.get().log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.get().fail(result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext result) {
        extent.flush();  // Flush the extent report at the end of the test execution
    }
}
