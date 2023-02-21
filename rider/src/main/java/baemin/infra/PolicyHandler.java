package baemin.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import baemin.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import baemin.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired RiderRepository riderRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Accecpt'")
    public void wheneverAccecpt_LoadDeliveryInfo(@Payload Accecpt accecpt){

        Accecpt event = accecpt;
        System.out.println("\n\n##### listener LoadDeliveryInfo : " + accecpt + "\n\n");


        

        // Sample Logic //
        Rider.loadDeliveryInfo(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Order'")
    public void wheneverOrder_LoadDeliveryInfo(@Payload Order order){

        Order event = order;
        System.out.println("\n\n##### listener LoadDeliveryInfo : " + order + "\n\n");


        

        // Sample Logic //
        Rider.loadDeliveryInfo(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='AddressChanged'")
    public void wheneverAddressChanged_LoadDeliveryInfo(@Payload AddressChanged addressChanged){

        AddressChanged event = addressChanged;
        System.out.println("\n\n##### listener LoadDeliveryInfo : " + addressChanged + "\n\n");


        

        // Sample Logic //
        Rider.loadDeliveryInfo(event);
        

        

    }

}


