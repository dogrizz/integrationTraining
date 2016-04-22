package pl.dzmitrow.training.lab06;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml")){
            JobLauncher jobLauncher = applicationContext.getBean("jobLauncher", JobLauncher.class);
            Job orders = applicationContext.getBean("orders",Job.class);
            JobExecution jobExecution = jobLauncher.run(orders,new JobParameters());
            System.out.println(jobExecution.getStatus());
        } catch (JobInstanceAlreadyCompleteException e) {
            e.printStackTrace();
        } catch (JobExecutionAlreadyRunningException e) {
            e.printStackTrace();
        } catch (JobParametersInvalidException e) {
            e.printStackTrace();
        } catch (JobRestartException e) {
            e.printStackTrace();
        }
    }
}
