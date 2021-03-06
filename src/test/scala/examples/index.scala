package examples

import org.specs2._
import runner.SpecificationsFinder._

/**Creates an index page for the specifications */
class index extends Specification {

  def is =
    examplesLinks("Specs")

  def examplesLinks(t: String) = specifications().foldLeft(t.title) {
    (res, cur) => res ^ see(cur)
  }
}
