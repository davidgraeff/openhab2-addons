/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.lwm2mleshan;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link lwm2mLeshanBinding} class defines common constants, which are
 * used across the whole binding.
 *
 * @author David Graeff - Initial contribution
 */
public class lwm2mLeshanBindingConstants {

    public static final String BINDING_ID = "lwm2mleshan";
    public static final String BRIDGE_ID = "lwm2mBridgeThing";

    // List of all Thing Type UIDs
    public final static ThingTypeUID BRIDGE_TYPE = new ThingTypeUID(BINDING_ID, BRIDGE_ID);
}
