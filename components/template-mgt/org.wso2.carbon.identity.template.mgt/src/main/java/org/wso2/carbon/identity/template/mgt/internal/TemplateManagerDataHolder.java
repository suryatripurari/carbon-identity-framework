/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.template.mgt.internal;

import org.wso2.carbon.identity.configuration.mgt.core.ConfigurationManager;

public class TemplateManagerDataHolder {

    private static TemplateManagerDataHolder instance = new TemplateManagerDataHolder();
    private ConfigurationManager configurationManager;

    public static TemplateManagerDataHolder getInstance() {

        return instance;
    }

    /**
     * Set the ConfigurationManager.
     *
     * @param configurationManager configuration manger object.
     */
    public void setConfigurationManager(ConfigurationManager configurationManager) {

        this.configurationManager = configurationManager;
    }

    /**
     * Get the ConfigurationManager object held at the data holder.
     *
     * @return configuration manger object.
     */
    public ConfigurationManager getConfigurationManager() {

        return this.configurationManager;
    }
}
