package demo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class DemoObjectService {

    @Cacheable("demoObjectCache")
    public DemoObject getDemoObject(int id) {

        return new DemoObject(id);
    }

}
