/*
* Copyright (c) 2012 Research In Motion Limited.
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
package nfc.sample.llcp.commands;

import net.rim.device.api.command.AlwaysExecutableCommand;
import net.rim.device.api.command.ReadOnlyCommandMetadata;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.container.MainScreen;
import nfc.sample.llcp.ui.ClientTextScreen;

public class SendCommand extends AlwaysExecutableCommand {

	public void execute(ReadOnlyCommandMetadata metadata, Object context) {
		synchronized(UiApplication.getUiApplication().getEventLock()) {
		    MainScreen screen = new ClientTextScreen();
		    UiApplication.getUiApplication().pushScreen(screen);
		}
	}

}
