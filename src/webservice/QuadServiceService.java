/**
 * QuadServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public interface QuadServiceService extends javax.xml.rpc.Service {
    public java.lang.String getQuadServiceAddress();

    public webservice.QuadService getQuadService() throws javax.xml.rpc.ServiceException;

    public webservice.QuadService getQuadService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
