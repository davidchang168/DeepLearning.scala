package com.thoughtworks.deepLearning.double

import cats._
import com.thoughtworks.deepLearning.Differentiable

/**
  * @author 杨博 (Yang Bo) &lt;pop.atry@gmail.com&gt;
  */
package object utilities {
  type Double = Differentiable {
    type Delta = Eval[scala.Double]
    type Data = Eval[scala.Double]
  }

}
