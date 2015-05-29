package webservice;

public class QuadServiceProxy implements webservice.QuadService {
  private String _endpoint = null;
  private webservice.QuadService quadService = null;
  
  public QuadServiceProxy() {
    _initQuadServiceProxy();
  }
  
  public QuadServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initQuadServiceProxy();
  }
  
  private void _initQuadServiceProxy() {
    try {
      quadService = (new webservice.QuadServiceServiceLocator()).getQuadService();
      if (quadService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)quadService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)quadService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (quadService != null)
      ((javax.xml.rpc.Stub)quadService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservice.QuadService getQuadService() {
    if (quadService == null)
      _initQuadServiceProxy();
    return quadService;
  }
  
  public java.lang.String getResults(double a, double b, double c) throws java.rmi.RemoteException{
    if (quadService == null)
      _initQuadServiceProxy();
    return quadService.getResults(a, b, c);
  }
  
  public java.lang.String getPlotB64(double a, double b, double c) throws java.rmi.RemoteException{
    if (quadService == null)
      _initQuadServiceProxy();
    return quadService.getPlotB64(a, b, c);
  }
  
  
}