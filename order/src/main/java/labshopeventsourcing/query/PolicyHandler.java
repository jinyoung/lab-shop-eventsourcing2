package labshopeventsourcing.query;

import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import labshopeventsourcing.command.*;
import labshopeventsourcing.event.*;
import labshopeventsourcing.aggregate.*;

@Service
@ProcessingGroup("order_Policy")
public class PolicyHandler{

    @EventHandler
    public void wheneverDeliveryStarted_(DeliveryStartedEvent deliveryStarted){
        System.out.println(deliveryStarted.toString());
    }

}
