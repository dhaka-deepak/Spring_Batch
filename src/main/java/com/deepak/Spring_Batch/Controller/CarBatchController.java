package com.deepak.Spring_Batch.Controller;

import lombok.AllArgsConstructor;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CarBatchController {

    private final JobLauncher jobLauncher;
    private final Job job;

    @GetMapping("/startBatch")
    public BatchStatus startBatch() throws JobExecutionAlreadyRunningException, JobRestartException,
            JobInstanceAlreadyCompleteException, JobParametersInvalidException {
        JobParameters jobParameters = new JobParametersBuilder().addLong("startAt", System.currentTimeMillis())
                .toJobParameters();
        JobExecution run = jobLauncher.run(job, jobParameters);
        return run.getStatus();
    }
}
