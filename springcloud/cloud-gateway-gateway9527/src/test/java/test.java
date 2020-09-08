import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;

@SpringBootTest(classes = test.class)
public class test {

    @Test
    void Test(){
        ZonedDateTime zbj = ZonedDateTime.now();
        System.out.println(zbj);
    }

}
