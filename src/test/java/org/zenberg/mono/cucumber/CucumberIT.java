package org.zenberg.mono.cucumber;

import io.cucumber.junit.platform.engine.Cucumber;
import org.zenberg.mono.AbstractNeo4jIT;

@Cucumber
@ExtendWith(AbstractNeo4jIT)
class CucumberIT {}
