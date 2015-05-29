/**
 * QuadServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class QuadServiceServiceLocator extends org.apache.axis.client.Service implements webservice.QuadServiceService {

    public QuadServiceServiceLocator() {
    }


    public QuadServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QuadServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for QuadService
    private java.lang.String QuadService_address = "http://localhost:8080/Quad/services/QuadService";

    public java.lang.String getQuadServiceAddress() {
        return QuadService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String QuadServiceWSDDServiceName = "QuadService";

    public java.lang.String getQuadServiceWSDDServiceName() {
        return QuadServiceWSDDServiceName;
    }

    public void setQuadServiceWSDDServiceName(java.lang.String name) {
        QuadServiceWSDDServiceName = name;
    }

    public webservice.QuadService getQuadService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(QuadService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getQuadService(endpoint);
    }

    public webservice.QuadService getQuadService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservice.QuadServiceSoapBindingStub _stub = new webservice.QuadServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getQuadServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setQuadServiceEndpointAddress(java.lang.String address) {
        QuadService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webservice.QuadService.class.isAssignableFrom(serviceEndpointInterface)) {
                webservice.QuadServiceSoapBindingStub _stub = new webservice.QuadServiceSoapBindingStub(new java.net.URL(QuadService_address), this);
                _stub.setPortName(getQuadServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("QuadService".equals(inputPortName)) {
            return getQuadService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice", "QuadServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice", "QuadService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("QuadService".equals(portName)) {
            setQuadServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
