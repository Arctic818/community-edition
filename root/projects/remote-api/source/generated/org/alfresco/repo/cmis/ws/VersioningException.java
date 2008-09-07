
package org.alfresco.repo.cmis.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.1.2
 * Fri Sep 05 13:44:38 EEST 2008
 * Generated source version: 2.1.2
 * 
 */

@WebFault(name = "versioningException", targetNamespace = "http://www.cmis.org/2008/05")
public class VersioningException extends Exception {
    public static final long serialVersionUID = 20080905134438L;
    
    private org.alfresco.repo.cmis.ws.VersioningExceptionType versioningException;

    public VersioningException() {
        super();
    }
    
    public VersioningException(String message) {
        super(message);
    }
    
    public VersioningException(String message, Throwable cause) {
        super(message, cause);
    }

    public VersioningException(String message, org.alfresco.repo.cmis.ws.VersioningExceptionType versioningException) {
        super(message);
        this.versioningException = versioningException;
    }

    public VersioningException(String message, org.alfresco.repo.cmis.ws.VersioningExceptionType versioningException, Throwable cause) {
        super(message, cause);
        this.versioningException = versioningException;
    }

    public org.alfresco.repo.cmis.ws.VersioningExceptionType getFaultInfo() {
        return this.versioningException;
    }
}
