package com.gustavo.dto.mappers;

import org.mapstruct.Mapper;

import com.gustavo.domains.Aluguel;
import com.gustavo.dto.AluguelRequest;

@Mapper
public interface MapperAluguelRequestToAluguel {

	public Aluguel toModel(AluguelRequest aluguelRequest);
}
