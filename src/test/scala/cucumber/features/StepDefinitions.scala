package cucumber.features

import com.ftlt.basic.tachyon.Calculator
import io.cucumber.scala.EN
import io.cucumber.scala.ScalaDsl
import scala.compiletime.uninitialized

class StepDefinitions extends ScalaDsl with EN:

  /*Given operation +
    Given operand one 1
    Given operand two 1
    When calculation is performed
    Then result is 2*/

  var operandOne: Int   = uninitialized
  var operandTwo: Int   = uninitialized
  var operation: String = uninitialized
  var result: Int       = uninitialized

  Given("operand one {int}") { (_operandOne: Int) =>
    operandOne = _operandOne
  }

  Given("operand two {int}") { (_operandTwo: Int) =>
    operandTwo = _operandTwo
  }

  Given("operation {string}") { (_operation: String) =>
    operation = _operation
  }

  When("calculation is performed") { () =>
    result = Calculator.performCalc(operation, operandOne, operandTwo)
  }

  Then("result is {int}") { (_result: Int) =>
    assert(result == _result)
  }
