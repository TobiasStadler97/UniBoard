package UniBoard;

import UniBoard.entity.users.Admin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class UniBoardApplication {


    public static void main(String[] args) {
        SpringApplication.run(UniBoardApplication.class, args);

    }

    @EventListener(ApplicationReadyEvent.class)
    public void execCodeAfterStartup(){




    }

    // test
}
