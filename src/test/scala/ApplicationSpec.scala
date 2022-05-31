import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ApplicationSpec extends AnyFlatSpec with should.Matchers {
  import Application._
  "Application" should "return 2" in {
    findMiddleElement(List(1,2,3,4)) shouldBe Some(2)
  }

  it should "return 1" in {
    findMiddleElement(List(1)) shouldBe Some(1)
  }


  it should "return 3" in {
    findMiddleElement(List(1,2,3,4,5,6)) shouldBe Some(3)
  }

}
