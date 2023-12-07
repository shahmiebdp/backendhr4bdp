package com.bdp.backendhr4bdp.mapper;

import com.bdp.backendhr4bdp.domain.BDP_CITY;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {
    @Select("select id, name, state, country from BDP_CITY where state = #{state}")
    BDP_CITY findByState(@Param("state") String state);
}
