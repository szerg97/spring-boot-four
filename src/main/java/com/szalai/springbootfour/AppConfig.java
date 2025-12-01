package com.szalai.springbootfour;

import org.springframework.beans.factory.BeanRegistrar;
import org.springframework.beans.factory.BeanRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

@Configuration
@Import(AppConfig.AppBeanRegister.class)
public class AppConfig {

    static class AppBeanRegister implements BeanRegistrar {
        @Override
        public void register(BeanRegistry registry, Environment env) {
            String sender = env.getProperty("app.sms.sender");
            switch (sender) {
                case "twillio": registry.registerBean("smsSender", TwillioSmsSender.class);
                    break;
                case "whatsapp": registry.registerBean("smsSender", WhatsAppSmsSender.class);
                    break;
            }
        }
    }
}
