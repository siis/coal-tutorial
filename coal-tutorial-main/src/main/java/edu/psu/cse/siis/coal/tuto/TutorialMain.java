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

public class TutorialMain extends Messaging {
  public static void sendMessage(boolean b) {
    Message message = new Message();
    Data data = new Data();
    if (b) {
      message.setTarget("Adversary");
      data.addString("Secret");
      message.setDataAndType(data, "Secret Type");
    } else {
      message.setTarget("Trusted Target");
      data.addInt(123);
      message.setData(data);
    }
    Messaging.send(message);
    Messaging.send(message, "Other Secret");
  }

  public static void main(String[] argv) {
    sendMessage(argv.length > 0);
  }
}
