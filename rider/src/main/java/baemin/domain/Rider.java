package baemin.domain;

import baemin.domain.FoodPicked;
import baemin.domain.DeleveryFinish;
import baemin.RiderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Rider_table")
@Data

public class Rider  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){


        FoodPicked foodPicked = new FoodPicked(this);
        foodPicked.publishAfterCommit();



        DeleveryFinish deleveryFinish = new DeleveryFinish(this);
        deleveryFinish.publishAfterCommit();

    }

    public static RiderRepository repository(){
        RiderRepository riderRepository = RiderApplication.applicationContext.getBean(RiderRepository.class);
        return riderRepository;
    }




    public static void loadDeliveryInfo(Accecpt accecpt){

        /** Example 1:  new item 
        Rider rider = new Rider();
        repository().save(rider);

        */

        /** Example 2:  finding and process
        
        repository().findById(accecpt.get???()).ifPresent(rider->{
            
            rider // do something
            repository().save(rider);


         });
        */

        
    }
    public static void loadDeliveryInfo(Order order){

        /** Example 1:  new item 
        Rider rider = new Rider();
        repository().save(rider);

        */

        /** Example 2:  finding and process
        
        repository().findById(order.get???()).ifPresent(rider->{
            
            rider // do something
            repository().save(rider);


         });
        */

        
    }
    public static void loadDeliveryInfo(AddressChanged addressChanged){

        /** Example 1:  new item 
        Rider rider = new Rider();
        repository().save(rider);

        */

        /** Example 2:  finding and process
        
        repository().findById(addressChanged.get???()).ifPresent(rider->{
            
            rider // do something
            repository().save(rider);


         });
        */

        
    }


}
