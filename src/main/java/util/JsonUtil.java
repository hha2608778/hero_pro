package util;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

public class JsonUtil {
    /**
     * Bean对象转JSON
     * 
     * @param object
     * @param dataFormatString
     * @return
     */
    public static String beanToJson(Object object, String dataFormatString) {
        if (object != null) {
            if (StringUtils.isEmpty(dataFormatString)) {
                return JSONObject.toJSONString(object);
            }
            return JSON.toJSONStringWithDateFormat(object, dataFormatString);
        } else {
            return null;
        }
    }

    /**
     * Bean对象转JSON
     * 
     * @param object
     * @return
     */
    public static String beanToJson(Object object) {
        if (object != null) {
            return JSON.toJSONString(object);
        } else {
            return null;
        }
    }
    

    /**
     * String转JSON字符串
     * 
     * @param key
     * @param value
     * @return
     */
    public static String stringToJsonByFastjson(String key, String value) {
        if (StringUtils.isEmpty(key) || StringUtils.isEmpty(value)) {
            return null;
        }
        Map<String, String> map = new HashMap<String, String>();
        map.put(key, value);
        return beanToJson(map, null);
    }

    /**
    * 用fastjson 将json字符串解析为一个 JavaBean
    * 
    * @param jsonString
    * @param cls
    * @return
    */
   public static <T> T getBean(String jsonString, Class<T> cls) {
       T t = null;
       try {
           t = JSON.parseObject(jsonString, cls);
       } catch (Exception e) {
           // TODO: handle exception
           e.printStackTrace();
       }
       return t;
   }

   /**
    * 用fastjson 将json字符串 解析成为一个 List<JavaBean> 及 List<String>
    * 
    * @param jsonString
    * @param cls
    * @return
    */
   public static <T> List<T> getBeans(String jsonString, Class<T> cls) {
       List<T> list = new ArrayList<T>();
       try {
           list = JSON.parseArray(jsonString, cls);
       } catch (Exception e) {
           // TODO: handle exception
       }
       return list;
   }
}