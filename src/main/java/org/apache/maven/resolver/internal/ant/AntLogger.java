package org.apache.maven.resolver.internal.ant;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.tools.ant.Project;
import org.eclipse.aether.spi.log.Logger;

/**
 */
class AntLogger
    implements Logger
{

    private Project project;

    AntLogger( final Project project )
    {
        this.project = project;
    }

    public void debug( final String msg )
    {
        project.log( msg, Project.MSG_DEBUG );
    }

    public void debug( final String msg, final Throwable error )
    {
        project.log( msg, error, Project.MSG_DEBUG );
    }

    public boolean isDebugEnabled()
    {
        return true;
    }

    public boolean isWarnEnabled()
    {
        return true;
    }

    public void warn( final String msg )
    {
        project.log( msg, Project.MSG_WARN );
    }

    public void warn( final String msg, final Throwable error )
    {
        project.log( msg, error, Project.MSG_WARN );
    }

}
