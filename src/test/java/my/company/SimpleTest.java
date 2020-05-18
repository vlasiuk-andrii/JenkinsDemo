package my.company;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;

public class SimpleTest {

    @Test
    public void simpleTest() {
        step1Logic(4);
        step2Logic();
        step3Logic();
    }



    @Step("This is step 1")
    private int step1Logic(int k) {
        return k + 3;
    }

    @Step("This is step 2")
    private void step2Logic() {
        // Step2 implementation
    }

    @Step("This is step 3")
    private void step3Logic() {
        createAttachment();
    }

    @Attachment()
    private byte[] createAttachment() {
        String content = "attachmentContent";
        return content.getBytes();
    }
}

