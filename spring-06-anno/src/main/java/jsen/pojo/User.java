package jsen.pojo; /*
 *@author Jsen
 *@description
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class User {
    @Value("蒋厚森")
    public String name;
}
