package hello.servlet.web.frontcontroller.v4;

import java.util.Map;


public interface ControllerV4 {
    /**
     * @param papramMap
     * @param model
     * @return
     */
    String process(Map<String, String> papramMap, Map<String, Object> model);
}
