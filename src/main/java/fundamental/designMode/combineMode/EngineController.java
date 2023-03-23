package fundamental.designMode.combineMode;

import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.logging.Logger;

public class EngineController {

    public String process(final String userId, final String userSex, final int userAge) {

        System.out.println("ifelse实现方式判断用户结果。userId：" + userId + "userSex：" + userSex + "userAge：" + userAge);

        if ("man".equals(userSex)) {
            if (userAge < 25) {
                return "果实A";
            }

            if (userAge >= 25) {
                return "果实B";
            }
        }

        if ("woman".equals(userSex)) {
            if (userAge < 25) {
                return "果实C";
            }

            if (userAge >= 25) {
                return "果实D";
            }
        }

        return null;

    }

}
