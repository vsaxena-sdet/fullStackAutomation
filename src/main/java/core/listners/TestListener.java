package core.listners;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

//    private static int total;
    private static int passed;
    private static int failed;
    private static int skipped;
//    private static int pending;


//    public void onStart(ISuite suite){
//        total = suite.getAllMethods().size();
//        pending = total;
//    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        if(iTestResult.getTestContext().getSkippedTests().getResults(iTestResult.getMethod()).isEmpty()){
            --skipped;
//            ++pending;
        }

        System.out.println("---------------------------------------------------------------------- \nStarted ---"+ iTestResult.getName() +"\n -----------------------------------");


    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("completed -"+ iTestResult.getName() + " Status - Passed");
        ++passed;
        if(iTestResult.getTestContext().getSkippedTests().getResults(iTestResult.getMethod()).isEmpty()){
            --skipped;
        }else{
//            --pending;
        }

        System.out.println("---------------------------------------------------------------------- \nTotal ---"+ ",Pending" + ",Failed" +failed +",Skipped"+ skipped +",Passed"+passed +"\n -----------------------------------");







    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        if(iTestResult.getTestContext().getSkippedTests().getResults(iTestResult.getMethod()).isEmpty()){
            --skipped;
        }else{
//            --pending;
        }

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
