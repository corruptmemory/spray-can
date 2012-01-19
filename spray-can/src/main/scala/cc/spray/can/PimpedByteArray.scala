/*
 * Copyright (C) 2011 Mathias Doenitz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cc.spray.can

class PimpedByteArray(underlying: Array[Byte]) {

  /**
   * Creates a new Array[Byte] that is the concatenation of the underlying and the given one.
   */
  def concat(other: Array[Byte]) = {
    val newArray = new Array[Byte](underlying.length + other.length)
    System.arraycopy(underlying, 0, newArray, 0, underlying.length)
    System.arraycopy(other, 0, newArray, underlying.length, other.length)
    newArray
  }

}
