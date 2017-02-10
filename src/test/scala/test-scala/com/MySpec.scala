package test.scala.com

import org.specs2.mutable._;
import org.specs2.runner._;
import org.junit.runner._;

class MySpecTest extends SpecificationWithJUnit {
  "My code should" should {

    "True and true must be true" in {
      true && true must_== true;
    }

    "False and false must be false" in {
      false && false must_== false;
    }
  }
}