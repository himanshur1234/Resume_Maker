package in.himanshu;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.himanshu.service.ResumeService;

@SpringBootTest
class ResumeAiBackendApplicationTests {

	@Autowired
	private ResumeService resumeservice;
	
	@Test
	void contextLoads() throws IOException {
		resumeservice.generateResumeResponse("i am himanshu with 2 year of java expreience");
	}

}
