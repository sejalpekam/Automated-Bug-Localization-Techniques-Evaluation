/**
 * This workaround taken from https://jira.spring.io/browse/DATAREST-524, as the
 * automatic validator registration isn't working.  This automatically finds beans
 * with the right component names, and registers as a validator.  For example:
 * 
 * 	beforeCreateEventValidator
 * 
 * will register that validator for the Event model.
 *
 */
package edu.harvard.h2ms.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.validation.Validator;
 
@Configuration
public class ValidatorConfig implements InitializingBean {
 
    private static final List<String> EVENTS;
    
    static {
        List<String> events = new ArrayList<String>();
        events.add("beforeCreate");
        events.add("afterCreate");
        events.add("beforeSave");
        events.add("afterSave");
        events.add("beforeLinkSave");
        events.add("afterLinkSave");
        events.add("beforeDelete");
        events.add("afterDelete");
        EVENTS = Collections.unmodifiableList(events);
    }
 
    @Autowired
    ListableBeanFactory beanFactory;
 
    @Autowired
    ValidatingRepositoryEventListener validatingRepositoryEventListener;
 
    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, Validator> validators = beanFactory.getBeansOfType(Validator.class);
        for (Map.Entry<String, Validator> entry : validators.entrySet()) {
            EVENTS.stream().filter(p -> entry.getKey().startsWith(p)).findFirst()
                    .ifPresent(p -> validatingRepositoryEventListener.addValidator(p, entry.getValue()));
        }
    }
}