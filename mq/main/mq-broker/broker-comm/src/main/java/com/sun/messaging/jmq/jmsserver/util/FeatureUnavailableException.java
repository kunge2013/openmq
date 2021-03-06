/*
 * Copyright (c) 2000, 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

/*
 * @(#)FeatureUnavailableException.java	1.4 06/29/07
 */

package com.sun.messaging.jmq.jmsserver.util;

import com.sun.messaging.jmq.jmsserver.resources.*;
import com.sun.messaging.jmq.jmsserver.comm.CommGlobals;

/**
 * this is the sub-class for exceptions thrown by the broker
 */

public class FeatureUnavailableException extends BrokerException {
    /**
     * 
     */
    private static final long serialVersionUID = 6137658715193569270L;
    String featurename = null;

    /**
     * create an exception with no message or root cause
     */
    public FeatureUnavailableException() {
        super();
    }

    /**
     * create an exception with a message but no root cause
     *
     * @param msg the failed feature
     */
    public FeatureUnavailableException(String msg) {
        super((msg == null ? null : CommGlobals.getBrokerResources().getKString(BrokerResources.E_FEATURE_UNAVAILABLE, msg)),
                BrokerResources.E_FEATURE_UNAVAILABLE, null);
        featurename = msg;
    }

    public String getFeature() {
        return featurename;
    }
}
