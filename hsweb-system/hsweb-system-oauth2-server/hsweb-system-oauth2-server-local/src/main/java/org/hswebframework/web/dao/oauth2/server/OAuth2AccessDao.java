/*
 *  Copyright 2020 http://www.hswebframework.org
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */

package org.hswebframework.web.dao.oauth2.server;

import org.hswebframework.web.entity.oauth2.server.OAuth2AccessEntity;
import org.hswebframework.web.dao.InsertDao;
import org.hswebframework.web.dao.dynamic.DeleteByEntityDao;
import org.hswebframework.web.dao.dynamic.QueryByEntityDao;
import org.hswebframework.web.dao.dynamic.UpdateByEntityDao;

/**
 * @author zhouhao
 */
public interface OAuth2AccessDao extends
        InsertDao<OAuth2AccessEntity>,
        DeleteByEntityDao,
        UpdateByEntityDao,
        QueryByEntityDao<OAuth2AccessEntity> {
}