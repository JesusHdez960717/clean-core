/*
 * Copyright 2022 Root101 (jhernandezb96@gmail.com, +53-5-426-8660).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Or read it directly from LICENCE.txt file at the root of this project.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.root101.clean.core.rest;

import dev.root101.clean.core.app.domain.DomainObject;
import dev.root101.clean.core.framework.ApiResponse;
import java.util.List;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 * @param <Domain>
 * @param <ID>
 */
public interface ApiCRUDRestService<Domain extends DomainObject<ID>, ID> extends AbstractRestService {

    public ApiResponse<Domain> create(Domain newObject) throws RuntimeException;

    public ApiResponse<Domain> edit(Domain objectToEdit) throws RuntimeException;

    public ApiResponse destroy(Domain objectToDestroy) throws RuntimeException;

    public ApiResponse destroyById(ID keyId) throws RuntimeException;

    public ApiResponse<Domain> findBy(ID keyId) throws RuntimeException;

    public ApiResponse<List<Domain>> findAll() throws RuntimeException;

    /**
     * By default return the size of the findAll() list.
     *
     * @return findAll().size()
     * @throws RuntimeException
     */
    public default ApiResponse<Long> count() throws RuntimeException {
        return ApiResponse.buildSucces(
                (long) findAll().getData().size()
        );
    }

}
