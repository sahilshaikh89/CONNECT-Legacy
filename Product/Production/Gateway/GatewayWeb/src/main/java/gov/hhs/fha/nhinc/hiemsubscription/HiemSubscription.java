package gov.hhs.fha.nhinc.hiemsubscription;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import org.oasis_open.docs.wsn.bw_2.InvalidFilterFault;
import org.oasis_open.docs.wsn.bw_2.InvalidMessageContentExpressionFault;
import org.oasis_open.docs.wsn.bw_2.InvalidProducerPropertiesExpressionFault;
import org.oasis_open.docs.wsn.bw_2.InvalidTopicExpressionFault;
import org.oasis_open.docs.wsn.bw_2.NotifyMessageNotSupportedFault;
import org.oasis_open.docs.wsn.bw_2.ResourceUnknownFault;
import org.oasis_open.docs.wsn.bw_2.SubscribeCreationFailedFault;
import org.oasis_open.docs.wsn.bw_2.TopicExpressionDialectUnknownFault;
import org.oasis_open.docs.wsn.bw_2.TopicNotSupportedFault;
import org.oasis_open.docs.wsn.bw_2.UnacceptableInitialTerminationTimeFault;
import org.oasis_open.docs.wsn.bw_2.UnrecognizedPolicyRequestFault;
import org.oasis_open.docs.wsn.bw_2.UnsupportedPolicyRequestFault;
import javax.annotation.Resource;
import javax.xml.ws.WebServiceContext;
import javax.jws.HandlerChain;

/**
 *
 * @author Neil Webb
 */
@WebService(serviceName = "NotificationProducerService", portName = "NotificationProducerPort", endpointInterface = "org.oasis_open.docs.wsn.bw_2.NotificationProducer", targetNamespace = "http://docs.oasis-open.org/wsn/bw-2", wsdlLocation = "WEB-INF/wsdl/HiemNotify/NhinSubscription.wsdl")
@HandlerChain(file = "SubscribeSoapHeaderHandler.xml")
@BindingType(value = "http://www.w3.org/2003/05/soap/bindings/HTTP/")
public class HiemSubscription
{
    @Resource
    private WebServiceContext context;

    public org.oasis_open.docs.wsn.b_2.SubscribeResponse subscribe(org.oasis_open.docs.wsn.b_2.Subscribe subscribeRequest) throws InvalidProducerPropertiesExpressionFault, TopicExpressionDialectUnknownFault, SubscribeCreationFailedFault, InvalidMessageContentExpressionFault, UnacceptableInitialTerminationTimeFault, InvalidFilterFault, UnrecognizedPolicyRequestFault, NotifyMessageNotSupportedFault, UnsupportedPolicyRequestFault, InvalidTopicExpressionFault, TopicNotSupportedFault, ResourceUnknownFault
    {
        return new HiemSubscriptionImpl().subscribe(subscribeRequest, context);
    }

}