//
//  ========================================================================
//  Copyright (c) 1995-2019 Mort Bay Consulting Pty. Ltd.
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

package org.eclipse.jetty.xml;

import java.net.URL;

import org.eclipse.jetty.util.resource.Resource;

/**
 * A ConfigurationProcessor for non XmlConfiguration format files.
 * <p>
 * A file in non-XmlConfiguration file format may be processed by a {@link ConfigurationProcessor}
 * instance that is returned from a {@link ConfigurationProcessorFactory} instance discovered by the
 * <code>ServiceLoader</code> mechanism.  This is used to allow spring configuration files to be used instead of 
 * jetty.xml
 *
 */
public interface ConfigurationProcessor
{
    /**
     * @deprecated use {@link #init(Resource, XmlParser.Node, XmlConfiguration)} instead
     */
    @Deprecated
    default void init(URL url, XmlParser.Node root, XmlConfiguration configuration)
    {
        // Moving back and forth between URL and File/FileSystem/Path/Resource is known to cause escaping issues.
        init(Resource.newResource(url), root, configuration);
    }

    void init(Resource resource, XmlParser.Node root, XmlConfiguration configuration);

    Object configure( Object obj) throws Exception;
    Object configure() throws Exception;
}
