/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.streampark.console.core.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum OperationEnum {
  RELEASE(0),
  START(1),
  SAVEPOINT(2),
  CANCEL(3);

  private final int value;

  OperationEnum(int value) {
    this.value = value;
  }

  public static OperationEnum of(Integer option) {
    return Arrays.stream(values()).filter((x) -> x.value == option).findFirst().orElse(null);
  }
}
