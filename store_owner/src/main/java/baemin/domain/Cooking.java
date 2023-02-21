package baemin.domain;

import baemin.domain.Accecpt;
import baemin.domain.Rejected;
import baemin.domain.CookStarted;
import baemin.domain.CookFinished;
import baemin.StoreOwnerApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Cooking_table")
@Data

public class Cooking  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private Long orderId;

    @PostPersist
    public void onPostPersist(){


        Accecpt accecpt = new Accecpt(this);
        accecpt.publishAfterCommit();



        Rejected rejected = new Rejected(this);
        rejected.publishAfterCommit();



        CookStarted cookStarted = new CookStarted(this);
        cookStarted.publishAfterCommit();



        CookFinished cookFinished = new CookFinished(this);
        cookFinished.publishAfterCommit();

    }

    public static CookingRepository repository(){
        CookingRepository cookingRepository = StoreOwnerApplication.applicationContext.getBean(CookingRepository.class);
        return cookingRepository;
    }



    public void start(){
    }

    public static void loadOrderInfo(Order order){

        /** Example 1:  new item 
        Cooking cooking = new Cooking();
        repository().save(cooking);

        */

        /** Example 2:  finding and process
        
        repository().findById(order.get???()).ifPresent(cooking->{
            
            cooking // do something
            repository().save(cooking);


         });
        */

        
    }


}
