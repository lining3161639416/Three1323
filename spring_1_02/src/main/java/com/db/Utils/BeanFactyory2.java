package com.db.Utils;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactyory2 {
    private static Map<String,Object> map=new HashMap<>();
    static {
        try {
            InputStream is = BeanFactyory.class.getClassLoader().getResourceAsStream("bean.properties");
            Properties p = new Properties();
            p.load(is);
            Enumeration<?> names = p.propertyNames();
            while (names.hasMoreElements()){
                String key = (String) names.nextElement();
                map.put(key,Class.forName(p.getProperty(key)).newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static  Object getBean(String beanName) {
        return map.get(beanName);
    }
}
