package com.nightfire.soap;

import java.rmi.RemoteException;

/**
 * This class implements the WSDL defined SOAPResponseHandlerService interface.
 *
 * The SOAPResponseHandlerService interface denotes SOAP RPC methods that
 * a third party vendor has defined to facilitate the reception of event
 * notifications.
 */
public class SOAPResponseHandlerServiceSoapBindingImpl
        implements SOAPResponseHandlerService {

    /**
     * Processes a received event from third party vendor.
     *
     * @param eventChannelName name of the event
     * @param event contents of the event
     * @throws RemoteException when there is an issue processing the event
     */
    @SuppressWarnings("RedundantThrows")
    public void
    processEvent(String eventChannelName, String event) throws RemoteException {
        String processedEventMessage = String.format(
                "SOAP binding received %s event with the following contents: %s",
                eventChannelName, event);

        System.out.println(processedEventMessage);
    }

}
