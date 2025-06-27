package org.example.spring.cloud.spring.rest.mappers;

import org.example.spring.cloud.spring.java.services.models.Order;
import org.example.spring.cloud.spring.rest.models.OrderPlaceRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IOrderMapper {

    IOrderMapper INSTANCE = Mappers.getMapper(IOrderMapper.class);

    Order toOrder(OrderPlaceRequest requestParam);

}
