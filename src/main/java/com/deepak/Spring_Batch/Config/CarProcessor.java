package com.deepak.Spring_Batch.Config;

import com.deepak.Spring_Batch.Entity.Car;
import lombok.Data;
import org.springframework.batch.item.ItemProcessor;

@Data
public class CarProcessor implements ItemProcessor<Car, Car> {

    @Override
    public Car process(Car item) throws Exception{
        return item;
    }

}
