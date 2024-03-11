# Scala Cucumber

This is a starter template for scala cucumber and the scoverage sbt plugin.

You can run the examle as 
```shell
sbt testc
```


The scala cucumber is setup to run with junit with the following dependencies
```sbt
"io.cucumber" %% "cucumber-scala"  % "8.20.0" % Test,
"io.cucumber"  % "cucumber-junit"  % "7.15.0" % Test,
"com.novocode" % "junit-interface" % "0.11"   % Test,
```

Then we can have a cucumber runner as below.
```scala
import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(plugin = Array("pretty", "html:target/cucumber.html"))
class CucumberTestRunner {}
```
Use the `@CucumberOptions` to configure the cucumber settings.


