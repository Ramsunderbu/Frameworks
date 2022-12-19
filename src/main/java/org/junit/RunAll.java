package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

@RunWith (Suite.class)
@Suite.SuiteClasses({Greens.class, Logic.class})
public class RunAll {
	@Test
	public void test() {
		Result rs = JUnitCore.runClasses(Greens.class, Logic.class);
//		System.out.println("Run count "+rs.getRunCount());
//		System.out.println("Ignore count "+rs.getIgnoreCount());
//		System.out.println("Failure count "+rs.getFailureCount());
//		System.out.println("Run time "+rs.getRunTime());
		List<Failure> failures = rs.getFailures();
		for (Failure x : failures) {
			System.out.println(x);
			
		}

	}

}
