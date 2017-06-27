/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.powermax.internal.connector;

import java.util.EventListener;
import java.util.EventObject;

/**
 * PowerMax Alarm Event Listener interface. Handles incoming PowerMax Alarm events
 *
 * @author Laurent Garnier
 * @since 1.9.0
 */
public interface PowerMaxEventListener extends EventListener {

    /**
     * Event handler method for incoming PowerMax Alarm events
     *
     * @param event
     *            the event object
     */
    public void powerMaxEventReceived(EventObject event);

}
