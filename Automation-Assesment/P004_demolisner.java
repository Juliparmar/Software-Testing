package Assesment;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class P004_demolisner {

public class demolisner implements ITestListener{
	@Override
	public void onTestStart(ITestResult	 result) {
		System.out.println("test start running");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test finished");
	}
}


}
