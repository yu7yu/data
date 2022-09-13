package IOC.annotation.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author LiSDong
 * @ClassName Completely
 * @Description  完全注解开发
 * @Date 2022/9/12 18:04
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackageClasses = Completely.class)
public class Completely {
}
