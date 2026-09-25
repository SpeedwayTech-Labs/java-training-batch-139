package string;

public class TestReport {

	public static void main(String[] args) {
		// 
		
		StringBuilder report = new StringBuilder();
		
		report.append("Automation Test Report\n");
		
		for(int testCase = 1 ; testCase<=5; testCase++) {
			
			report.append("TC").append(testCase).append(" : ");
			
			if(testCase == 2) {
				report.append("FAILED");
				
			}else {
				report.append("PASSED");
					
				}
			report.append("\n");
			}
		System.out.println(report);
		}

	}


