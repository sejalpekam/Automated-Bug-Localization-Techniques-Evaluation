/**
 * H2MS API
 * API for interacting with the H2MS backend.
 *
 * OpenAPI spec version: 1.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams }               from '@angular/common/http';

import { Observable }                                        from 'rxjs/Observable';
import '../rxjs-operators';

import { ResourceRole } from '../model/resourceRole';
import { ResourceUser } from '../model/resourceUser';
import { ResourcesRole } from '../model/resourcesRole';
import { ResourcesUser } from '../model/resourcesUser';
import { User } from '../model/user';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';
import { CustomHttpUrlEncodingCodec }                        from '../encoder';


@Injectable()
export class UserEntityService {

    protected basePath = 'http://test.h2ms.org:81';
    public defaultHeaders = new HttpHeaders();
    public configuration = new Configuration();

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
            this.basePath = basePath || configuration.basePath || this.basePath;
        }
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        for (let consume of consumes) {
            if (form === consume) {
                return true;
            }
        }
        return false;
    }


    /**
     * deleteUser
     *
     * @param id id
     */
    public deleteUserUsingDELETE(id: number): Observable<{}> {
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling deleteUserUsingDELETE.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        let httpHeaderAcceptSelected: string = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set("Accept", httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        return this.httpClient.delete<any>(`${this.basePath}/users/${encodeURIComponent(String(id))}`,
            {
                headers: headers,
                withCredentials: this.configuration.withCredentials,
            }
        );
    }

    /**
     * findAllUser
     *
     * @param page page
     * @param size size
     * @param sort sort
     */
    public findAllUserUsingGET(page?: string, size?: string, sort?: string): Observable<ResourcesUser> {

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (page !== undefined) {
            queryParameters = queryParameters.set('page', <any>page);
        }
        if (size !== undefined) {
            queryParameters = queryParameters.set('size', <any>size);
        }
        if (sort !== undefined) {
            queryParameters = queryParameters.set('sort', <any>sort);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json',
            'application/hal+json',
            'text/uri-list',
            'application/x-spring-data-compact+json'
        ];
        let httpHeaderAcceptSelected: string = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set("Accept", httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        return this.httpClient.get<any>(`${this.basePath}/users`,
            {
                params: queryParameters,
                headers: headers,
                withCredentials: this.configuration.withCredentials,
            }
        );
    }

    /**
     * findByEmailUser
     *
     * @param param0 param0
     */
    public findByEmailUserUsingGET(param0?: string): Observable<ResourceUser> {

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (param0 !== undefined) {
            queryParameters = queryParameters.set('param0', <any>param0);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        let httpHeaderAcceptSelected: string = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set("Accept", httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        return this.httpClient.get<any>(`${this.basePath}/users/search/findByEmail`,
            {
                params: queryParameters,
                headers: headers,
                withCredentials: this.configuration.withCredentials,
            }
        );
    }

    /**
     * findByFirstNameUser
     *
     * @param param0 param0
     */
    public findByFirstNameUserUsingGET(param0?: string): Observable<ResourceUser> {

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (param0 !== undefined) {
            queryParameters = queryParameters.set('param0', <any>param0);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        let httpHeaderAcceptSelected: string = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set("Accept", httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        return this.httpClient.get<any>(`${this.basePath}/users/search/findByFirstName`,
            {
                params: queryParameters,
                headers: headers,
                withCredentials: this.configuration.withCredentials,
            }
        );
    }

    /**
     * findByLastNameUser
     *
     * @param param0 param0
     */
    public findByLastNameUserUsingGET(param0?: string): Observable<ResourceUser> {

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (param0 !== undefined) {
            queryParameters = queryParameters.set('param0', <any>param0);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        let httpHeaderAcceptSelected: string = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set("Accept", httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        return this.httpClient.get<any>(`${this.basePath}/users/search/findByLastName`,
            {
                params: queryParameters,
                headers: headers,
                withCredentials: this.configuration.withCredentials,
            }
        );
    }

    /**
     * findByMiddleNameUser
     *
     * @param param0 param0
     */
    public findByMiddleNameUserUsingGET(param0?: string): Observable<ResourceUser> {

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (param0 !== undefined) {
            queryParameters = queryParameters.set('param0', <any>param0);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        let httpHeaderAcceptSelected: string = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set("Accept", httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        return this.httpClient.get<any>(`${this.basePath}/users/search/findByMiddleName`,
            {
                params: queryParameters,
                headers: headers,
                withCredentials: this.configuration.withCredentials,
            }
        );
    }

    /**
     * findOneByEmailUser
     *
     * @param param0 param0
     */
    public findOneByEmailUserUsingGET(param0?: string): Observable<ResourceUser> {

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (param0 !== undefined) {
            queryParameters = queryParameters.set('param0', <any>param0);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        let httpHeaderAcceptSelected: string = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set("Accept", httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        return this.httpClient.get<any>(`${this.basePath}/users/search/findOneByEmail`,
            {
                params: queryParameters,
                headers: headers,
                withCredentials: this.configuration.withCredentials,
            }
        );
    }

    /**
     * findOneUser
     *
     * @param id id
     */
    public findOneUserUsingGET(id: number): Observable<ResourceUser> {
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling findOneUserUsingGET.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        let httpHeaderAcceptSelected: string = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set("Accept", httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        return this.httpClient.get<any>(`${this.basePath}/users/${encodeURIComponent(String(id))}`,
            {
                headers: headers,
                withCredentials: this.configuration.withCredentials,
            }
        );
    }

    /**
     * saveUser
     *
     * @param id id
     * @param body body
     */
    public saveUserUsingPATCH(id: number, body: User): Observable<ResourceUser> {
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling saveUserUsingPATCH.');
        }
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling saveUserUsingPATCH.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        let httpHeaderAcceptSelected: string = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set("Accept", httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        let consumes: string[] = [
            'application/json'
        ];
        let httpContentTypeSelected:string = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set("Content-Type", httpContentTypeSelected);
        }

        return this.httpClient.patch<any>(`${this.basePath}/users/${encodeURIComponent(String(id))}`,
            body,
            {
                headers: headers,
                withCredentials: this.configuration.withCredentials,
            }
        );
    }

    /**
     * saveUser
     *
     * @param body body
     */
    public saveUserUsingPOST(body: User): Observable<ResourceUser> {
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling saveUserUsingPOST.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        let httpHeaderAcceptSelected: string = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set("Accept", httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        let consumes: string[] = [
            'application/json'
        ];
        let httpContentTypeSelected:string = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set("Content-Type", httpContentTypeSelected);
        }

        return this.httpClient.post<any>(`${this.basePath}/users`,
            body,
            {
                headers: headers,
                withCredentials: this.configuration.withCredentials,
            }
        );
    }

    /**
     * saveUser
     *
     * @param id id
     * @param body body
     */
    public saveUserUsingPUT(id: number, body: User): Observable<ResourceUser> {
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling saveUserUsingPUT.');
        }
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling saveUserUsingPUT.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        let httpHeaderAcceptSelected: string = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set("Accept", httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        let consumes: string[] = [
            'application/json'
        ];
        let httpContentTypeSelected:string = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set("Content-Type", httpContentTypeSelected);
        }

        return this.httpClient.put<any>(`${this.basePath}/users/${encodeURIComponent(String(id))}`,
            body,
            {
                headers: headers,
                withCredentials: this.configuration.withCredentials,
            }
        );
    }

    /**
     * userRoles
     *
     * @param id id
     * @param roleId roleId
     */
    public userRolesUsingDELETE(id: number, roleId: string): Observable<{}> {
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling userRolesUsingDELETE.');
        }
        if (roleId === null || roleId === undefined) {
            throw new Error('Required parameter roleId was null or undefined when calling userRolesUsingDELETE.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        let httpHeaderAcceptSelected: string = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set("Accept", httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        let consumes: string[] = [
            'text/uri-list',
            'application/x-spring-data-compact+json'
        ];

        return this.httpClient.delete<any>(`${this.basePath}/users/${encodeURIComponent(String(id))}/roles/${encodeURIComponent(String(roleId))}`,
            {
                headers: headers,
                withCredentials: this.configuration.withCredentials,
            }
        );
    }

    /**
     * userRoles
     *
     * @param id id
     */
    public userRolesUsingDELETE1(id: number): Observable<{}> {
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling userRolesUsingDELETE1.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        let httpHeaderAcceptSelected: string = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set("Accept", httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        let consumes: string[] = [
            'text/uri-list',
            'application/x-spring-data-compact+json'
        ];

        return this.httpClient.delete<any>(`${this.basePath}/users/${encodeURIComponent(String(id))}/roles`,
            {
                headers: headers,
                withCredentials: this.configuration.withCredentials,
            }
        );
    }

    /**
     * userRoles
     *
     * @param id id
     * @param roleId roleId
     */
    public userRolesUsingGET(id: number, roleId: string): Observable<ResourceRole> {
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling userRolesUsingGET.');
        }
        if (roleId === null || roleId === undefined) {
            throw new Error('Required parameter roleId was null or undefined when calling userRolesUsingGET.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        let httpHeaderAcceptSelected: string = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set("Accept", httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        let consumes: string[] = [
            'application/hal+json'
        ];

        return this.httpClient.get<any>(`${this.basePath}/users/${encodeURIComponent(String(id))}/roles/${encodeURIComponent(String(roleId))}`,
            {
                headers: headers,
                withCredentials: this.configuration.withCredentials,
            }
        );
    }

    /**
     * userRoles
     *
     * @param id id
     */
    public userRolesUsingGET1(id: number): Observable<ResourcesRole> {
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling userRolesUsingGET1.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/hal+json'
        ];
        let httpHeaderAcceptSelected: string = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set("Accept", httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        return this.httpClient.get<any>(`${this.basePath}/users/${encodeURIComponent(String(id))}/roles`,
            {
                headers: headers,
                withCredentials: this.configuration.withCredentials,
            }
        );
    }

    /**
     * userRoles
     *
     * @param id id
     * @param body body
     */
    public userRolesUsingPATCH(id: number, body: Array<string>): Observable<ResourcesRole> {
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling userRolesUsingPATCH.');
        }
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling userRolesUsingPATCH.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        let httpHeaderAcceptSelected: string = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set("Accept", httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        let consumes: string[] = [
            'text/uri-list',
            'application/x-spring-data-compact+json'
        ];
        let httpContentTypeSelected:string = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set("Content-Type", httpContentTypeSelected);
        }

        return this.httpClient.patch<any>(`${this.basePath}/users/${encodeURIComponent(String(id))}/roles`,
            body,
            {
                headers: headers,
                withCredentials: this.configuration.withCredentials,
            }
        );
    }

    /**
     * userRoles
     *
     * @param id id
     * @param body body
     */
    public userRolesUsingPOST(id: number, body: Array<string>): Observable<ResourcesRole> {
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling userRolesUsingPOST.');
        }
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling userRolesUsingPOST.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        let httpHeaderAcceptSelected: string = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set("Accept", httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        let consumes: string[] = [
            'text/uri-list',
            'application/x-spring-data-compact+json'
        ];
        let httpContentTypeSelected:string = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set("Content-Type", httpContentTypeSelected);
        }

        return this.httpClient.post<any>(`${this.basePath}/users/${encodeURIComponent(String(id))}/roles`,
            body,
            {
                headers: headers,
                withCredentials: this.configuration.withCredentials,
            }
        );
    }

    /**
     * userRoles
     *
     * @param id id
     * @param body body
     */
    public userRolesUsingPUT(id: number, body: Array<string>): Observable<ResourcesRole> {
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling userRolesUsingPUT.');
        }
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling userRolesUsingPUT.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        let httpHeaderAcceptSelected: string = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set("Accept", httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        let consumes: string[] = [
            'text/uri-list',
            'application/x-spring-data-compact+json'
        ];
        let httpContentTypeSelected:string = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set("Content-Type", httpContentTypeSelected);
        }

        return this.httpClient.put<any>(`${this.basePath}/users/${encodeURIComponent(String(id))}/roles`,
            body,
            {
                headers: headers,
                withCredentials: this.configuration.withCredentials,
            }
        );
    }

}
