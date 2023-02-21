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
    @Autowired CookingRepository cookingRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Order'")
    public void wheneverOrder_LoadOrderInfo(@Payload Order order){

        Order event = order;
        System.out.println("\n\n##### listener LoadOrderInfo : " + order + "\n\n");


        

        // Sample Logic //
        Cooking.loadOrderInfo(event);
        

        

    }

}


