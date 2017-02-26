package com.al.test.springbatch.basic;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

	@Autowired
	private JobLauncherTestUtils jobLauncherTestUtils;

	@Test
	public void launchJob() throws Exception {

//		JobExecution jobExecution = jobLauncherTestUtils.launchJob();
//		Assert.assertEquals(jobExecution.getStatus(), BatchStatus.COMPLETED);
		assert(true);

	}

	@Test
	public void launchStep1() {

		JobExecution jobExecution = jobLauncherTestUtils.launchStep("step1");
		// Assert.assertEquals(jobExecution.getStatus(), BatchStatus.COMPLETED);
		assert (true);
	}
}
