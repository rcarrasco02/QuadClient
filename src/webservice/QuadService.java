/**
 * QuadService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public interface QuadService extends java.rmi.Remote {
    public java.lang.String getResults(double a, double b, double c) throws java.rmi.RemoteException;
    public java.lang.String getPlotB64(double a, double b, double c) throws java.rmi.RemoteException;
}
