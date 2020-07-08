//
//  ========================================================================
//  Copyright (c) 1995-2020 Mort Bay Consulting Pty Ltd and others.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.hazelcast.session.remote;

import org.eclipse.jetty.server.session.AbstractClusteredSessionScavengingTest;
import org.eclipse.jetty.server.session.SessionDataStoreFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

/**
 * ClusteredSessionScavengingTest
 */
public class RemoteClusteredSessionScavengingTest extends AbstractClusteredSessionScavengingTest
{

    @BeforeAll
    public static void setup() throws Exception
    {
        //
    }

    @AfterAll
    public static void teardown() throws Exception
    {
        //
    }

    /**
     * @see org.eclipse.jetty.server.session.AbstractTestBase#createSessionDataStoreFactory()
     */
    @Override
    public SessionDataStoreFactory createSessionDataStoreFactory()
    {
        return RemoteHazelcastTestHelper.createSessionDataStoreFactory();
    }
}
