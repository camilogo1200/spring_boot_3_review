package com.camilogo1200.springboot.demo.starterapp.rest;

import com.camilogo1200.springboot.demo.starterapp.beans.CustomConfigurationPropertiesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo/properties/")
public class PropertiesDemoController {

    public PropertiesDemoController(CustomConfigurationPropertiesBean properties) {
        customConfig = properties;
    }

    @Value("${custom.file.property1}")
    public String customFileProperty1;

    @Value("${custom.file.property2}")
    public String customFileProperty2;

    @Value("${my-custom-property-value}")
    public String myCustomPropertyValue ;

    public CustomConfigurationPropertiesBean customConfig;

    @Autowired
    private Environment environment;

    @GetMapping("")
    public @ResponseBody String getCustomProperties() {

        StringBuilder st = new StringBuilder();
        st.append("my-custom-property-value : [");
        st.append(myCustomPropertyValue).append("]<br/>");

        st.append(" Property1 : [")
                .append(customConfig.getProperty1())
                .append("]");
        st.append(" Property2 : [")
                .append(customConfig.getProperty2())
                .append("]<br/>");

        st.append("Custom File - Property1 : [")
                .append(customFileProperty1)
                .append("]");
        st.append("Custom File - Property2 : [")
                .append(customFileProperty2)
                .append("]");

        return st.toString();
    }

    @GetMapping("environment")
    public String getCustomEnvironmentProperties() {

        StringBuilder st = new StringBuilder();
        String[] profiles = environment.getActiveProfiles();

        st.append("Active Profiles: ").append("\n");

        if(profiles.length<1){
            st.append("None active.").append("<br/>");
        }else{
            for (String p : profiles) {
                st.append(p).append("\n");
            }
        }

        st.append("Environment : <br/>")
                .append(environment.toString())
                .append("<br/>");

        return st.toString();
    }

}
