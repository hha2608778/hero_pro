package util;

import java.util.Map;

public class Test {

	public static void main(String[] args) {
        String jsonStr = "{'userName':'huangbaokang','password':'123456'}";
        Map<String, Object> map = JsonUtil.jsonToMap(jsonStr);
        System.out.println(map.get("userName"));
    }
}
