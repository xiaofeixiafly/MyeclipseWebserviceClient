package com.bpm_to_sap;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * SI_BPM_SAP_ASSET_SEARCH_OUTService service = new SI_BPM_SAP_ASSET_SEARCH_OUTService();
 * SIBPMSAPASSETSEARCHOUT portType = service.getHTTPPort();
 * portType.siBPMSAPASSETSEARCHOUT(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "SI_BPM_SAP_ASSET_SEARCH_OUTService", targetNamespace = "http://bpm_to_sap.com", wsdlLocation = "http://posv5.hspharm.com:50000/dir/wsdl?p=ic/2acaddd83f28325085829ee9f95a80fe")
public class SIBPMSAPASSETSEARCHOUTService extends Service {

	private final static URL SIBPMSAPASSETSEARCHOUTSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(com.bpm_to_sap.SIBPMSAPASSETSEARCHOUTService.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.bpm_to_sap.SIBPMSAPASSETSEARCHOUTService.class
					.getResource(".");
			url = new URL(baseUrl,
					"http://posv5.hspharm.com:50000/dir/wsdl?p=ic/2acaddd83f28325085829ee9f95a80fe");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://posv5.hspharm.com:50000/dir/wsdl?p=ic/2acaddd83f28325085829ee9f95a80fe', retrying as a local file");
			logger.warning(e.getMessage());
		}
		SIBPMSAPASSETSEARCHOUTSERVICE_WSDL_LOCATION = url;
	}

	public SIBPMSAPASSETSEARCHOUTService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public SIBPMSAPASSETSEARCHOUTService() {
		super(SIBPMSAPASSETSEARCHOUTSERVICE_WSDL_LOCATION, new QName(
				"http://bpm_to_sap.com", "SI_BPM_SAP_ASSET_SEARCH_OUTService"));
	}

	/**
	 * 
	 * @return returns SIBPMSAPASSETSEARCHOUT
	 */
	@WebEndpoint(name = "HTTP_Port")
	public SIBPMSAPASSETSEARCHOUT getHTTPPort() {
		return super.getPort(new QName("http://bpm_to_sap.com", "HTTP_Port"),
				SIBPMSAPASSETSEARCHOUT.class);
	}

	/**
	 * 
	 * @return returns SIBPMSAPASSETSEARCHOUT
	 */
	@WebEndpoint(name = "HTTPS_Port")
	public SIBPMSAPASSETSEARCHOUT getHTTPSPort() {
		return super.getPort(new QName("http://bpm_to_sap.com", "HTTPS_Port"),
				SIBPMSAPASSETSEARCHOUT.class);
	}

}
