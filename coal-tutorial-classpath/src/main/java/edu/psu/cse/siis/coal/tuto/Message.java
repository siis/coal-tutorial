/*
 * Copyright (C) 2015 The Pennsylvania State University and the University of Wisconsin
 * Systems and Internet Infrastructure Security Laboratory
 *
 * Author: Damien Octeau
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
package edu.psu.cse.siis.coal.tuto;

public class Message {
  private String target;
  private Data data;
  private String dataType;

  public void setTarget(String target) {
    this.target = target;
  }

  public void setDataAndType(Data data, String type) {
    this.data = data;
    this.dataType = type;
  }

  public void setType(String type) {
    this.dataType = type;
    this.data = null;
  }

  public void setData(Data data) {
    this.data = data;
    this.dataType = null;
  }

  public String getTarget() {
    return this.target;
  }

  public Data getData() {
    return this.data;
  }

  public String getDataType() {
    return this.dataType;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Message:\n  - target: ").append(target).append("\n  - data type: ")
        .append(dataType).append("\n  - data: ").append(data);

    return builder.toString();
  }
}
