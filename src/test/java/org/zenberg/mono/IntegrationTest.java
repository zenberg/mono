package org.zenberg.mono;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.zenberg.mono.AbstractNeo4jIT;
import org.zenberg.mono.MonoApp;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = MonoApp.class)
@ExtendWith(AbstractNeo4jIT.class)
public @interface IntegrationTest {
}
