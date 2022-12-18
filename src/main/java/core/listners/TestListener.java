package core.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("PASSED TEST CASES");
        iTestContext.getPassedTests().getAllResults().forEach(iTestResult -> System.out.println(iTestResult.getName()));

        System.out.println("FAILED TEST CASES");
        iTestContext.getFailedTests().getAllResults().forEach(iTestResult -> System.out.println(iTestResult.getName()));

    }
}
