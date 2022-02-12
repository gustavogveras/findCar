package com.gustavo.dto.mappers;

import org.mapstruct.Mapper;

import com.gustavo.domains.Cliente;
import com.gustavo.dto.ClienteRequest;

@Mapper
public interface MapperClienteRequestToCliente {

	public Cliente toModel(ClienteRequest clienteRequest);
}
